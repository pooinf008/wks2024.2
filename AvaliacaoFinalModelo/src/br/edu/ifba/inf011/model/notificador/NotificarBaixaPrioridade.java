package br.edu.ifba.inf011.model.notificador;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import br.edu.ifba.inf011.model.evento.Evento;

public class NotificarBaixaPrioridade extends TemplateModelNotificadorHandle implements NotificadorHandle{

	public NotificarBaixaPrioridade(NotificadorHandle proximo) {
		super(proximo);
	}
	
	public NotificarBaixaPrioridade() {
		super();
	}
	
	@Override
	public Boolean deveProcessar(Evento evento) {
		return evento.getPrioridade() >= 1 && evento.getPrioridade() < 5 &&
			   evento.iniciaEntre(LocalDateTime.now().minus(2, ChronoUnit.DAYS),
					   			  LocalDateTime.now());

	}

	@Override
	protected void enviar(String mensagem) {
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
