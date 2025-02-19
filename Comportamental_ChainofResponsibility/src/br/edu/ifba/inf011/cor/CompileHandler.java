package br.edu.ifba.inf011.cor;

import br.edu.ifba.inf011.compiladores.Compilador;
import br.edu.ifba.inf011.produtos.ArquivoFonte;

public interface CompileHandler extends Compilador{
	
	public void setNext(CompileHandler handler);
	public void compilar(ArquivoFonte arquivo) throws Exception;;

}
