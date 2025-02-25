package br.edu.ifba.inf011.visitors;

import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.produtos.Capability;
import br.edu.ifba.inf011.produtos.Pasta;

public interface SistemaArquivoVisitor {
	public void visitArquivo(Arquivo a);
	public void visitPasta(Pasta p);
	public void visitCapability(Capability c);
}
