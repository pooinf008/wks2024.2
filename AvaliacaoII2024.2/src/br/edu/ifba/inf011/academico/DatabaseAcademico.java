package br.edu.ifba.inf011.academico;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import br.edu.ifba.inf011.model.Geolocalizacao;

public class DatabaseAcademico {
	
	private Map<String, AulaAcademico> aulas;
	
	public DatabaseAcademico(){
		this.aulas = new HashMap<String, AulaAcademico>();
		this.aulas.put("INF011", new AulaAcademico("INF011", "PADRÕES DE PROJETO", "FREDERICO BARBOZA", Geolocalizacao.here(), LocalDateTime.of(2025, 02, 19, 19, 30)));
		this.aulas.put("INF027", new AulaAcademico("INF027", "LÓGICA DE PROGRAMACAO", "FREDERICO BARBOZA", Geolocalizacao.here(), LocalDateTime.of(2025, 02, 19, 18, 40)));
	}
	
	
	public AulaAcademico getAula(String codigo) {
		return this.aulas.get(codigo);
	}
	
	
	


}
