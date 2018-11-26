package br.com.leorocha.studio.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.leorocha.studio.entity.Cliente;

@RepositoryRestResource(collectionResourceRel = "cliente", path = "cliente")
public interface ClienteRepository  extends CrudRepository<Cliente, Integer> {
	List<Cliente> findByNome(@Param("nome") String nome);
}