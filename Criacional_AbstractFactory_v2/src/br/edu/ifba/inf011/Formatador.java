package br.edu.ifba.inf011;

import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.produtos.ElementoSistemaArquivo;

public interface Formatador extends ElementoSistemaArquivo{
	
	public void formatar(Arquivo arquivo);

}
