package br.com.leorocha.studio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.leorocha.studio.entity.Servico;

@RepositoryRestResource(collectionResourceRel = "servico", path = "servico")
public interface ServicoRepository  extends CrudRepository<Servico, Integer> {
	
}