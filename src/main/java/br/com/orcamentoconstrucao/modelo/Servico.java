package br.com.orcamentoconstrucao.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SERVICO")
public class Servico {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	
	
	@Column(name = "NOME", length = 40, nullable = false)
	private String nome;
	
	@Column(name = "VALOR", length = 40, nullable = false)
	private double valor;
	@Column(name = "TIPO_SERVICO",  nullable = false)
	private TipoServico tipoServico;

	public Servico() {
		
	}

	public Servico(String nome, double valor, TipoServico tipoServico) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.tipoServico = tipoServico;
	}
	
	
}
