package br.edu.ifba.inf011.proxy.state;

import java.util.List;

import br.edu.ifba.inf011.model.evento.Evento;
import br.edu.ifba.inf011.model.notificador.Notificador;

public class DescarteState extends AbstractNotificadorState implements NotificadorState {


	@Override
	public NotificadorState modoSincrono() throws Exception {
		return new SincronoState();
	}

	@Override
	public void notificar(Notificador notificador, Evento evento, List<Evento> eventos) throws Exception {
	}

	@Override
	public void descarregar(Notificador notificador, List<Evento> eventos) throws Exception {
		eventos.clear();
	}

}
