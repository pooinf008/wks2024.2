package br.edu.ifba.inf011.observer;

import java.util.List;

public interface ArquivoVaiModificarFonteEvento {
	public void addArquivoModificadoListener(ArquivoModificadoOuvinte listener);
	public void removeArquivoModificadoListener(ArquivoModificadoOuvinte listener);
	public void updateArquivoVaiModificar(List<String> antigo, List<String> futuro);
}
