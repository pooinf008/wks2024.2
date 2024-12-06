package br.edu.ifba.inf011.model;

import java.time.LocalDateTime;

public interface Evento {
	
	public boolean sobreposto(Evento evento);
	public String getDescricao();
	public LocalDateTime getInicio();
	public LocalDateTime getTermino();
	public Integer getPrioridade();
	public Geolocalizacao getLocalizacao();	

}
