package br.edu.ifba.inf011;

import java.time.LocalDateTime;

import br.edu.ifba.inf011.model.evento.Evento;
import br.edu.ifba.inf011.model.evento.Lembrete;
import br.edu.ifba.inf011.model.evento.TipoEvento;
import br.edu.ifba.inf011.model.notificador.Notificador;
import br.edu.ifba.inf011.model.notificador.NotificadorEventos;
import br.edu.ifba.inf011.model.notificador.NotificadorHandle;
import br.edu.ifba.inf011.model.notificador.NotificarAltaPrioridadeEMail;
import br.edu.ifba.inf011.model.notificador.NotificarAltaPrioridadeWhatsApp;
import br.edu.ifba.inf011.model.notificador.NotificarBaixaPrioridade;
import br.edu.ifba.inf011.model.notificador.NotificarMediaPrioridadeEMail;

public class App {
	
	public void run() throws Exception {
		
		Evento lembreteAlta = Lembrete.builder()
									  .setInicio(LocalDateTime.now())
									  .setPrioridade(10)
									  .build(TipoEvento.LEMBRETE, "Alta Prioridade");
		
		Evento lembreteMedia = Lembrete.builder()
				                       .setInicio(LocalDateTime.now())
				                       .setPrioridade(7)
				                       .build(TipoEvento.LEMBRETE, "Media Prioridade");

		
		Evento lembreteBaixa = Lembrete.builder()
                					   .setInicio(LocalDateTime.now())
                					   .setPrioridade(2)
                					   .build(TipoEvento.LEMBRETE, "Baixa Prioridade");

		Evento[] eventos = {lembreteAlta, lembreteMedia, lembreteBaixa};
		
		
		NotificadorHandle handle = new NotificarAltaPrioridadeWhatsApp(
										new NotificarAltaPrioridadeEMail(
												new NotificarMediaPrioridadeEMail(
													new NotificarBaixaPrioridade())));
		
		Notificador notificador = new NotificadorEventos(handle);
		
		for(Evento evento : eventos) {
			notificador.notificar(evento);
			System.out.println("-----");
		}
		
		
	}
	
	
	
	public static void main(String[] args) throws Exception {
		new App().run();
	}

}
