package br.com.leorocha.studio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.leorocha.studio.entity.Profissional;

@RepositoryRestResource(collectionResourceRel = "profissional", path = "profissional")
public interface ProfissionalRepository  extends CrudRepository<Profissional, Integer> {
	
}