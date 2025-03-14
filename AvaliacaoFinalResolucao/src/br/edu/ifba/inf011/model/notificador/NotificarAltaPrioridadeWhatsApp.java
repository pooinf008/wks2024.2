package br.edu.ifba.inf011.model.notificador;

import java.time.LocalDate;

import br.edu.ifba.inf011.model.evento.Evento;

public class NotificarAltaPrioridadeWhatsApp extends TemplateModelNotificadorHandle implements NotificadorHandle{

	public NotificarAltaPrioridadeWhatsApp(NotificadorHandle proximo) {
		super(proximo);
	}
	
	
	public NotificarAltaPrioridadeWhatsApp() {
		super();
	}
	
	@Override
	public Boolean deveProcessar(Evento evento) {
		return evento.getPrioridade() == 10 && evento.iniciaEm(LocalDate.now());
	}

	@Override
	protected void enviar(String mensagem) {
		System.out.println("[WHATSAPP] : " + mensagem);
	}

	@Override
	protected String formatar(Evento evento) {
		String str = evento.getDescricao();
		return "[Handle " + this.getClass().getSimpleName() + "]:" +  str + " formatada para whatsapp";
	}
	
	@Override
	protected void adicionarAoGoogleCalendar(Evento evento) {
		System.out.println("Adicionando ao GOOGLE CALENDAR " + this.formatar(evento));
	};	


}
