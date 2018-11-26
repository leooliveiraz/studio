package br.com.leorocha.studio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.leorocha.studio.entity.AgendamentoServico;

@RepositoryRestResource(collectionResourceRel = "agendamentoservico", path = "agendamentoservico")
public interface AgendamentoServicoRepository  extends CrudRepository<AgendamentoServico, Integer> {
	
}