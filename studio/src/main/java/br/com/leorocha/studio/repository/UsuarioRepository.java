package br.com.leorocha.studio.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.leorocha.studio.entity.Usuario;



@Repository
public interface UsuarioRepository  extends CrudRepository<Usuario, Integer> {	
	List<Usuario> findByUsuario(String nome);
}












