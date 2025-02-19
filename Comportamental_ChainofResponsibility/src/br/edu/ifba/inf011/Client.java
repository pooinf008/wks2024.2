package br.edu.ifba.inf011;

import br.edu.ifba.inf011.compiladores.Compilador;
import br.edu.ifba.inf011.cor.CompiladorC;
import br.edu.ifba.inf011.cor.CompiladorJava;
import br.edu.ifba.inf011.cor.CompiladorPascal;
import br.edu.ifba.inf011.produtos.ArquivoFonte;

public class Client {

	private static final String PATH = 
			"C:\\Users\\fredericojorge\\Desktop\\content\\";

	public void run(Compilador compilador) throws Exception{
		String extensao = "java";
		ArquivoFonte arquivo = new ArquivoFonte(Client.PATH + "exemplo." + extensao);
		compilador.compilar(arquivo);
	}	
	
	
	public static void main(String[] args) throws Exception {
		Client client = new Client();
		client.run(new CompiladorPascal(
					new CompiladorC(
						new CompiladorJava())));
	}


}
