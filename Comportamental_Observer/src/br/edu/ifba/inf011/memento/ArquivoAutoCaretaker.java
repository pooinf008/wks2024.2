package br.edu.ifba.inf011.memento;

import java.util.Stack;

import br.edu.ifba.inf011.observer.ArquivoModificadoOuvinte;
import br.edu.ifba.inf011.produtos.ArquivoFonte;

public class ArquivoAutoCaretaker implements ArquivoModificadoOuvinte{
	
	private ArquivoFonte arquivo;
	private Stack<ArquivoFonte.Memento> mementos;
	
	
	public ArquivoAutoCaretaker(ArquivoFonte arquivo) {
		this.arquivo = arquivo;
		this.arquivo.addArquivoModificadoListener(this);
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

	@Override
	public void notifyArquivoVaiModificar() {
		try {
			this.checkpoint();
			System.out.println("CHECKPOINT");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
