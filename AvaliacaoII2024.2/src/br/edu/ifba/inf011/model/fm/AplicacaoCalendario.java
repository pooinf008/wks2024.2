package br.edu.ifba.inf011.model.fm;

import java.util.Collection;

import br.edu.ifba.inf011.model.Calendario;
import br.edu.ifba.inf011.model.evento.Evento;

public abstract class AplicacaoCalendario {

	private Calendario calendario;
	

	public  AplicacaoCalendario() {
		this.calendario = this.createCalendario();
	}
	
	
	public void adicionarEvento(Evento evento) throws Exception {
		this.calendario.adicionarEvento(evento);
	}
	
	
	public Collection<Evento> today() {
		return this.calendario.today();
	}	
	
	
	protected abstract Calendario createCalendario();
	
	

}
