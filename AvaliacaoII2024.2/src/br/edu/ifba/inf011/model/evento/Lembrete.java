package br.edu.ifba.inf011.model.evento;

import java.time.LocalDateTime;

import br.edu.ifba.inf011.model.Geolocalizacao;
import br.edu.ifba.inf011.model.evento.builder.BuilderEvento;

public class Lembrete extends AbstractEvento{

	public static BuilderEvento builder() {
		return new BuilderEvento();
	}	
	
	public Lembrete(String descricao, LocalDateTime inicio, LocalDateTime termino, Integer prioridade,
			Geolocalizacao localizacao) {
		super(descricao, inicio, termino, prioridade, localizacao);
	}
	
	@Override
	public boolean sobreposto(Evento evento) {
		return false;
	}	

}
