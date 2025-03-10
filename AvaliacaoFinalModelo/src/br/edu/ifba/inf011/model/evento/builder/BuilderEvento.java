package br.edu.ifba.inf011.model.evento.builder;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import br.edu.ifba.inf011.model.dominio.Geolocalizacao;
import br.edu.ifba.inf011.model.evento.Evento;
import br.edu.ifba.inf011.model.evento.Lembrete;
import br.edu.ifba.inf011.model.evento.TipoEvento;

public class BuilderEvento {
	
	protected String descricao;
	protected LocalDateTime inicio;
	protected LocalDateTime termino;
	protected Integer prioridade;
	protected Geolocalizacao localizacao;
	protected String profissionalMedico;
	
	private TipoEvento tipoEvento;
	
	public BuilderEvento  init() {
		this.inicio = LocalDateTime.now();
		this.localizacao = Geolocalizacao.here();
		this.prioridade = 5;
		return this;
	}	
	
	public BuilderEvento setLocalizacao(Geolocalizacao localizacao) {
		this.localizacao = localizacao;
		return this;
	}	
	
	public BuilderEvento setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
		return this;
	}
	
	public BuilderEvento setTermino(LocalDateTime termino) {
		this.termino = termino;
		return this;
	}	
	
	public BuilderEvento setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
		return this;
	}
	
	public BuilderEvento comProfissionalMedico(String medico) {
		this.profissionalMedico = medico;
		return this;
	}
	
	public Evento build(TipoEvento tipo, String descricao) {
		if(this.termino == null)
			this.termino = this.inicio.plus(2, ChronoUnit.HOURS);
		if(tipo == TipoEvento.LEMBRETE)
			return new Lembrete(descricao, inicio, termino, prioridade, localizacao);
		return null;
	}
	

}
