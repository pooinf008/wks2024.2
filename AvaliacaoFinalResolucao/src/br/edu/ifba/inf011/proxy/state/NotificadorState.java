package br.edu.ifba.inf011.proxy.state;

import java.util.List;

import br.edu.ifba.inf011.model.evento.Evento;
import br.edu.ifba.inf011.model.notificador.Notificador;

public interface NotificadorState {
	
	public NotificadorState modoAssincrono() throws Exception;
	public NotificadorState modoSincrono() throws Exception;
	public NotificadorState modoDescarte() throws Exception;
	public void notificar(Notificador notificador, Evento evento, List<Evento> eventos) throws Exception;
	public void descarregar(Notificador notificador, List<Evento> eventos) throws Exception;

}
