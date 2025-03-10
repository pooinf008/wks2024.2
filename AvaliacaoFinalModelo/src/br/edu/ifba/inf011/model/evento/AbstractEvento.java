package br.edu.ifba.inf011.model.evento;

import java.time.LocalDate;
import java.time.LocalDateTime;

import br.edu.ifba.inf011.model.dominio.Geolocalizacao;

public abstract class AbstractEvento implements Evento{

	protected String descricao;
	protected LocalDateTime inicio;
	protected LocalDateTime termino;
	protected Integer prioridade;
	protected Geolocalizacao localizacao;
	protected Boolean concluido;
	
	public AbstractEvento(String descricao, LocalDateTime inicio, LocalDateTime termino, Integer prioridade,
			Geolocalizacao localizacao) {
		super();
		this.descricao = descricao;
		this.inicio = inicio;
		this.termino = termino;
		this.prioridade = prioridade;
		this.localizacao = localizacao;
		this.concluido = Boolean.FALSE;
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
		return (new RelacionadorEventos()).sobreposto(this, evento);
	}
	
	@Override
	public boolean iniciaEntre(LocalDateTime faixaInicial, LocalDateTime faixaFinal) {
		return (new RelacionadorEventos()).iniciaEntre(this, faixaInicial, faixaFinal);
	}
	
	@Override
	public boolean iniciaEm(LocalDate dia) {
		return (new RelacionadorEventos()).iniciaEm(this, dia);
	}
		
	
}
