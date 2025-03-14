package br.edu.ifba.inf011.proxy;

import br.edu.ifba.inf011.model.evento.Evento;
import br.edu.ifba.inf011.model.notificador.Notificador;

public interface NotificadorMultiModo extends Notificador{
	public void modoSincrono() throws Exception;
	public void modoAssincrono() throws Exception;
	public void modoDescarte() throws Exception;
	public void notificar(Evento evento) throws Exception;
	public void descarregar() throws Exception;
}
