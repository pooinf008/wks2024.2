package br.edu.ifba.inf011.model;

import java.time.LocalDateTime;

public abstract class AbstractEvento implements Evento{

	protected String descricao;
	protected LocalDateTime inicio;
	protected LocalDateTime termino;
	protected Integer prioridade;
	protected Geolocalizacao localizacao;
	
	public AbstractEvento(String descricao, LocalDateTime inicio, LocalDateTime termino, Integer prioridade,
			Geolocalizacao localizacao) {
		super();
		this.descricao = descricao;
		this.inicio = inicio;
		this.termino = termino;
		this.prioridade = prioridade;
		this.localizacao = localizacao;
	}
	

	@Override
	public String getDescricao() {
		return this.descricao;
	}

	@Override
	public LocalDateTime getInicio() {
		return this.inicio;
	}

	@Override
	public LocalDateTime getTermino() {
		return this.termino;
	}

	@Override
	public Integer getPrioridade() {
		return this.prioridade;
	}

	@Override
	public Geolocalizacao getLocalizacao() {
		return this.localizacao;
	}

	@Override
	public boolean sobreposto(Evento evento) {
		return !this.getTermino().isBefore(evento.getInicio()) || this.getInicio().isAfter(evento.getTermino());
	}

	
	
	
}
