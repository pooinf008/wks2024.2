package br.edu.ifba.inf011.backup.politicas;

import java.util.List;

import br.edu.ifba.inf011.Arquivo;
import br.edu.ifba.inf011.Pasta;
import br.edu.ifba.inf011.backup.PoliticaBackup;

public class PoliticaBackupFull implements PoliticaBackup{

	@Override
	public List<Arquivo> listarArquivos(Pasta origem, Pasta last) {
		return origem.getEntradas();
	}

}
