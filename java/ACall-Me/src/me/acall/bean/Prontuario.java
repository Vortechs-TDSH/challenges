package me.acall.bean;

public class Prontuario {

	protected String idProntuario;
	
	protected String idPaciente;
	
	protected String idEspecialista;
	
	protected String comentarios;

	public Prontuario(String idProntuario, String idPaciente, String idEspecialista, String comentarios) {
		
		this.idProntuario = idProntuario;
		this.idPaciente = idPaciente;
		this.idEspecialista = idEspecialista;
		this.comentarios = comentarios;
	
	}

	public String getIdProntuario() {
		return idProntuario;
	}

	public void setIdProntuario(String idProntuario) {
		this.idProntuario = idProntuario;
	}

	public String getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getIdEspecialista() {
		return idEspecialista;
	}

	public void setIdEspecialista(String idEspecialista) {
		this.idEspecialista = idEspecialista;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
	public void comentar(String comentario) {
		this.comentarios += comentario;
	}
	
}
