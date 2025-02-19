package br.edu.ifba.inf011.model;

import java.time.LocalDateTime;

public interface Aula {
	public String getCodDisciplina();
	public String getDescricaoDisciplina();
	public String getProfessor();
	public Geolocalizacao getSala();
	public LocalDateTime getHorario();
}
