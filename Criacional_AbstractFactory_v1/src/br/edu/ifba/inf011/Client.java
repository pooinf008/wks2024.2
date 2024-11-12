package br.edu.ifba.inf011;

import br.edu.ifba.inf011.abstractFactory.SistemaArquivoFactory;
import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.produtos.Formatador;
import br.edu.ifba.inf011.produtos.Pasta;
import br.edu.ifba.inf011.produtos.local.SistemaLocalFactory;

public class Client {
	
	public void run(SistemaArquivoFactory sistemaArquivoFactory){
		
		Arquivo arquivo12 =  sistemaArquivoFactory.criarArquivo("arquivo_12.arq");
		Arquivo arquivo11 = sistemaArquivoFactory.criarArquivo("arquivo_11.arq");
		Arquivo arquivo21 = sistemaArquivoFactory.criarArquivo("arquivo_21.arq");
		Pasta pasta1 = sistemaArquivoFactory.criarPasta("drived");
		Pasta pasta2 = sistemaArquivoFactory.criarPasta("drivef");
		
		Formatador formatador = sistemaArquivoFactory.criarFormatador();
		
		pasta1.adicionar(arquivo12);
		pasta1.adicionar(arquivo11);
		
		pasta2.adicionar(arquivo21);
		
		System.out.println(pasta1);
		
		System.out.println(pasta2);
		
		
		formatador.formatar(arquivo21);
		
	}
	
	
	public static void main(String[] args) {
		(new Client()).run(new SistemaLocalFactory());
	}

}
