package br.edu.ifba.inf011;

import br.edu.ifba.inf011.implementor.FonteDados;
import br.edu.ifba.inf011.implementor.FonteDadosMemoria;

public class ClientMemoria extends Client{

	@Override
	public FonteDados createFonteDados() {
		return new FonteDadosMemoria();
	}
	
	public static void main(String[] args) {
		(new ClientMemoria()).run();
	}

}
