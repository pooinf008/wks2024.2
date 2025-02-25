package br.edu.ifba.inf011.produtos;

import br.edu.ifba.inf011.visitors.SistemaArquivoVisitor;

public interface Arquivo {
	public String getNome();
	public void renomear(String nome);
	public Integer getTamanho();
	public void atualizar();
	public Integer getVersao();
	public void aceitar(SistemaArquivoVisitor visitor);
	
}
