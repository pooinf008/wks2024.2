package br.edu.ifba.inf011.model.builder;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import br.edu.ifba.inf011.model.Geolocalizacao;

public class BuilderPartida {

	private LocalDateTime inicio;
	private LocalDateTime termino;
	private Integer prioridade;
	private Geolocalizacao localizacao;	
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
	
	public BuilderPartida setLocalizacao(Geolocalizacao localizacao) {
		this.localizacao = localizacao;
		return this;
	}	
	
	public BuilderPartida setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
		return this;
	}
	
	public BuilderPartida setTermino(LocalDateTime termino) {
		this.termino = termino;
		return this;
	}	
	
	public BuilderPartida setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
		return this;
	}		
	
	
	public Partida build(String descricao, Equipe equipeA, Equipe equipeB) {
		if(this.termino == null)
			this.termino = this.inicio.plus(2, ChronoUnit.HOURS);
		return new Partida(descricao, equipeA, equipeB, placarA, placarB, inicio, termino, prioridade, localizacao);
	}
	
	
	
	
	
	
	
	
	

}
