
package labschool.models;

import java.io.Serializable;
import java.util.Date;
/*
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.MappedSuperclass;

	@MappedSuperclass
	public abstract class Pessoa implements Serializable{

		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)*/

public abstract class Pessoa {

	public Long codigo;
	protected String nome;
	protected String telefone;
	protected Date dataNascimento;
	protected String Cpf;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public String getCpf() {
		return Cpf;
	}

}
