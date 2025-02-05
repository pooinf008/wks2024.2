package br.edu.ifba.inf011.backup;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.Arquivo;
import br.edu.ifba.inf011.Pasta;
import br.edu.ifba.inf011.backup.politicas.TipoBackup;

public class Backup {
	
	private PoliticaBackup politicaBackup;
	private Pasta origem;
	private List<Pasta> destino;
	
	public Backup(Pasta origem) {
		this.origem = origem;
		this.destino = new ArrayList<Pasta>();
		this.destino.add(new Pasta("BACKUP_" + origem.getNome() + "_" + LocalDateTime.now()));
	}
	
	
	public void executar() {
		List<Arquivo> arquivos = this.politicaBackup.listarArquivos(origem, destino.getLast());
		Pasta nova = new Pasta("BACKUP_" + origem.getNome() + "_" + LocalDateTime.now());
		for(Arquivo arquivo : arquivos)
			nova.addEntrada((Arquivo)arquivo.prototype());
		this.destino.add(nova);
	}
	
	
	public List<Pasta> get() {
		return this.destino;
	}
	
	public Pasta recuperar() {
		Pasta pasta = new Pasta("BACKUP_RECOVERY_" + origem.getNome());
		for(int iCont = this.destino.size() - 1; iCont >= 0; iCont--)
			this.recuperar(pasta, this.destino.get(iCont));
		return pasta;
	}
	
	
	private void recuperar(Pasta nova, Pasta backup) {
		for(Arquivo arquivo : backup.getEntradas())
			if(!nova.existe(arquivo))
				nova.addEntrada(arquivo);
	}


	public void setPolitica(TipoBackup tipo) {
		this.politicaBackup = tipo.politica();
	}

}
