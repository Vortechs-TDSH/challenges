package me.acall.bean;

import java.time.LocalDate;

public class Paciente extends Usuario {

	protected String idPaciente;
	
	protected String CPF;
	
	public Paciente(String nome, String email, String senha, String confirmacaoSenha, LocalDate dataNascimento, String genero, String numeroTelefone, String idPaciente, 
			String CPF) {
		
		super(nome, email, senha, confirmacaoSenha, dataNascimento, genero, numeroTelefone);
		
		this.idPaciente = idPaciente;
		this.CPF = CPF;
		
	}
	
	public short validaSenha(String senha, String confirmacaoSenha) {
		return super.validaSenha(senha, confirmacaoSenha);
	}
	
	public boolean login(String email, String senha) {
		return super.login(email, senha);
	}
	
	public void logout() {
		super.logout();
	}
	
	public boolean cadastrarPaciente() {
		
		if (this.nome.isEmpty() || this.email.isEmpty() || this.senha.isEmpty() || this.confirmacaoSenha.isEmpty() || this.genero.isEmpty() || this.numeroTelefone.isEmpty() 
				|| this.CPF.isEmpty()) {
			return false;
		}
		
		short validaSenha = this.validaSenha(this.senha, this.confirmacaoSenha);
		
		if (validaSenha != 0) {
			return false;
		}
		
		return true;
	}
	

}
