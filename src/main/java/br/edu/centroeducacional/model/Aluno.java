package br.edu.centroeducacional.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="aluno", schema="public")
public class Aluno extends Pessoa {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_ALUNO")
	@SequenceGenerator(name="SEQ_ALUNO", sequenceName="public.id_seq_aluno", allocationSize=1)
	@Column(name="id_aluno")
	private Integer id;
	
	@ManyToMany
	private List<Curso> cursos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
}
