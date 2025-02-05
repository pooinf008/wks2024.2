package br.edu.ifba.inf011.backup.politicas;

import br.edu.ifba.inf011.backup.PoliticaBackup;

public enum TipoBackup {
	
	FULL(new PoliticaBackupFull()), 
	INCREMENTAL(new PoliticaBackupIncremental()); 
	
	private PoliticaBackup politica;
	
	TipoBackup(PoliticaBackup politica){
		this.politica = politica;
	}
	
	public PoliticaBackup politica() {
		return this.politica;
	}
	

}
