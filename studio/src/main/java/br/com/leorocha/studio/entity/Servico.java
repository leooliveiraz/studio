// Generated with g9.

package br.com.leorocha.studio.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity(name="servico")
public class Servico implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1348798773012228465L;

	/** Primary key. */
    protected static final String PK = "id";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private Integer id;
    @Column(nullable=false, length=250)
    private String nome;
    @Column(length=250)
    private String descricao;
    @Column(precision=10, scale=2)
    private BigDecimal valor;
    @Column(nullable=false, length=3)
    private boolean ativo;
    @OneToMany(mappedBy="servico")
    private List<AgendamentoServico> agendamentoServico;
}
