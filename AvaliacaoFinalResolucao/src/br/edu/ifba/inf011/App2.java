package br.edu.ifba.inf011;

import java.time.LocalDateTime;

import br.edu.ifba.inf011.model.evento.Evento;
import br.edu.ifba.inf011.model.evento.Lembrete;
import br.edu.ifba.inf011.model.evento.TipoEvento;
import br.edu.ifba.inf011.model.notificador.NotificadorEventos;
import br.edu.ifba.inf011.model.notificador.NotificadorHandle;
import br.edu.ifba.inf011.model.notificador.NotificarAltaPrioridadeEMail;
import br.edu.ifba.inf011.model.notificador.NotificarAltaPrioridadeWhatsApp;
import br.edu.ifba.inf011.model.notificador.NotificarBaixaPrioridade;
import br.edu.ifba.inf011.model.notificador.NotificarMediaPrioridadeEMail;
import br.edu.ifba.inf011.proxy.NotificadorMultiModo;
import br.edu.ifba.inf011.proxy.NotificadorMultiEstados;

public class App2 {
	
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
		
		NotificadorMultiModo notificador = new NotificadorMultiEstados(new NotificadorEventos(handle));
		
		notificador.modoAssincrono();
		
		for(Evento evento : eventos) {
			notificador.notificar(evento);
			System.out.println("-----");
		}
		
		notificador.modoDescarte();
		
		System.out.println("DESCARREGANDO");
		
		notificador.descarregar();
		
	}
	
	
	
	public static void main(String[] args) throws Exception {
		new App2().run();
	}

}
