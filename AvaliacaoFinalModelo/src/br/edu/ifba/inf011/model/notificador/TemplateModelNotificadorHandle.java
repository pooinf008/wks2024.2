package br.edu.ifba.inf011.model.notificador;

import br.edu.ifba.inf011.model.evento.Evento;

public abstract class TemplateModelNotificadorHandle implements NotificadorHandle{

	private NotificadorHandle proximo;

	public TemplateModelNotificadorHandle() {
		this(null);
	}
	
	public TemplateModelNotificadorHandle(NotificadorHandle proximo) {
		this.proximo = proximo;
	}
	
	public void setProximo(NotificadorHandle proximo) {
		this.proximo = proximo;
	};
	
	public final void processar(Evento evento) {
		if(this.deveProcessar(evento)){
			this.adicionarAoGoogleCalendar(evento);
			String formatada = this.formatar(evento);
			this.enviar(formatada);
			
		}
		if(this.proximo != null)
			this.proximo.processar(evento);
	};	

	//HOOK
	protected void adicionarAoGoogleCalendar(Evento evento) {
	};

	//PRIMITIVA
	public abstract Boolean deveProcessar(Evento evento);
	protected abstract void enviar(String mensagem);
	protected abstract String formatar(Evento evento);
	
}
