package br.com.orcamentoconstrucao.modelo;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CLIENTE")
public class Cliente {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "NOME", length = 40, nullable = false)
	private String nome;
	@Column(name = "SEXO", nullable = false)
	private Sexo sexo;
	@Column(name = "data_cadastro", nullable = false)
	private Calendar dataCadastro;
	
	@Column(name = "CPF", length = 40, nullable = false)
	private String cpf;
		
	
	@Column(name = "CNPJ", length = 40, nullable = false)
	private String cnpj;
	@Column(name = "RG", length = 40, nullable = false)
	private String rg;
	@Column(name = "data_nascimento", nullable = true)
	@Temporal(TemporalType.DATE)
	private Calendar dataDeNascimento;
	@Column(name = "TELEFONE", length = 40, nullable = false)
	private String telefone;
	@Column(name = "CELULAR", length = 40, nullable = false)
	private String celular;
	@Column(name = "CONTATO", length = 40, nullable = false)
	private String contato;
	@Column(name = "FONE_CONTATO", nullable = false)
	private String foneContato;
	@Column(name = "CEP", length = 40, nullable = false)
	private int cep;
	@Column(name = "ENDERECO", length = 40, nullable = false)
	private String endereco;
	@Column(name = "NUMERO", length = 40, nullable = false)
	private String numero;
	@Column(name = "COMPLEMENTO", length = 40, nullable = false)
	private String complemento;
	@Column(name = "CIDADE", length = 40, nullable = false)
	private String cidade;
	@Column(name = "BAIRRO", length = 40, nullable = false)
	private String bairro;
	@Column(name = "UF", nullable = false)
	private Uf uf;
	
	public Cliente() {
		super();
	}
}