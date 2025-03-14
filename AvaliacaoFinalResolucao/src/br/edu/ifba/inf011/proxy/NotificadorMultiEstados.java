package br.edu.ifba.inf011.proxy;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.model.evento.Evento;
import br.edu.ifba.inf011.model.notificador.Notificador;
import br.edu.ifba.inf011.proxy.state.NotificadorState;
import br.edu.ifba.inf011.proxy.state.SincronoState;

public class NotificadorMultiEstados implements NotificadorMultiModo{

	public Notificador notificador;
	public NotificadorState notificadorState;
	public List<Evento> eventos;
	
	
	public NotificadorMultiEstados(Notificador notificador) {
		this.notificador = notificador;
		this.eventos = new ArrayList<Evento>();
		this.notificadorState = new SincronoState();
	}
	
	@Override
	public void notificar(Evento evento) throws Exception {
		this.notificadorState.notificar(this.notificador, evento, this.eventos);
	}
	
	@Override
	public void descarregar() throws Exception {
		this.notificadorState.descarregar(notificador, this.eventos);		
	}

	@Override
	public void modoSincrono() throws Exception {
		this.notificadorState = this.notificadorState.modoSincrono();
	}

	@Override
	public void modoAssincrono() throws Exception {
		this.notificadorState = this.notificadorState.modoAssincrono();
	}
	
	@Override
	public void modoDescarte() throws Exception {
		this.notificadorState = this.notificadorState.modoDescarte();
	}


	

	
	
	

}
