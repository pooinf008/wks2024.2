package br.edu.ifba.inf011.backup;

import java.util.List;

import br.edu.ifba.inf011.Arquivo;
import br.edu.ifba.inf011.Pasta;

public interface PoliticaBackup {
	
	public List<Arquivo> listarArquivos(Pasta origem, Pasta last);

}
