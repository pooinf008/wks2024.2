package br.edu.ifba.inf011.model;

public class Geolocalizacao {
	
	
	public static Geolocalizacao here() {
		return new Geolocalizacao("HERE", 0.0, 0.0);
	}
	
	private String local;
	private Double latitude;
	private Double longitude;
	
	public Geolocalizacao(String local, Double latitude, Double longitude) {
		this.local = local;
		this.latitude = latitude;
		this.longitude = longitude;
	}	
	
	public Geolocalizacao(Double latitude, Double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}	
	
	public Geolocalizacao(String local) {
		this.local = local;
	}		
	
	public String toString() {
		return this.local;
	}	
	
	
}

