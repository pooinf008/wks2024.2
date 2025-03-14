package br.edu.ifba.inf011.proxy.state;

import java.util.List;

import br.edu.ifba.inf011.model.evento.Evento;
import br.edu.ifba.inf011.model.notificador.Notificador;

public class AssincronoState extends AbstractNotificadorState  implements NotificadorState{

	@Override
	public void notificar(Notificador notificador, Evento evento, List<Evento> eventos) throws Exception {
		eventos.add(evento);
	}

	@Override
	public void descarregar(Notificador notificador, List<Evento> eventos) throws Exception {
		for(Evento e : eventos)
			notificador.notificar(e);
		eventos.clear();
	}
	
	@Override
	public NotificadorState modoSincrono() throws Exception {
		return new SincronoState();
	}

	@Override
	public NotificadorState modoDescarte() throws Exception {
		return new DescarteState();
	}



}
