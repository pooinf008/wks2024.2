package br.edu.ifba.inf011.model.evento;

import java.time.LocalDateTime;

import br.edu.ifba.inf011.model.dominio.Equipe;
import br.edu.ifba.inf011.model.dominio.Geolocalizacao;
import br.edu.ifba.inf011.model.evento.builder.BuilderPartida;

public class Partida extends AbstractEvento implements Evento{
	
	private Equipe equipeA;
	private Equipe equipeB;
	private Integer placarA;
	private Integer placarB;	
	
	
	public static BuilderPartida builder() {
		return new BuilderPartida();
	}
	
	
	public Partida(String descricao, Equipe equipeA, Equipe equipeB, Integer placarA,  Integer placarB, LocalDateTime inicio, 
				   LocalDateTime termino, Integer prioridade,
				   Geolocalizacao localizacao) {
		super(descricao, inicio, termino, prioridade, localizacao);
		this.equipeA = equipeA;
		this.equipeB = equipeB;
		this.placarA = placarA;
		this.placarB = placarB;
	}



	public Equipe getEquipeA() {
		return equipeA;
	}



	public Equipe getEquipeB() {
		return equipeB;
	}



	public Integer getPlacarA() {
		return placarA;
	}



	public Integer getPlacarB() {
		return placarB;
	}
	
	
	public String toString() {
		return this.descricao + "\n" +
	           this.getEquipeA() + " " + this.getPlacarA() + " x " + this.getPlacarB() + " " + this.getEquipeB() + "\n" +
			   this.getLocalizacao() + "\n" +
	           this.getInicio();
	}
	
	
	


}
