package br.edu.ifba.inf011.model;

import java.time.LocalDate;

public interface Calendario {

	public void sinalizarEventos(LocalDate of);
	public void download(String string) throws Exception;
	public void adicionarEvento(Evento evento) throws Exception;

}
