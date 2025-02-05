package br.edu.ifba.inf011;

import java.time.LocalDateTime;

import br.edu.ifba.inf011.backup.Backup;
import br.edu.ifba.inf011.backup.politicas.PoliticaBackupFull;
import br.edu.ifba.inf011.backup.politicas.PoliticaBackupIncremental;
import br.edu.ifba.inf011.backup.politicas.TipoBackup;


public class SistemaArquivo {
	
	

	
	
	public void execute() {
		
		Arquivo arquivo13 = new Arquivo("arquivo_13.arq", "CONTEUDO03", LocalDateTime.of(2025, 01, 28, 12, 00));
		Arquivo arquivo12 = new Arquivo("arquivo_12.arq", "CONTEUDO2", LocalDateTime.of(2025, 01, 28, 12, 00));
		Arquivo arquivo11 = new Arquivo("arquivo_11.arq", "CONTEUDO1", LocalDateTime.of(2025, 01, 28, 12, 00));
		Pasta pasta1 = new Pasta("drived");
		
		pasta1.addEntrada(arquivo11);
		pasta1.addEntrada(arquivo12);
		pasta1.addEntrada(arquivo13);
		System.out.println(pasta1);
		
		
		Backup backup = new Backup(pasta1);
		backup.setPolitica(TipoBackup.FULL);
		backup.executar();
		arquivo12.escrever("Mudei o arquivo 12");
		backup.executar();
		
		arquivo11.escrever("Mudei o arquivo 11");
		backup.setPolitica(TipoBackup.INCREMENTAL);
		backup.executar();
		
		backup.setPolitica(TipoBackup.FULL);
		backup.executar();
		
		for(int iCont = 0; iCont < backup.get().size(); iCont++) {
			System.out.println("Numero do backup: " + iCont + "\n");
			System.out.println(backup.get().get(iCont));
			System.out.println("**************************");
		}
			
		
		
//		System.out.println(backup.recuperar());
		
	}
	
	
	public static void main(String[] args) {
		(new SistemaArquivo()).execute();
	}

}
