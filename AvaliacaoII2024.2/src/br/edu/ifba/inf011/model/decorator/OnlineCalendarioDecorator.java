package br.edu.ifba.inf011.model.decorator;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import br.edu.ifba.inf011.model.Calendario;
import br.edu.ifba.inf011.model.Geolocalizacao;
import br.edu.ifba.inf011.model.evento.Evento;
import br.edu.ifba.inf011.model.evento.Lembrete;

public class OnlineCalendarioDecorator extends AbstractCalendarioDecorator implements CalendarioDecorator{
	
	private String url;
	private List<Evento> eventos;
	
	
	
	public OnlineCalendarioDecorator(Calendario calendario, String url) throws Exception {
		super(calendario);
		this.url = url;
		this.eventos = new ArrayList<Evento>();
		this.consultar();
	}
	
	private void consultar() throws Exception{

		this.eventos.add(new Lembrete("Lembrete vindo de URI: " + url, 
									  LocalDateTime.of(2025, 02, 03, 12, 00), 
									  LocalDateTime.of(2025, 02, 03, 14, 00),
									  5,
									  Geolocalizacao.here()));

		this.eventos.add(new Lembrete("Um Lembrete de agora vindo de URI: " + url, 
				  LocalDateTime.now(), 
				  LocalDateTime.now(),
				  5,
				  Geolocalizacao.here()));
	}
	
	public Collection<Evento> de(LocalDateTime inicio, LocalDateTime fim){
		List<Evento> selecionados = new ArrayList<Evento>();
		for(Evento evento : this.eventos)
			if(evento.iniciaEntre(inicio, fim))
				selecionados.add(evento);
		return selecionados;
	}
	
	public Collection<Evento> dia(LocalDate day){
		List<Evento> selecionados = new ArrayList<Evento>();
		for(Evento evento : this.eventos)
			if(evento.iniciaEm(day))
				selecionados.add(evento);
		return selecionados;
	};
	
	public Collection<Evento> hoje(){
		return this.dia(LocalDate.now());
	}	
	
	@Override
	public Collection<Evento> from(LocalDateTime inicio, LocalDateTime fim) {
		Collection<Evento> interno = super.from(inicio, fim);
		interno.addAll(this.de(inicio, fim));
		return interno;
	}

	@Override
	public Collection<Evento> today(LocalDate day) {
		Collection<Evento> interno = super.today(day);
		interno.addAll(this.dia(day));
		return interno;		
	}

	@Override
	public Collection<Evento> today() {
		Collection<Evento> interno = super.today();
		interno.addAll(this.hoje());
		return interno;	
	}	

}
