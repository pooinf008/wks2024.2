package br.edu.ifba.inf011;

import br.edu.ifba.inf011.model.notificador.Notificador;
import br.edu.ifba.inf011.model.notificador.NotificadorEventos;
import br.edu.ifba.inf011.model.notificador.NotificadorHandle;
import br.edu.ifba.inf011.model.notificador.TipoNotificador;
import br.edu.ifba.inf011.proxy.NotificadorMultiEstados;

public class NotificadorFactory {
	
	private NotificadorHandle handle;
	
	public void setHandle(NotificadorHandle handle) {
		this.handle = handle;
	}
	
	
	public Notificador create(TipoNotificador tipo) {
		if(tipo == TipoNotificador.SIMPLES)
			return new NotificadorEventos(this.handle);
		if(tipo == TipoNotificador.MULTIMODO)
			return new NotificadorMultiEstados(new NotificadorEventos(this.handle));
		return null;
			
	}

}
