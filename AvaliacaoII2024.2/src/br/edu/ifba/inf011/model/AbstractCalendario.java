package br.edu.ifba.inf011.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import br.edu.ifba.inf011.model.evento.Evento;

public class AbstractCalendario implements Calendario{
	
	protected Integer mes;
	protected Integer ano;
	protected String eMail;
	protected List<Evento> eventos;
	
	public AbstractCalendario(String eMail, Integer mes, Integer ano) {
		this.eMail = eMail;
		this.mes = mes;
		this.ano = ano;
		this.eventos = new ArrayList<Evento>();
	}

	@Override
	public void adicionarEvento(Evento evento) throws Exception {
		if(!podeAdicionar(evento))
			throw new Exception("Evento não pode ser adicionado");
		this.eventos.add(evento);
	}

	protected boolean podeAdicionar(Evento e) {
		for(Evento evento : this.eventos)
			if(evento.sobreposto(e))
				return false;
		return true;
	}
	
	@Override
	public Collection<Evento> from(LocalDateTime inicio, LocalDateTime fim){
		List<Evento> selecionados = new ArrayList<Evento>();
		for(Evento evento : this.eventos)
			if(evento.iniciaEntre(inicio, fim))
				selecionados.add(evento);
		return selecionados;
	}
	
	@Override
	public Collection<Evento> today(LocalDate day){
		List<Evento> selecionados = new ArrayList<Evento>();
		for(Evento evento : this.eventos)
			if(evento.iniciaEm(day))
				selecionados.add(evento);
		return selecionados;
	};
	
	public Collection<Evento> today(){
		return this.today(LocalDate.now());
	}

}
