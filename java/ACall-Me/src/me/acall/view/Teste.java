package me.acall.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.swing.JOptionPane;

import me.acall.bean.*;

public class Teste {

	public static void main (String[] args) {
		
		System.out.println("Bem vindo à ACall Me!\n");
		
		Scanner leitor = new Scanner(System.in);
		
		int op;
		
		do {
			
			op =  Integer.parseInt(JOptionPane.showInputDialog(
	            "O que gostaria de fazer?\n"
	            + "1 - Cadastro Paciente\n"
	            + "2 - Cadastro Especialista\n"
	            + "0 - Sair\n"
			));
			
			if (op == 1) {
				
				System.out.println("Nome: ");
				String nome = leitor.next() + leitor.nextLine();
				
				System.out.println("Email: ");
				String email = leitor.next() + leitor.nextLine();
				
				System.out.println("A senha deve conter ao menos 6 dígitos e pelo menos 1 número, 1 letra minúscula, 1 letra maiúscula e 1 caracter especial\n");
				System.out.println("Senha: ");
				String senha = leitor.next() + leitor.nextLine();
				
				System.out.println("Confirme a senha: ");
				String confirmacaoSenha = leitor.next() + leitor.nextLine();
				
				System.out.println("dd/mm/yyyy\n");
				System.out.println("Data de nascimento: ");
				String dataLida = leitor.next() + leitor.nextLine();

				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
				
				LocalDate dataNascimento = LocalDate.parse(dataLida, formatter);
				
				System.out.println("Gênero deve ser (M) masculino, (F) feminino, (NF) não informar\n");
				System.out.println("Gênero: ");
				String genero = leitor.next() + leitor.nextLine();
				
				System.out.println("(DDD) + número separado por traço\n");
				System.out.println("Telefone: ");
				String telefone = leitor.next() + leitor.nextLine();
				
				System.out.println("CPF: ");
				String CPF = leitor.next() + leitor.nextLine();
				
				String idPaciente = "123abc";
							
				Paciente paciente = new Paciente(nome, email, senha, confirmacaoSenha, dataNascimento, genero, telefone, idPaciente, CPF);
				
				short validaSenha = paciente.validaSenha(senha, confirmacaoSenha);
				
				if(validaSenha != 0) {
					
					if (validaSenha == 1) {
						System.out.println("As senhas não são iguais");
					}
					else if (validaSenha == 2) {
						System.out.println("A senha não preenche os requisitos");
					}
					else if (validaSenha == 3) {
						System.out.println("A senha não tem o tamanho mínimo");
					}
				}
				
				boolean cadastrado = paciente.cadastrarPaciente();
				
				if (!cadastrado) {
					System.out.println("Erro ao cadastrar usuário, por favor tente novamente");
					break;
				}
				
				System.out.println("Usuário cadastrado com sucesso!");
				
				//inicia paciente
				
				String idEspecialista = "abc123";
				
				LocalDate dataNascimentoEspecialista = LocalDate.now();
				
				Especialista especialista = new Especialista("John Doe", "john.doe@gmail.com", "Abc%123", "Abc%123", dataNascimentoEspecialista, "NF", 
						"11 9555-0033", idEspecialista, "55869714966", "", "Psiquiatra", 0, 123);
				
				
				int opPaciente;
				
				do {
					
					opPaciente =  Integer.parseInt(JOptionPane.showInputDialog(
			            "Como paciente você pode\n"
			            + "1 - Logar\n"
			            + "2 - Buscar por especialistas\n"
			            + "3 - Logout\n"
			            + "0 - Sair\n"
					));
					
					if (opPaciente == 1) {
						
						if (paciente.isLogado == false) {

							System.out.println("Email: ");
							String emailLogin = leitor.next() + leitor.nextLine();
							
							System.out.println("Senha: ");
							String senhaLogin = leitor.next() + leitor.nextLine();
							
							if (paciente.login(emailLogin, senhaLogin)) {
								System.out.println("Login realizado com sucesso!");
							}
							else {
								System.out.println("Email ou senha inválidos");
							}
						
						}
						else {
							System.out.println("Você já está logado");
						}
						
					}
					else if (opPaciente == 2) {
						
						if (!paciente.isLogado) {
							System.out.println("Você precisa estar logado para buscar por especialistas");
						}
						
						System.out.println("Buscando os melhores especialistas para você...");
						
						System.out.println("Encontramos o especialista " + especialista.getNome());
						
					}
					else if (opPaciente == 3) {
						if (paciente.isLogado) {
							System.out.println("Logout realizado com sucesso");
							paciente.logout();
						}
						else {
							System.out.println("Calma lá! Você não pode fazer logout estando deslogado...");
						}
						
					}
					
					
				} while (opPaciente != 0);
				
				
			}
			else if (op == 2) {
				
				System.out.println("Nome: ");
				String nome = leitor.next() + leitor.nextLine();
				
				System.out.println("Email: ");
				String email = leitor.next() + leitor.nextLine();
				
				System.out.println("A senha deve conter ao menos 6 dígitos e pelo menos 1 número, 1 letra minúscula, 1 letra maiúscula e 1 caracter especial\n");
				System.out.println("Senha: ");
				String senha = leitor.next() + leitor.nextLine();
				
				System.out.println("Confirme a senha: ");
				String confirmacaoSenha = leitor.next() + leitor.nextLine();
				
				System.out.println("dd/mm/yyyy\n");
				System.out.println("Data de nascimento: ");
				String dataLida = leitor.next() + leitor.nextLine();

				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
				
				LocalDate dataNascimento = LocalDate.parse(dataLida, formatter);
				
				System.out.println("Gênero deve ser (M) masculino, (F) feminino, (NF) não informar\n");
				System.out.println("Gênero: ");
				String genero = leitor.next() + leitor.nextLine();
				
				System.out.println("(DDD) + número separado por traço\n");
				System.out.println("Telefone: ");
				String telefone = leitor.next() + leitor.nextLine();
				
				System.out.println("Especialidade: \n");
				String especialidade = leitor.next() + leitor.nextLine();
				
				System.out.println("Deseja informar CPF ou CNPJ?\n");
				String tipoDocumento = leitor.next() + leitor.nextLine();
				
				String CPF = "";
				String CNPJ = "";
				
				if (tipoDocumento.equals("CPF")) {
					System.out.println("CPF: \n");
					CPF = leitor.next() + leitor.nextLine();
				}
				else if (tipoDocumento.equals("CNPJ")) {
					System.out.println("CNPJ: \n");
					CNPJ = leitor.next() + leitor.nextLine();
				}
				else {
					break;
				}
				
				int CRM = 0;
				int CRP = 0;
				
				System.out.println("Deseja informar CRM ou CRP?\n");
				String tipoConselho = leitor.next() + leitor.nextLine();
				
				if (tipoConselho.equals("CRM")) {
					System.out.println("CRM: \n");
					CRM = leitor.nextInt();
				}
				else if (tipoConselho.equals("CRP")) {
					System.out.println("CRP: \n");
					CRP = leitor.nextInt();
				}
				else {
					break;
				}
				
				String idEspecialista = "abc123";
				
				Especialista especialista = new Especialista(nome, email, senha, confirmacaoSenha, dataNascimento, genero, telefone, idEspecialista, CPF, CNPJ, 
						especialidade, CRM, CRP);
				
				short validaSenha = especialista.validaSenha(senha, confirmacaoSenha);
				
				if(validaSenha != 0) {
					
					if (validaSenha == 1) {
						System.out.println("As senhas não são iguais");
					}
					else if (validaSenha == 2) {
						System.out.println("A senha não preenche os requisitos");
					}
					else if (validaSenha == 3) {
						System.out.println("A senha não tem o tamanho mínimo");
					}
				}
				
				boolean cadastrado = especialista.cadastrarEspecialista();
				
				if (!cadastrado) {
					System.out.println("Erro ao cadastrar usuário, por favor tente novamente");
					break;
				}
				
				System.out.println("Usuário cadastrado com sucesso!");
				
				int opEspecialista;
				
				//inicia paciente
				
				String idPaciente = "123abc";
				
				LocalDate dataNascimentoPaciente = LocalDate.now();
				
				Paciente paciente = new Paciente("John Doe", "john.doe@gmail.com", "Abc%123", "Abc%123", dataNascimentoPaciente, "NF", "11 9555-0033", idPaciente, "55869714966");
				
				//inicia agenda
				String idAgenda = "agenda1";

				String data = "24/05/2021 às 18:45";		
						
				Agenda agenda = new Agenda(idAgenda, idEspecialista, idPaciente, data);
				
				do {
					
					opEspecialista =  Integer.parseInt(JOptionPane.showInputDialog(
			            "Como especialista você pode\n"
			            + "1 - Logar\n"
			            + "2 - Consultar agenda\n"
			            + "3 - Iniciar chamada\n"
			            + "4 - Logout\n"
			            + "0 - Sair\n"
					));
					
					if (opEspecialista == 1) {
						
						if (!especialista.isLogado) {

							System.out.println("Email: ");
							String emailLogin = leitor.next() + leitor.nextLine();
							
							System.out.println("Senha: ");
							String senhaLogin = leitor.next() + leitor.nextLine();
							
							if (especialista.login(emailLogin, senhaLogin)) {
								System.out.println("Login realizado com sucesso!");
							}
							else {
								System.out.println("Email ou senha inválidos");
							}
						
						}
						else {
							System.out.println("Você já está logado");
						}
						
					}
					else if (opEspecialista == 2) {
						
						if (!especialista.isLogado) {
							System.out.println("Você precisa estar logado para consultar a agenda.");
						}
						else {
							System.out.println("Sua próxima consulta será no dia " + agenda.getData());
						}
						
					}
					else if (opEspecialista == 3) {
						
						if(!especialista.isLogado) {
							System.out.println("Você precisa estar logado para iniciar a consulta.");
						}
						else {
							
							System.out.println("Iniciando consulta...\n");
							
							System.out.println("Você está em uma consulta com " + paciente.nome);
							
							int optChamada;
							
							//inicia prontuário
							String idProntuario = "prontuario1";
							
							String comentarios = "";
							
							Prontuario prontuario = new Prontuario(idProntuario, idPaciente, idEspecialista, comentarios);
							
							//inicia chamada
							String idChamada = "chamada1";
							
							Chamada chamada = new Chamada(idChamada, idAgenda, idEspecialista, idPaciente, data);

							int volume = chamada.getVolume();
							
							do {
								
								optChamada =  Integer.parseInt(JOptionPane.showInputDialog(
						            "Escolha uma opção\n"
						            + "1 - Aumentar volume\n"
						            + "2 - Diminuir volume\n"
						            + "3 - Prontuário\n"
						            + "0 - Finalizar chamada\n"
								));
								
								if (optChamada == 1) {
									
									volume = chamada.aumentarVolume();
									
									if (volume == 100) {
										System.out.println("O volume está no máximo");
									}
									else {
										System.out.println("O volume está em " + volume);
									}
									
								}
								else if (optChamada == 2) {
									
									volume = chamada.diminuirVolume();
									
									if (volume == 0) {
										System.out.println("O volume está mutado");
									}
									else {
										System.out.println("O volume está em " + volume);
									}
									
								}
								else if (optChamada == 3) {
									
									System.out.println("Prontuário :");
									System.out.println(prontuario.getComentarios());
									String comentario = leitor.next() + leitor.nextLine();
									
									prontuario.comentar(comentario + "\n");
									
								}
								
								
							} while (optChamada != 0);

						}
						
					}
					else if (opEspecialista == 4) {
						if (especialista.isLogado) {
							System.out.println("Logout realizado com sucesso");
							paciente.logout();
						}
						else {
							System.out.println("Calma lá! Você não pode fazer logout estando deslogado...");
						}
						
					}
					
				} while (opEspecialista != 0);
				
			}
			
			
		} while (op != 0);
		
		leitor.close();
		
	}
	
}
