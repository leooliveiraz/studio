package br.com.leorocha.studio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.leorocha.studio.entity.Agendamento;
@RestResource(exported = false)
@RepositoryRestResource(collectionResourceRel = "agendamento", path = "agendamento")
public interface AgendamentoRepository  extends CrudRepository<Agendamento, Integer> {

}