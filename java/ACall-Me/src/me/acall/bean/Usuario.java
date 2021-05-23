package me.acall.bean;

import java.time.LocalDate;

public class Usuario {

	public String nome;
	
	public String email;
	
	public String senha;
	
	public String confirmacaoSenha;
	
	public LocalDate dataNascimento;
	
	public String genero;
	
	public String numeroTelefone;
	
	public boolean isLogado;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirmacaoSenha() {
		return confirmacaoSenha;
	}

	public void setConfirmacaoSenha(String confirmacaoSenha) {
		this.confirmacaoSenha = confirmacaoSenha;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	
	public boolean getIsLogado() {
		return isLogado;
	}

	public void setIsLogado(boolean isLogado) {
		this.isLogado = isLogado;
	}

	public Usuario(String nome, String email, String senha, String confirmacaoSenha, LocalDate dataNascimento, String genero, String numeroTelefone) {
		
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.confirmacaoSenha = confirmacaoSenha;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.numeroTelefone = numeroTelefone;
		
	}
	
	
	public short validaSenha(String senha, String confirmacaoSenha) {
		
		char ch;
		boolean minuscula = false;
		boolean maiuscula = false;
		boolean numero = false;
		boolean charEspecial = false;
		
		if (senha.equals(confirmacaoSenha)) {
			
			if (senha.length() < 6) {
				return 3;
			}
			
		    for (int i = 0; i < senha.length(); i++) {
		    	
		        ch = senha.charAt(i);
		        
		        if (Character.isUpperCase(ch)) {
		            maiuscula = true;
		        }
		        else if (Character.isLowerCase(ch)) {
		            minuscula = true;
		        }
		        else if (Character.isDigit(ch)) {
		            numero = true;
		        }
		        else if (Character.isAlphabetic(ch) == false && Character.isDigit(ch) == false) {
		        	charEspecial = true;
		        }
		        
		    }
				
		}
		else {
			return 1;
		}
		
		if (!minuscula || !maiuscula || !numero || !charEspecial) {
			return 2;
		}
		
		return 0;
		
	}
	
	public boolean login(String email, String senha) {
		
		if (email.equals(this.email) && senha.equals(this.senha)) {
			this.isLogado = true;
			return true;
		}
		
		return false;
		
	}
	
	public void logout() {
		this.isLogado = false;
	}
	
}
