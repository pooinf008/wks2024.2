package br.edu.ifba.inf011.backup.politicas;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.Arquivo;
import br.edu.ifba.inf011.Pasta;
import br.edu.ifba.inf011.backup.PoliticaBackup;

public class PoliticaBackupIncremental implements PoliticaBackup{


	@Override
	public List<Arquivo> listarArquivos(Pasta origem, Pasta last) {
		ArrayList<Arquivo> selecionados = new ArrayList<Arquivo>();
		for(int iCont = 0; iCont < origem.getEntradas().size(); iCont++) {
			Arquivo arquivo = origem.getEntradas().get(iCont);
			if(temCopiar(arquivo, last))
				selecionados.add(arquivo);
		}
		return selecionados;
	}

	private boolean temCopiar(Arquivo arquivo, Pasta last) {
		if (!last.getEntradas().contains(arquivo))
			return true;
		Arquivo arquivado = last.getEntradas().get(last.getEntradas().indexOf(arquivo));
		return arquivado.getUltimaModificacao().isBefore(arquivo.getUltimaModificacao());
	}

}
