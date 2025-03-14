package br.edu.ifba.inf011.proxy.state;

import java.util.List;

import br.edu.ifba.inf011.model.evento.Evento;
import br.edu.ifba.inf011.model.notificador.Notificador;

public class SincronoState extends AbstractNotificadorState  implements NotificadorState{

	@Override
	public void notificar(Notificador notificador, Evento evento, List<Evento> eventos) throws Exception {
		notificador.notificar(evento);
	}

	@Override
	public void descarregar(Notificador notificador, List<Evento> eventos) throws Exception {
		for(Evento e : eventos)
			notificador.notificar(e);
		eventos.clear();
	}
	
	
	@Override
	public NotificadorState modoAssincrono() throws Exception {
		return new AssincronoState();
	}	

}
