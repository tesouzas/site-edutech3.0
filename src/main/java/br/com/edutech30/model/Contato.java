package br.com.edutech30.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String logradouro;

	@Column(nullable = false)
	private String cidade;

	@Column(nullable = false)
	private String estado;

	@Column(nullable = false)
	private String assunto;

	@Column(nullable = false)
	private String mensagem;

	public Contato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contato(Long id, String nome, String email, String logradouro, String cidade, String estado, String assunto,
			String mensagem) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.estado = estado;
		this.assunto = assunto;
		this.mensagem = mensagem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public int hashCode() {
		return Objects.hash(assunto, cidade, email, estado, id, logradouro, mensagem, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(assunto, other.assunto) && Objects.equals(cidade, other.cidade)
				&& Objects.equals(email, other.email) && Objects.equals(estado, other.estado)
				&& Objects.equals(id, other.id) && Objects.equals(logradouro, other.logradouro)
				&& Objects.equals(mensagem, other.mensagem) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", email=" + email + ", logradouro=" + logradouro + ", cidade="
				+ cidade + ", estado=" + estado + ", assunto=" + assunto + ", mensagem=" + mensagem + "]";
	}

}
