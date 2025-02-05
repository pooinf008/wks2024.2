package br.edu.ifba.inf011.abstraction.state;

import br.edu.ifba.inf011.implementor.FonteDados;

public class GerenteConteudoSomenteEscritaState 
	extends AbstractGerenteConteudoState
	implements GerenteConteudoState {

	@Override
	public GerenteConteudoState restaurar() {
		return new GerenteConteudoNormalState();
	}
	
	public void escrever(FonteDados fonte, String nome, String conteudo) throws UnsupportedOperationException {
			this.doEscrever(fonte, nome, conteudo);
	}

}
