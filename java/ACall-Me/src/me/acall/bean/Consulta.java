package me.acall.bean;

public class Consulta extends Agenda {

	protected String idConsulta;
	
	protected double valor;

	public Consulta(String idAgenda, String idEspecialista, String idPaciente, String data, String idConsulta, double valor) {
		
		super(idAgenda, idEspecialista, idPaciente, data);
		this.idConsulta = idConsulta;
		this.valor = valor;
		
	}

	public String getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(String idConsulta) {
		this.idConsulta = idConsulta;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
