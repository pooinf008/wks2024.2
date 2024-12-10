package br.edu.ifba.inf011;

import br.edu.ifba.inf011.adapter.ArquivoCryptoFramework;

public class App {
	
	public void run(){
		ArquivoFramework fmw = new ArquivoCryptoFramework();
		fmw.assinar("", "");
	}
	
	public static void main(String[] args) {
		(new App()).run();
	}

}
