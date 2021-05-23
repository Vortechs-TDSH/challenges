package me.acall.bean;

public class Chamada extends Agenda {

	protected String idChamada;
	
	protected String idAgenda;
	
	protected int volume;

	public Chamada(String idChamada, String idAgenda, String idEspecialista, String idPaciente, String data) {
		
		super(idAgenda, idEspecialista, idPaciente, data);
		this.idChamada = idChamada;
		this.idAgenda = idAgenda;
		this.volume = 10;
		
	}

	public String getIdChamada() {
		return idChamada;
	}

	public void setIdChamada(String idChamada) {
		this.idChamada = idChamada;
	}

	public String getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(String idAgenda) {
		this.idAgenda = idAgenda;
	}
	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int aumentarVolume() {
		
		if (this.volume < 100) {
			this.volume += 10;
		}
		
		return this.volume;
		
	}
	
	public int diminuirVolume() {
		
		if (this.volume > 0) {
			this.volume -= 10;
		}
		
		return this.volume;
		
	}
	
}
