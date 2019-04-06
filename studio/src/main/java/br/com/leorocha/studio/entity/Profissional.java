// Generated with g9.

package br.com.leorocha.studio.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity(name="profissional")
public class Profissional implements Serializable {

	private static final long serialVersionUID = -5265476290615222908L;

    protected static final String PK = "id";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private Integer id;
    @Column(nullable=false, length=250)
    private String nome;
    @Column(length=500)
    private String descricao;
    @Column(nullable=false, length=3)
    private boolean ativo;
}
