package br.edu.ifba.inf011.abstraction;

import br.edu.ifba.inf011.implementor.FonteDados;

public class GerenteConteudoAvancado extends GerenteConteudoBasico{
	
	public GerenteConteudoAvancado(FonteDados fonte) {
		super(fonte);
	}
	
	public void copiar(String origem, String destino) {
		String conteudo = this.ler(origem);
		this.escrever(destino, conteudo);
	}
}
