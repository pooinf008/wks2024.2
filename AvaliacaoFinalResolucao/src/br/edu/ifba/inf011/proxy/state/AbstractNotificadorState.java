package br.edu.ifba.inf011.proxy.state;

import java.util.List;

import br.edu.ifba.inf011.model.evento.Evento;
import br.edu.ifba.inf011.model.notificador.Notificador;

public abstract class AbstractNotificadorState implements NotificadorState{

	@Override
	public NotificadorState modoAssincrono() throws Exception {
		return this;
	}

	@Override
	public NotificadorState modoSincrono() throws Exception {
		return this;
	}

	@Override
	public NotificadorState modoDescarte() throws Exception {
		return this;
	}
	
	@Override
	public void notificar(Notificador notificador, Evento evento, List<Evento> eventos) throws RuntimeException, Exception{
		throw new RuntimeException("Operação Não Suportada");
	};
	
	@Override
	public void descarregar(Notificador notificador, List<Evento> eventos) throws RuntimeException, Exception{
		throw new RuntimeException("Operação Não Suportada");
	};
	

}
