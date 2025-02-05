package br.edu.ifba.inf011.abstraction;

import br.edu.ifba.inf011.abstraction.state.GerenteConteudoNormalState;
import br.edu.ifba.inf011.abstraction.state.GerenteConteudoState;
import br.edu.ifba.inf011.implementor.FonteDados;

public class GerenteConteudoBasico {
	
	protected FonteDados fonte;
	private GerenteConteudoState estado;
	
	public GerenteConteudoBasico(FonteDados fonte) {
		this.fonte = fonte;
		this.estado = new GerenteConteudoNormalState();
	}
	
	public void lerSomente() {
		this.estado = this.estado.lerSomente();
	}
	
	public void escreverSomente() {
		this.estado = this.estado.escreverSomente();
	}
	
	public void restaurar() {
		this.estado = this.estado.restaurar();
	}
	
	
	
	public void setFonteDados(FonteDados fonte) {
		this.fonte = fonte;
	}
	
	public String ler(String nome) throws UnsupportedOperationException {
		return this.estado.ler(fonte, nome);
	}
	
	public void escrever(String nome, String conteudo) throws UnsupportedOperationException{
		this.estado.escrever(fonte, nome, conteudo);
	}

}
