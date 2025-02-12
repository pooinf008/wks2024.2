package br.edu.ifba.inf011.memento;

import java.util.HashMap;
import java.util.Map;

import br.edu.ifba.inf011.produtos.ArquivoFonte;

public class ArquivoCaretakerVersao2 {
	
	private ArquivoFonte arquivo;
	private Map<String,ArquivoFonte.Memento> mementos;
	
	
	public ArquivoCaretakerVersao2(ArquivoFonte arquivo) {
		this.arquivo = arquivo;
		this.mementos = new HashMap<String, ArquivoFonte.Memento>();
	}
	
	public void checkpoint(String versao) throws Exception{
		ArquivoFonte.Memento memento = this.arquivo.checkpoint();
		this.mementos.put(versao, memento);
	}
	
	public void undo(String versao) throws Exception{
		ArquivoFonte.Memento memento = this.mementos.get(versao);
		if(memento == null)
			return;
		this.arquivo.restore(memento);
	}
	
	

}
