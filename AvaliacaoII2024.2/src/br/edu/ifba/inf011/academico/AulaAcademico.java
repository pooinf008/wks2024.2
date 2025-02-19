package br.edu.ifba.inf011.academico;

import java.time.LocalDateTime;

import br.edu.ifba.inf011.model.Aula;
import br.edu.ifba.inf011.model.Geolocalizacao;

public class AulaAcademico implements Aula{
	
	private String codDisciplina;
	private String descricaoDisciplina;
	private String professor;
	private Geolocalizacao sala;
	private LocalDateTime horario;
	
	
	
	public AulaAcademico(String codDisciplina, String descricaoDisciplina, String professor, Geolocalizacao sala,
			LocalDateTime horario) {
		super();
		this.codDisciplina = codDisciplina;
		this.descricaoDisciplina = descricaoDisciplina;
		this.professor = professor;
		this.sala = sala;
		this.horario = horario;
	}
	
	public String getCodDisciplina() {
		return codDisciplina;
	}
	public void setCodDisciplina(String codDisciplina) {
		this.codDisciplina = codDisciplina;
	}
	public String getDescricaoDisciplina() {
		return descricaoDisciplina;
	}
	public void setDescricaoDisciplina(String descricaoDisciplina) {
		this.descricaoDisciplina = descricaoDisciplina;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public Geolocalizacao getSala() {
		return sala;
	}
	public void setSala(Geolocalizacao sala) {
		this.sala = sala;
	}
	public LocalDateTime getHorario() {
		return horario;
	}
	public void setHorario(LocalDateTime hoario) {
		this.horario = hoario;
	}
	
	
	

}
