package br.edu.ifba.inf011.model.fm;

import java.time.LocalDate;
import java.time.LocalDateTime;

import br.edu.ifba.inf011.model.Calendario;
import br.edu.ifba.inf011.model.Geolocalizacao;
import br.edu.ifba.inf011.model.builder.Equipe;
import br.edu.ifba.inf011.model.builder.Partida;

public abstract class AplicacaoCalendario {
	
	public void run1() throws Exception {
		
		Calendario calendario = this.createCalendario();
		
		calendario.download("calendar.ifba.edu.br");
		calendario.sinalizarEventos(LocalDate.of(LocalDate.now().getYear(),
												 LocalDate.now().getMonth(),
												 1));
	}
	
	public void run2() {
		Partida final1970 = Partida.builder()
		  	   					  .setInicio(LocalDateTime.of(1970, 6, 21, 12, 0))
		  	   					  .setLocalizacao(new Geolocalizacao("Estádio Azteca - Cidade do México"))
		  	   					  .setPlacar(4, 1)
		  	   					  .build("Final da Copa do Mundo de 1970", new Equipe("Brasil"), new Equipe("Italia"));
		
		System.out.println(final1970);
	}

	public void run() throws Exception {
		this.run1();
		this.run2();
	}

	protected abstract Calendario createCalendario();
	
	

}
