package br.edu.ifba.inf011.model.evento;

import java.time.LocalDate;
import java.time.LocalDateTime;

import br.edu.ifba.inf011.model.Geolocalizacao;

public interface Evento {
	
	public boolean sobreposto(Evento evento);
	public String getDescricao();
	public LocalDateTime getInicio();
	public LocalDateTime getTermino();
	public Integer getPrioridade();
	public Geolocalizacao getLocalizacao();	
	public boolean iniciaEm(LocalDate timestamp);
	public boolean iniciaEntre(LocalDateTime inicio, LocalDateTime fim);

}
