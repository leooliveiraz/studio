// Generated with g9.

package br.com.leorocha.studio.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;

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
    private String cliente;
    @ManyToOne(targetEntity=Profissional.class, fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private Profissional profissional;
    @ManyToOne(targetEntity=FormaPagamento.class, fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private FormaPagamento formaPagamento;
    @Column(nullable=false, length=3)
    private boolean ativo;
    @Column(nullable=false, length=3)
    private boolean pago;
    @Column(name="preencheu_anamnese", nullable=false, length=3)
    private boolean preencheuAnamnese;
    
    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate data;
    @JsonFormat(pattern = "HH:mm", shape = JsonFormat.Shape.STRING, timezone = "America/Sao_Paulo")
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    @JsonSerialize(using=LocalTimeSerializer.class)
    private LocalTime horario;
    private BigDecimal valor;
    
    
    @OneToMany(mappedBy="agendamento")
    private Set<AgendamentoServico> agendamentoServico;
}
