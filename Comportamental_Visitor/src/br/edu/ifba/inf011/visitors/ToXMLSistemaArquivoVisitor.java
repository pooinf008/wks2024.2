package br.edu.ifba.inf011.visitors;

import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.produtos.Capability;
import br.edu.ifba.inf011.produtos.Pasta;

public class ToXMLSistemaArquivoVisitor implements SistemaArquivoVisitor{
	
	private StringBuffer conteudo;
	
	public ToXMLSistemaArquivoVisitor() {
		this.conteudo = new StringBuffer();
	}
	
	public void reset() {
		this.conteudo= new StringBuffer("<?XML version=\"1.0\" encoding=\"codepage\"?>\n");
		this.conteudo.append("<SistemaArquivo>\n");
	}

	@Override
	public void visitArquivo(Arquivo a) {
		this.conteudo.append("\t<Arquivo>\n");
		this.conteudo.append("\t\t<Nome>" + a.getNome() + "</Nome>\n");
		this.conteudo.append("\t\t<Tamanho>" + a.getTamanho() + "</Tamanho>\n");
		this.conteudo.append("\t\t<Versao>" + a.getVersao() + "</Versao>\n");
		this.conteudo.append("\t</Arquivo>\n");
	}

	@Override
	public void visitPasta(Pasta p) {
		this.conteudo.append("\t<Pasta>\n");
		this.conteudo.append("\t\t<Nome>" + p.getNome() + "</Nome>\n");
		this.conteudo.append("\t\t<DtAcesso>" + p.getDataAcesso() + "</DtAcesso>\n");
		this.conteudo.append("\t</Pasta>\n");
	}

	@Override
	public void visitCapability(Capability c) {
		this.conteudo.append("\t<Habilitacao>\n");
		this.conteudo.append("\t\t<Usuario>" + c.getUser() + "</Usuario>\n");
		this.conteudo.append("\t\t<Senha>" + c.getPWD() + "</Senha>\n");
		this.conteudo.append("\t\t<Versao>" + c.getVersion() + "</Versao>\n");
		this.conteudo.append("\t</Habilitacao>\n");
	}

	
	public String toXML() {
		this.conteudo.append("</SistemaArquivo>");
		return this.conteudo.toString();
	}
	
}
