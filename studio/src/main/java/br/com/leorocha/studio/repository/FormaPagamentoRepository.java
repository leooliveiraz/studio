package br.com.leorocha.studio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.leorocha.studio.entity.FormaPagamento;

@RepositoryRestResource(collectionResourceRel = "formapagamento", path = "formapagamento")
public interface FormaPagamentoRepository  extends CrudRepository<FormaPagamento, Integer> {
}