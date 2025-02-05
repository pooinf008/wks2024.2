package br.edu.ifba.inf011;

import br.edu.ifba.inf011.implementor.FonteDados;
import br.edu.ifba.inf011.implementor.FonteDadosDisco;

public class ClientDisco extends Client{

	@Override
	public FonteDados createFonteDados() {
		return new FonteDadosDisco(PATH);
	}
	
	public static void main(String[] args) {
		(new ClientDisco()).run();
	}

}
