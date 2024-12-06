package br.edu.ifba.inf011.model.fm;

import br.edu.ifba.inf011.model.Calendario;

public class Aplicacao extends AplicacaoCalendario{

	@Override
	protected Calendario createCalendario() {
		return new CalendarioPessoal("inf011@ads.ifba.edu.br", 12, 2024);
	}
	
	public static void main(String[] args) throws Exception {
		(new Aplicacao()).run2();
	}

}
