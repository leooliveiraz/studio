package br.com.leorocha.studio.util;


import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import br.com.leorocha.studio.entity.Usuario;
import br.com.leorocha.studio.security.jwt.TokenAuthenticationService;
import br.com.leorocha.studio.security.service.UsuarioService;
@Component
public class AuthUtil {
	@Autowired
	private   UsuarioService usuarioService;

	private static  UsuarioService staticUsuarioService;

	public static String retornaEmailLogado(String authorization) {
		Authentication auth = TokenAuthenticationService.getByToken(authorization);
		String email = auth.getPrincipal().toString();
		return email;
	}

	public static Usuario retornaUsuarioLogado(String authorization) {
		String email = retornaEmailLogado(authorization);
		Usuario usuario = staticUsuarioService.encontrar(email);
		return usuario;		
	}


	@PostConstruct
	private void init() {
		staticUsuarioService = this.usuarioService;
	}


}
