package br.com.leorocha.studio.security.jwt;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.leorocha.studio.security.service.UsuarioService;


@Service
public class AuthService implements UserDetailsService{
	@Autowired
	UsuarioService usuarioService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDetails user = usuarioService.buscarPorUsuario(username);
		return user;
	}
	
}
