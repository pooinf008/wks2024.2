package br.edu.ifba.inf011.observer;

public interface ArquivoVaiModificarFonteEvento {
	public void addArquivoModificadoListener(ArquivoModificadoOuvinte listener);
	public void removeArquivoModificadoListener(ArquivoModificadoOuvinte listener);
	public void updateArquivoVaiModificar();
}
