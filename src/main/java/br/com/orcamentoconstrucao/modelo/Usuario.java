package br.com.orcamentoconstrucao.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// @NotEmpty(message = "Campo Obrigatório")

	@Column(name = "login", length = 40)
	private String login;

	// @NotEmpty(message = "Campo Obrigatório")
	// @Size(min = 8, max = 20, message = "A senha deve conter de 8 à 20
	// caracteres")
	@Column(name = "senha", length = 20)
	private String senha;

	@Column(name = "sexo", length = 10, nullable = false)
	private String sexo;
	// private Sexo sexo;

	@Column(name = "data_nascimento", nullable = true)
	@Temporal(TemporalType.DATE)
	private String dataNascimento;
	// private Calendar dataNascimento;

	@Column(name = "data_cadastro", nullable = true)
	@Temporal(TemporalType.DATE)
	private String dataCadastro;
	// private Calendar dataCadastro;

	@Column(name = "telefone", length = 40, nullable = false)
	private String teleforne;

	@Column(name = "email", length = 40, nullable = false)
	private String email;

	@Column(name = "nivel_ierarquico", length = 40, nullable = false)
	private String nivelIerarquico;
	// private NivelIerarquico nivelIerarquico;

	public Usuario() {
		super();
	}

	public Usuario(String login, String senha, String sexo, String dataNascimento, String dataCadastro,
			String teleforne, String email, String nivelIerarquico) {
		super();
		this.login = login;
		this.senha = senha;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.dataCadastro = dataCadastro;
		this.teleforne = teleforne;
		this.email = email;
		this.nivelIerarquico = nivelIerarquico;
	}
}