package br.com.edutech30.model;

import java.util.Arrays;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table
public class EnviarMaterial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String cpf;

	@Column(nullable = false)
	private String telefone;

	@Column(nullable = false)
	private String cidade;

	@Column(nullable = false)
	private String estado;

	@Column(nullable = false)
	private String resumo;

	@Column(nullable = false)
	private String institutoEnsino;

	@Column(nullable = false)
	private String disciplina;

	@Column(nullable = false)
	private String rede;

	@Column(nullable = false)
	private String tipoConteudo;

	@Column(nullable = false)
	private String descricao;

	@Lob
	private byte[] arquivo;

	public EnviarMaterial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EnviarMaterial(Long id, String nome, String email, String cpf, String telefone, String cidade, String estado,
			String resumo, String institutoEnsino, String disciplina, String rede, String tipoConteudo,
			String descricao, byte[] arquivo) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.telefone = telefone;
		this.cidade = cidade;
		this.estado = estado;
		this.resumo = resumo;
		this.institutoEnsino = institutoEnsino;
		this.disciplina = disciplina;
		this.rede = rede;
		this.tipoConteudo = tipoConteudo;
		this.descricao = descricao;
		this.arquivo = arquivo;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
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

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getInstitutoEnsino() {
		return institutoEnsino;
	}

	public void setInstitutoEnsino(String institutoEnsino) {
		this.institutoEnsino = institutoEnsino;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getRede() {
		return rede;
	}

	public void setRede(String rede) {
		this.rede = rede;
	}

	public String getTipoConteudo() {
		return tipoConteudo;
	}

	public void setTipoConteudo(String tipoConteudo) {
		this.tipoConteudo = tipoConteudo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public byte[] getArquivo() {
		return arquivo;
	}

	public void setArquivo(byte[] arquivo) {
		this.arquivo = arquivo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(arquivo);
		result = prime * result + Objects.hash(cidade, cpf, descricao, disciplina, email, estado, id, institutoEnsino,
				nome, rede, resumo, telefone, tipoConteudo);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EnviarMaterial other = (EnviarMaterial) obj;
		return Arrays.equals(arquivo, other.arquivo) && Objects.equals(cidade, other.cidade)
				&& Objects.equals(cpf, other.cpf) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(disciplina, other.disciplina) && Objects.equals(email, other.email)
				&& Objects.equals(estado, other.estado) && Objects.equals(id, other.id)
				&& Objects.equals(institutoEnsino, other.institutoEnsino) && Objects.equals(nome, other.nome)
				&& Objects.equals(rede, other.rede) && Objects.equals(resumo, other.resumo)
				&& Objects.equals(telefone, other.telefone) && Objects.equals(tipoConteudo, other.tipoConteudo);
	}

	@Override
	public String toString() {
		return "EnviarMaterial [id=" + id + ", nome=" + nome + ", email=" + email + ", cpf=" + cpf + ", telefone="
				+ telefone + ", cidade=" + cidade + ", estado=" + estado + ", resumo=" + resumo + ", institutoEnsino="
				+ institutoEnsino + ", disciplina=" + disciplina + ", rede=" + rede + ", tipoConteudo=" + tipoConteudo
				+ ", descricao=" + descricao + ", arquivo=" + Arrays.toString(arquivo) + "]";
	}

}
