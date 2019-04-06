// Generated with g9.

package br.com.leorocha.studio.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
@Data
@Entity(name="forma_pagamento")
public class FormaPagamento implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8084843009642842858L;

	/** Primary key. */
    protected static final String PK = "id";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private Integer id;
    @Column(nullable=false, length=250)
    private String nome;
    @Column(nullable=false, length=3)
    private boolean ativo;
}
