package br.edu.ifba.inf011;

public class ArquivoAudioFramework extends ArquivoFramework {

	@Override
	protected Arquivo createArquivo(String origem) {
		return new ArquivoAudio(origem);
	}

}
