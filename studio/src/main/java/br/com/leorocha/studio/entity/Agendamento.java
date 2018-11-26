// Generated with g9.

package br.com.leorocha.studio.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
@Data
@Entity(name="agendamento")
public class Agendamento implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7962598894894709684L;

	/** Primary key. */
    protected static final String PK = "id";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private Integer id;
    private LocalDate data;
    private LocalTime horario;
    @Column(nullable=false, length=3)
    private boolean ativo;
    @Column(nullable=false, length=3)
    private boolean pago;
    @ManyToOne(optional=false)
    @JoinColumn(name="id_cliente", nullable=false)
    private Cliente cliente;
    @ManyToOne(optional=false)
    @JoinColumn(name="id_forma_pagamento", nullable=false)
    private FormaPagamento formaPagamento;
    @OneToMany(mappedBy="agendamento")
    private Set<AgendamentoServico> agendamentoServico;
}
