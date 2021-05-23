package me.acall.bean;import java.time.LocalDate;

public class Especialista extends Usuario {

	protected String idEspecialista;
	
	protected String CPF;
	
	protected String CNPJ;
	
	protected String especialidade;
	
	protected int CRM = 0;
	
	protected int CRP = 0;
	
	public Especialista( String nome, String email, String senha, String confirmacaoSenha, LocalDate dataNascimento, String genero, String numeroTelefone, String idEspecialista, 
			String CPF, String CNPJ, String especialidade, int CRM, int CRP) {
		
		super(nome, email, senha, confirmacaoSenha, dataNascimento, genero, numeroTelefone);
		
		this.idEspecialista = idEspecialista;
		this.CPF = CPF;
		this.CNPJ = CNPJ;
		this.especialidade = especialidade;
		this.CRM = CRM;
		this.CRP = CRP;
		
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
	
	public boolean cadastrarEspecialista() {
		
		if (this.nome.isEmpty() || this.email.isEmpty() || this.senha.isEmpty() || this.confirmacaoSenha.isEmpty() || this.genero.isEmpty() || 
				this.numeroTelefone.isEmpty()) {
			return false;
		}
		
		if (this.CPF.isEmpty() && this.CNPJ.isEmpty()) {
			return false;
		}
		
		if (this.CRM == 0 && this.CRP == 0) {
			return false;
		}
		
		short validaSenha = this.validaSenha(this.senha, this.confirmacaoSenha);
		
		if (validaSenha != 0) {
			return false;
		}
		
		return true;
	}
	
}
