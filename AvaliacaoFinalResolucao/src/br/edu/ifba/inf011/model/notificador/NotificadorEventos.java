package br.edu.ifba.inf011.model.notificador;

import br.edu.ifba.inf011.model.evento.Evento;

public class NotificadorEventos implements Notificador{

	public NotificadorHandle notificador;
	
	public NotificadorEventos(NotificadorHandle notificador) {
		this.notificador = notificador;
	}
	
	public void notificar(Evento evento) {
		this.notificador.processar(evento);
	}
	

}
