// Generated with g9.

package br.com.leorocha.studio.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Data
@Entity(name="agendamento_servico")
public class AgendamentoServico implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -5131867034783293614L;

	/** Primary key. */
    protected static final String PK = "id";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private Integer id;
    @Column(nullable=false, precision=10, scale=2)
    private BigDecimal valor;
    @Column(nullable=false, length=3)
    private boolean ativo;
    @ManyToOne(optional=false)
    @JoinColumn(name="id_agendamento", nullable=false)
    private Agendamento agendamento;
    @ManyToOne(optional=false)
    @JoinColumn(name="id_servico", nullable=false)
    private Servico servico;

}
