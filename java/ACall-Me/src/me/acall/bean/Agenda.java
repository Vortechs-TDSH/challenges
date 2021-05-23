package me.acall.bean;

public class Agenda {

	protected String idAgenda;
	
	protected String idEspecialista;
	
	protected String idPaciente;
	
	protected String data;
	
	public Agenda(String idAgenda, String idEspecialista, String idPaciente, String data) {
		
		this.idAgenda = idAgenda;
		this.idEspecialista = idEspecialista;
		this.idPaciente = idPaciente;
		this.data = data;
		
	}

	public String getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(String idAgenda) {
		this.idAgenda = idAgenda;
	}

	public String getIdEspecialista() {
		return idEspecialista;
	}

	public void setIdEspecialista(String idEspecialista) {
		this.idEspecialista = idEspecialista;
	}

	public String getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
	
}
