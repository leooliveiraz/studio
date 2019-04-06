// Generated with g9.

package br.com.leorocha.studio.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity(name="servico_profissional")
public class ServicoProfissional implements Serializable {

	private static final long serialVersionUID = -1348798773012228465L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private Integer id;
    @ManyToOne(targetEntity=Profissional.class, fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private Profissional profissional;
    @ManyToOne(targetEntity=Servico.class, fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private Servico servico;
    @Column(nullable=false, precision=10, scale=2)
    private BigDecimal valor;
}
