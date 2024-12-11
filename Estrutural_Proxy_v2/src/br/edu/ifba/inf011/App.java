package br.edu.ifba.inf011;

import br.edu.ifba.inf011.proxy.ArquivoLogProxy;

public class App {
	
	public void run2(){
		ArquivoFramework fmw = new ArquivoTextoFramework();
		fmw.assinar("", "");
	}
	
	public void run(Arquivo fmw){
		byte[] b = fmw.abrir().converter();
		System.out.println(b.toString());
		fmw.descarregar("FEITO".getBytes());
		fmw.fechar();
	}
	
	
	public static void main(String[] args) {
		(new App()).run(new ArquivoLogProxy(new ArquivoLogProxy(new ArquivoImagem("ABC"))));
	}

}
