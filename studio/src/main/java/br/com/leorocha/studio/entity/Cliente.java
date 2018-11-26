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
@Entity(name="cliente")
public class Cliente implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6762492659507278452L;

	/** Primary key. */
    protected static final String PK = "id";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private Integer id;
    @Column(nullable=false, length=250)
    private String nome;
    @Column(length=250)
    private String contato;
    @Column(length=500)
    private String descricao;
    @Column(name="preencheu_anamnese", nullable=false, length=3)
    private boolean preencheuAnamnese;
    @Column(nullable=false, length=3)
    private boolean ativo;
    @OneToMany(mappedBy="cliente")
    private List<Agendamento> agendamento;

}
