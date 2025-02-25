package br.edu.ifba.inf011.produtos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.produtos.local.ArquivoLocal;
import br.edu.ifba.inf011.produtos.local.LocalCapability;
import br.edu.ifba.inf011.produtos.local.PastaLocal;
import br.edu.ifba.inf011.visitors.AtualizarSistemaArquivosVisitor;
import br.edu.ifba.inf011.visitors.ImprimirSistemaArquivoVisitor;
import br.edu.ifba.inf011.visitors.SistemaArquivoVisitor;
import br.edu.ifba.inf011.visitors.ToXMLSistemaArquivoVisitor;

public class SistemaArquivo {
	
	private List<Arquivo> arquivos;
	private List<Pasta> pastas;
	private List<Capability> habilitacoes;
	
	public SistemaArquivo() {
		this.arquivos = new ArrayList<Arquivo>();
		this.pastas = new ArrayList<Pasta>();
		this.habilitacoes = new ArrayList<Capability>();
		this.asm();
	}
	
	private void asm() {
		this.arquivos.add(new ArquivoLocal("Arq01", 100));
		this.arquivos.add(new ArquivoLocal("Arq02", 200));
		this.pastas.add(new PastaLocal("PASTA01", LocalDate.of(2025, 01, 01)));
		this.pastas.add(new PastaLocal("PASTA02", LocalDate.of(2025, 02, 01)));
		this.habilitacoes.add(new LocalCapability("sa", "sys", 1));
		this.habilitacoes.add(new LocalCapability("system", "admin", 1));
	}
	
	private void percorrer(SistemaArquivoVisitor visitor) {
		for(Arquivo a : this.arquivos)
			a.aceitar(visitor);
		for(Pasta p : this.pastas)
			p.aceitar(visitor);
		for(Capability c : this.habilitacoes)
			c.accept(visitor);
	}
	
	
	public void run() {
		ImprimirSistemaArquivoVisitor imp = new ImprimirSistemaArquivoVisitor();
		AtualizarSistemaArquivosVisitor atualizador = new AtualizarSistemaArquivosVisitor();
		this.percorrer(imp);
		System.out.println(imp.getString());
		
		
		this.percorrer(atualizador);
		imp.reset();
		this.percorrer(imp);
		System.out.println(imp.getString());
		
		
		ToXMLSistemaArquivoVisitor visitorXML = new ToXMLSistemaArquivoVisitor();
		visitorXML.reset();
		this.percorrer(visitorXML);
		System.out.println(visitorXML.toXML());
		
		
	}
	
	
	public static void main(String[] args) {
		(new SistemaArquivo()).run();
	}
	
	
}
