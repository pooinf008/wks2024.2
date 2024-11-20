package br.edu.ifba.inf011.produtos.local;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.produtos.Pasta;
import br.edu.ifba.inf011.protype.Prototype;

public class PastaLocal implements Pasta{
	
	private String nome;
	private List<Arquivo> arquivos = new ArrayList<Arquivo>();
	

	public PastaLocal(String nome) {
		this.nome = nome;
	}
	
	public PastaLocal(PastaLocal pasta) {
	    this(pasta.getNome());
		for(Arquivo arquivo : pasta.arquivos)
			this.adicionar((Arquivo)arquivo.prototipar());		
	}
	
	private String getNome() {
		return this.nome;
	}

	@Override
	public void adicionar(Arquivo arquivo) {
		this.arquivos.add(arquivo);
	}
	
	
	public String toString() {
		StringBuffer rep = new StringBuffer("[Sistema de Arquivos Local]" + this.nome + "\n");
		for(Arquivo arquivo : this.arquivos)
			rep.append("\t+++"  + this.nome + "/" + arquivo + "\n");
		return rep.toString();
	}

	@Override
	public Prototype prototipar() {
		return new PastaLocal(this);
	}

	@Override
	public void renomear(String nome) {
		this.nome = nome;
	}


}
