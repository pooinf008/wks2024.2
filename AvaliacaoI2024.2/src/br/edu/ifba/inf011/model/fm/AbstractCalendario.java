package br.edu.ifba.inf011.model.fm;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.model.Calendario;
import br.edu.ifba.inf011.model.Evento;

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
	public void sinalizarEventos(LocalDate of) {
		System.out.println("Sinalizando os eventos de: " + of);
	}

	@Override
	public void download(String string)  throws Exception{
		System.out.println("Baixando Evento de " + string);
	}


	@Override
	public void adicionarEvento(Evento evento) throws Exception {
		if(!podeAdicionar(evento))
			throw new Exception("Evento não pode ser adicionado");
		
		
	}

	protected boolean podeAdicionar(Evento e) {
		for(Evento evento : this.eventos)
			if(evento.sobreposto(e))
				return false;
		return true;
	}

}
