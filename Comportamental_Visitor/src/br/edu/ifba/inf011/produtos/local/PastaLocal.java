package br.edu.ifba.inf011.produtos.local;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.produtos.Pasta;
import br.edu.ifba.inf011.visitors.SistemaArquivoVisitor;

public class PastaLocal implements Pasta{
	
	private String nome;
	private LocalDate dtAcesso;
	

	public PastaLocal(String nome, LocalDate dtAcesso) {
		this.nome = nome;
		this.dtAcesso = dtAcesso;
	}

	@Override	
	public String getNome() {
		return this.nome;
	}

	
	@Override
	public void renomear(String nome) {
		this.nome = nome;
	}


	@Override
	public void setDataAcesso(LocalDate data) {
		this.dtAcesso = data;
	}


	@Override
	public LocalDate getDataAcesso() {
		return this.dtAcesso;
	}
	
	@Override
	public void aceitar(SistemaArquivoVisitor visitor) {
		visitor.visitPasta(this);
	}	


}
