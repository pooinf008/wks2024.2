package br.edu.ifba.inf011.abstraction.state;

import br.edu.ifba.inf011.implementor.FonteDados;

public class GerenteConteudoNormalState
	extends AbstractGerenteConteudoState
	implements GerenteConteudoState {

	@Override
	public GerenteConteudoState lerSomente() {
		return new GerenteConteudoSomenteLeituraState();
	}

	@Override
	public GerenteConteudoState escreverSomente() {
		return new GerenteConteudoSomenteEscritaState();
	}


	@Override
	public String ler(FonteDados fonte, String nome) throws UnsupportedOperationException {
		return this.doLer(fonte, nome);
	}

	@Override
	public void escrever(FonteDados fonte, String nome, String conteudo) throws UnsupportedOperationException {
		this.doEscrever(fonte, nome, conteudo);
	}

}
