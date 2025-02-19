package br.edu.ifba.inf011.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;

import br.edu.ifba.inf011.model.evento.Evento;

public interface Calendario {

	public void adicionarEvento(Evento evento) throws Exception;
	public Collection<Evento> from(LocalDateTime inicio, LocalDateTime fim);
	public Collection<Evento> today(LocalDate day);
	public Collection<Evento> today();
	

}
