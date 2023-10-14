package br.edu.centroeducacional.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="pessoa", schema="public")
public class Pessoa {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_PESSOA")
	@SequenceGenerator(name="SEQ_PESSOA", sequenceName="public.id_seq_pessoa", allocationSize=1)
	@Column(name="id_pessoa")
	private Integer id;
	
	@Column(nullable=false, columnDefinition="varchar(180)")
	private String nome;
	
	@Column
	private long matricula;
	
	@Column(columnDefinition="varchar(11)",nullable=true)
	private String cpf;
	
	@Column
	private String email;
	
	@Column(columnDefinition="varchar(25)",nullable=true)
	private String celular;
	
	@Column(columnDefinition="varchar(1)")
	private String sexo;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "data_nascimento", columnDefinition="DATE", nullable=true) 
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
