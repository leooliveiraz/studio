package br.com.leorocha.studio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import br.com.leorocha.studio.entity.Usuario;
import br.com.leorocha.studio.repository.UsuarioRepository;
import br.com.leorocha.studio.util.SenhaUtil;


@Service
public class UsuarioService {
	@Autowired 
	UsuarioRepository usuarioRepository;

	public UserDetails buscarPorUsuario(String usuario) {
		Usuario u =	usuarioRepository.findByUsuario(usuario).get(0);
		return u;
	}
	
	public void salvar(Usuario usuario) {
		try {
			usuario.setSenha(SenhaUtil.criptografarSHA2(usuario.getSenha()));
			usuarioRepository.save(usuario);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void alterar(Usuario usuario) {
		Usuario usuarioValidacao = encontrar(usuario.getUsuario());
		if(!usuario.getSenha().equals(usuarioValidacao.getSenha())) {
			usuario.setSenha(SenhaUtil.criptografarSHA2(usuario.getSenha()));
		}
		usuarioRepository.save(usuario);
	}

	public List<Usuario> listar() {
		List<Usuario> usuarios = new ArrayList<>();
		usuarioRepository.findAll().forEach(usuario-> usuarios.add(usuario));
		return usuarios;
	}
	public Usuario encontrar(String email) {
		List<Usuario> usuarios = usuarioRepository.findByUsuario(email);
		if(usuarios != null && !usuarios.isEmpty()) {
			Usuario usuario = usuarios.get(0);
			return usuario;
		}else {
			return null;
		}
	}
	

	public Boolean verificaExistencia(Usuario usuario) {
		try {
			Usuario usuarioExiste = usuarioRepository.findByUsuario(usuario.getUsuario()).get(0);
			if(usuarioExiste !=null)
				if(usuarioExiste.getUsuario()!=null)
					if(!usuarioExiste.getUsuario().isEmpty())
						return Boolean.TRUE;
			return Boolean.FALSE;
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		
	}

}
