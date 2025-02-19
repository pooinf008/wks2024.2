package br.edu.ifba.inf011.model.adapter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import br.edu.ifba.inf011.model.Aula;
import br.edu.ifba.inf011.model.Geolocalizacao;
import br.edu.ifba.inf011.model.evento.Evento;
import br.edu.ifba.inf011.model.evento.RelacionadorEventos;

public class AulaObjectAdapter implements Evento{
	
	private Aula aula;

	public AulaObjectAdapter(Aula aula) {
		this.aula = aula;
	}

	@Override
	public boolean sobreposto(Evento evento) {
		return (new RelacionadorEventos()).sobreposto(this, evento);
	}

	@Override
	public String getDescricao() {
		return aula.getCodDisciplina() + "-" + aula.getDescricaoDisciplina();
	}

	@Override
	public LocalDateTime getInicio() {
		return aula.getHorario();
	}

	@Override
	public LocalDateTime getTermino() {
		return this.aula.getHorario().plus(100, ChronoUnit.MINUTES);
	}

	@Override
	public Integer getPrioridade() {
		return 5;
	}

	@Override
	public Geolocalizacao getLocalizacao() {
		return this.aula.getSala();
	}

	@Override
	public boolean iniciaEm(LocalDate timestamp) {
		return (new RelacionadorEventos()).iniciaEm(this, timestamp);
	}

	@Override
	public boolean iniciaEntre(LocalDateTime inicio, LocalDateTime fim) {
		return (new RelacionadorEventos()).iniciaEntre(this, inicio, fim);
	}

}
