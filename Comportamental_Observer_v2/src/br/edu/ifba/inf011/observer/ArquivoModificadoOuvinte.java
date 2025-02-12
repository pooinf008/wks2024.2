package br.edu.ifba.inf011.observer;

import java.util.List;

public interface ArquivoModificadoOuvinte {
	public void notifyArquivoVaiModificar(List<String> antigo, List<String> futuro);
}
