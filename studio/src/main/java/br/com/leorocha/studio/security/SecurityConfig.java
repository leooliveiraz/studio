package br.com.leorocha.studio.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import br.com.leorocha.studio.security.jwt.AuthService;
import br.com.leorocha.studio.security.jwt.JWTAuthenticationFilter;
import br.com.leorocha.studio.security.jwt.JWTLoginFilter;
import br.com.leorocha.studio.util.SenhaUtil;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.csrf().disable().authorizeRequests()
			.antMatchers("/").permitAll()
			.antMatchers(HttpMethod.POST, "/login").permitAll()
			.anyRequest().authenticated()
			.and()
			
			// filtra requisições de login
			.addFilterBefore(new JWTLoginFilter("/login", authenticationManager()),
	                UsernamePasswordAuthenticationFilter.class)
			
			// filtra outras requisições para verificar a presença do JWT no header
			.addFilterBefore(new JWTAuthenticationFilter(),
	                UsernamePasswordAuthenticationFilter.class);
	}
	
	@Autowired
	private AuthService authService;
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(authService)
		.passwordEncoder(new SenhaUtil());
	}
}