package br.edu.ifba.inf011.model.evento;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class RelacionadorEventos {
	
	public boolean sobreposto(Evento evento1, Evento evento2) {
		return !(evento1.getTermino().isBefore(evento2.getInicio()) || evento1.getInicio().isAfter(evento2.getTermino()));
	}
	
	public boolean iniciaEntre(Evento evento, LocalDateTime faixaInicial, LocalDateTime faixaFinal) {
		return (evento.getInicio().isAfter(faixaInicial) || evento.getInicio().equals(faixaInicial)) &&
				evento.getInicio().isBefore(faixaFinal);
	}
	
	public boolean iniciaEm(Evento evento, LocalDate dia) {
		return evento.iniciaEntre(dia.atStartOfDay(), dia.plus(1, ChronoUnit.DAYS).atStartOfDay());
	}
			
	

}
