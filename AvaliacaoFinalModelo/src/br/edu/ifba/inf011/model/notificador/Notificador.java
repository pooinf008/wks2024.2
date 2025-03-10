package br.edu.ifba.inf011.model.notificador;

import br.edu.ifba.inf011.model.evento.Evento;

public interface Notificador{
	
	public void notificar(Evento evento) throws Exception;

}
