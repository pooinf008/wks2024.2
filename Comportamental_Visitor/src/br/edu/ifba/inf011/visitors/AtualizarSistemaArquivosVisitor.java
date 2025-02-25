package br.edu.ifba.inf011.visitors;

import java.time.LocalDate;

import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.produtos.Capability;
import br.edu.ifba.inf011.produtos.Pasta;

public class AtualizarSistemaArquivosVisitor implements SistemaArquivoVisitor{

	@Override
	public void visitArquivo(Arquivo a) {
		a.atualizar();
	}

	@Override
	public void visitPasta(Pasta p) {
		p.setDataAcesso(p.getDataAcesso().plusDays(1));
	}

	@Override
	public void visitCapability(Capability c) {
		c.update(c.getVersion() + 1);
	}

}
