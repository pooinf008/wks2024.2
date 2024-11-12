package br.edu.ifba.inf011;

import br.edu.ifba.inf011.abstractFactory.SistemaArquivoFactory;
import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.produtos.Pasta;
import br.edu.ifba.inf011.produtos.cloud.SistemaCloudFactory;

public class Client {
	
	public void run(SistemaArquivoFactory sistemaArquivoFactory){
		
		Arquivo arquivo12 =  (Arquivo) sistemaArquivoFactory.criarElementoSistemaArquivo(0, "arquivo_12.arq");
		Arquivo arquivo11 = (Arquivo) sistemaArquivoFactory.criarElementoSistemaArquivo(0, "arquivo_11.arq");
		Arquivo arquivo21 = (Arquivo) sistemaArquivoFactory.criarElementoSistemaArquivo(0, "arquivo_21.arq");
		Pasta pasta1 = (Pasta) sistemaArquivoFactory.criarElementoSistemaArquivo(1, "drived");
		Pasta pasta2 = (Pasta) sistemaArquivoFactory.criarElementoSistemaArquivo(1, "drivef");
		
		pasta1.adicionar(arquivo12);
		pasta1.adicionar(arquivo11);
		
		pasta2.adicionar(arquivo21);
		
		System.out.println(pasta1);
		
		System.out.println(pasta2);
		
		Formatador f = (Formatador)sistemaArquivoFactory.criarElementoSistemaArquivo(2, null);
		
		if(f != null)
			f.formatar(arquivo21);
		
		
	}
	
	
	public static void main(String[] args) {
		(new Client()).run(new SistemaCloudFactory());
	}

}
