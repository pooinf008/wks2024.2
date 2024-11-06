package br.edu.ifba.inf011;

public class ArquivoAudioFramework extends ArquivoFramework {

	@Override
	protected Arquivo createArquivo(Integer tipo, String origem) {
		if(tipo == 3)
			return new ArquivoAudio(origem);
		return super.createArquivo(tipo, origem);
	}

}
