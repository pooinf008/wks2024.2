package br.edu.ifba.inf011.memento;

import java.util.Stack;

import br.edu.ifba.inf011.produtos.ArquivoFonte;

public class ArquivoCaretaker {
	
	private ArquivoFonte arquivo;
	private Stack<ArquivoFonte.Memento> mementos;
	
	
	public ArquivoCaretaker(ArquivoFonte arquivo) {
		this.arquivo = arquivo;
		this.mementos = new Stack<ArquivoFonte.Memento>();
	}
	
	public void checkpoint() throws Exception{
		ArquivoFonte.Memento memento = this.arquivo.checkpoint();
		this.mementos.push(memento);
	}
	
	public void undo() throws Exception{
		if(mementos.isEmpty())
			return;
		this.arquivo.restore(this.mementos.pop());
	}
	
	

}
