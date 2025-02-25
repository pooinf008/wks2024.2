package br.edu.ifba.inf011.produtos;

import java.time.LocalDate;

import br.edu.ifba.inf011.visitors.SistemaArquivoVisitor;

public interface Pasta {
	public String getNome();
	public void renomear(String nome);
	public void setDataAcesso(LocalDate data);
	public LocalDate getDataAcesso();
	public void aceitar(SistemaArquivoVisitor visitor);
}
