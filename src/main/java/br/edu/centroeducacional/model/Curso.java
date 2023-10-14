package br.edu.centroeducacional.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="curso", schema="public")
public class Curso {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_CURSO")
	@SequenceGenerator(name="SEQ_CURSO", sequenceName="public.id_seq_curso", allocationSize=1)
	@Column(name="id_curso")
	private Integer id;
	
	@Column(nullable=false, columnDefinition="varchar(180)")
	private String nome;
	
	@Column
	private int cargaHoraria;

	@Column(nullable=false, columnDefinition="varchar(20)")
	private String nivel;
	
	@Column(nullable=false, columnDefinition="varchar(50)")
	private String horario;
	
	@Column
	private String status;
	
	@Column
	private String anoEntrada;

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

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAnoEntrada() {
		return anoEntrada;
	}

	public void setAnoEntrada(String anoEntrada) {
		this.anoEntrada = anoEntrada;
	}
}
