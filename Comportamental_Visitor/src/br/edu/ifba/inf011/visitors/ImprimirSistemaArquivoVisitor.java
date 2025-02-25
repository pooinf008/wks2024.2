package br.edu.ifba.inf011.visitors;

import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.produtos.Capability;
import br.edu.ifba.inf011.produtos.Pasta;

public class ImprimirSistemaArquivoVisitor implements SistemaArquivoVisitor{
	
	private StringBuffer conteudo;
	
	public ImprimirSistemaArquivoVisitor() {
		this.conteudo = new StringBuffer();
	}
	
	public void reset() {
		this.conteudo= new StringBuffer();
	}

	@Override
	public void visitArquivo(Arquivo a) {
		this.conteudo.append("Arquivo: " + a.getNome());
		this.conteudo.append(" " + a.getTamanho());
		this.conteudo.append(" " + a.getVersao() + "\n");
	}

	@Override
	public void visitPasta(Pasta p) {
		this.conteudo.append("Pasta: " + p.getNome());
		this.conteudo.append(" " + p.getDataAcesso() + "\n");
	}

	@Override
	public void visitCapability(Capability c) {
		this.conteudo.append("Habilitacao: " + c.getUser());
		this.conteudo.append(" " + c.getVersion() + "\n");
	}

	
	public String getString() {
		return this.conteudo.toString();
	}
	
}
