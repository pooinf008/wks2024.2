package br.edu.ifba.inf011.model.decorator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;

import br.edu.ifba.inf011.model.Calendario;
import br.edu.ifba.inf011.model.evento.Evento;

public abstract class AbstractCalendarioDecorator implements CalendarioDecorator{
	
	private Calendario calendario;
	
	public AbstractCalendarioDecorator(Calendario calendario) {
		this.calendario = calendario;
	}

	@Override
	public void adicionarEvento(Evento evento) throws Exception {
		this.calendario.adicionarEvento(evento);
	}

	@Override
	public Collection<Evento> from(LocalDateTime inicio, LocalDateTime fim) {
		return this.calendario.from(inicio, fim);
	}

	@Override
	public Collection<Evento> today(LocalDate day) {
		return this.calendario.today(day);
	}

	@Override
	public Collection<Evento> today() {
		return  this.calendario.today();
	}

}
