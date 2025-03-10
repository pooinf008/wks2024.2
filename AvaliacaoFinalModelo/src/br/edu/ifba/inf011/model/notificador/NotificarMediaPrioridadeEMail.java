package br.edu.ifba.inf011.model.notificador;

import java.time.LocalDate;

import br.edu.ifba.inf011.model.evento.Evento;

public class NotificarMediaPrioridadeEMail extends TemplateModelNotificadorHandle implements NotificadorHandle{

	public NotificarMediaPrioridadeEMail(NotificadorHandle proximo) {
		super(proximo);
	}
	
	public NotificarMediaPrioridadeEMail() {
		super();
	}
	
	@Override
	public Boolean deveProcessar(Evento evento) {
		return evento.getPrioridade() >= 5 && evento.getPrioridade() < 10 &&
			   evento.iniciaEm(LocalDate.now());

	}

	@Override
	protected void enviar(String mensagem) {
		System.out.println("[EMAIL] : " + mensagem);
	}

	@Override
	protected String formatar(Evento evento) {
		String str = evento.getDescricao();
		return "[Handle " + this.getClass().getSimpleName() + "]:" + str + " formatada para e-mail";
	}
	
	@Override
	protected void adicionarAoGoogleCalendar(Evento evento) {
		System.out.println("Adicionando ao GOOGLE CALENDAR " + this.formatar(evento));
	};	

}
