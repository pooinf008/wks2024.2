package br.edu.ifba.inf011;

import java.util.List;

import br.edu.ifba.inf011.memento.ArquivoAutoCaretaker;
import br.edu.ifba.inf011.observer.ArquivoModificadoOuvinte;
import br.edu.ifba.inf011.produtos.ArquivoFonte;

public class Client implements ArquivoModificadoOuvinte{

	private static final String PATH = 
			"C:\\Users\\fredericojorge\\Desktop\\content\\";
	
	private ArquivoFonte arquivo;

	public void run2() throws Exception{
		
		arquivo = new ArquivoFonte(PATH + "arq1.txt");
		ArquivoAutoCaretaker caretaker = new ArquivoAutoCaretaker(arquivo);		

		arquivo.addArquivoModificadoListener(this);
		
		arquivo.read();
		arquivo.append("textoFinal");
		arquivo.append("textoFinal");
		arquivo.append("textoFinal");
		
		caretaker.undo();
		caretaker.undo();
		caretaker.undo();
		
		List<String> conteudo = this.arquivo.content();
		for(String s : conteudo)
			System.out.println(s);	

	}
	
	
	
	public void run() throws Exception{
		
		
		ArquivoFonte arquivo = 
			new ArquivoFonte(PATH + "arq1.txt");

		ArquivoAutoCaretaker caretaker = new ArquivoAutoCaretaker(arquivo);
		
		for(String str : arquivo.read())
			System.out.println(str);
		System.out.println("****************");		
		caretaker.checkpoint();
		arquivo.append("textoFinal");
		caretaker.checkpoint();
		arquivo.append("textoFinal");
		caretaker.checkpoint();
		arquivo.append("textoFinal");
		arquivo.dump();
		for(String str : arquivo.read())
			System.out.println(str);
		System.out.println("****************");
		caretaker.undo();
		caretaker.undo();
		arquivo.dump();
		for(String str : arquivo.read())
			System.out.println(str);
	}
	
	public static void main(String[] args) throws Exception {
		(new Client()).run2();
	}



	@Override
	public void notifyArquivoVaiModificar(List<String> antigo, List<String> futuro) {
		System.out.println("O Arquivo será modificado");
		try {
			for(String s : futuro)
				System.out.println(s);
			
		} catch (Exception e) {
		}
	}

}
