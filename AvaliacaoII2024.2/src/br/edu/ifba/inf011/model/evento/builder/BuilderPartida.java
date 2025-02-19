package br.edu.ifba.inf011.model.evento.builder;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import br.edu.ifba.inf011.model.Equipe;
import br.edu.ifba.inf011.model.Geolocalizacao;
import br.edu.ifba.inf011.model.evento.Partida;

public class BuilderPartida extends BuilderEvento {

	private Integer placarA;
	private Integer placarB;
	
	public BuilderPartida  init() {
		
		this.placarA = 0;
		this.placarB = 0;
		
		this.inicio = LocalDateTime.now();
		this.termino = null;
		this.localizacao = Geolocalizacao.here();
		
		this.prioridade = 5;
		
		return this;
	}
	
	public BuilderPartida setPlacar(Integer placarA, Integer placarB) {
		this.placarA = placarA;
		this.placarB = placarB;
		return this;
	}
	
	public Partida build(String descricao, Equipe equipeA, Equipe equipeB) {
		if(this.termino == null)
			this.termino = this.inicio.plus(2, ChronoUnit.HOURS);
		return new Partida(descricao, equipeA, equipeB, placarA, placarB, inicio, termino, prioridade, localizacao);
	}
	

}
