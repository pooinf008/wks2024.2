package br.edu.ifba.inf011;

import br.edu.ifba.inf011.memento.ArquivoCaretaker;
import br.edu.ifba.inf011.memento.ArquivoCaretakerVersao2;
import br.edu.ifba.inf011.produtos.ArquivoFonte;

public class Client {

	private static final String PATH = 
			"C:\\Users\\fredericojorge\\Desktop\\content\\";
	
	public void run() throws Exception{
		
		
		ArquivoFonte arquivo = 
			new ArquivoFonte(PATH + "arq1.txt");

		ArquivoCaretaker caretaker = new ArquivoCaretaker(arquivo);
		
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
	
	public void run2() throws Exception{
		
		
		ArquivoFonte arquivo = 
			new ArquivoFonte(PATH + "arq1.txt");

		ArquivoCaretakerVersao2 caretaker = new ArquivoCaretakerVersao2(arquivo);
		
		for(String str : arquivo.read())
			System.out.println(str);
		System.out.println("****************");		
		caretaker.checkpoint("original");
		arquivo.append("textoFinal");
		caretaker.checkpoint("v1");
		arquivo.append("textoFinal");
		caretaker.checkpoint("v2");
		arquivo.append("textoFinal");
		arquivo.dump();
		for(String str : arquivo.read())
			System.out.println(str);
		System.out.println("****************");
		caretaker.undo("original");
		arquivo.dump();
		for(String str : arquivo.read())
			System.out.println(str);
	}
	
	
	
	public static void main(String[] args) throws Exception {
		(new Client()).run2();
	}

}
