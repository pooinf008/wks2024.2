package br.edu.ifba.inf011.abstraction.state;

import br.edu.ifba.inf011.implementor.FonteDados;

public class GerenteConteudoSomenteLeituraState
extends AbstractGerenteConteudoState
	implements GerenteConteudoState {

	@Override
	public GerenteConteudoState restaurar() {
		return new GerenteConteudoNormalState();
	}

	@Override
	public String ler(FonteDados fonte, String nome) throws UnsupportedOperationException {
		return this.doLer(fonte, nome);
	}

}
