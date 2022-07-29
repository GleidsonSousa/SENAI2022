package exemploclassicos;

import java.util.Scanner;

public class Banco {
public static void main(String[] args) throws InterruptedException{
		
		Scanner teclado = new Scanner(System.in);
		Scanner digito = new Scanner(System.in);
		
		System.out.println("------------------------");
		System.out.println("       EMPRESTIMO       ");
		System.out.println("------------------------");
		System.out.println(" ");
		
		System.out.println("Olá Seja bem vindo a nossa empresa de emprestimos");
		System.out.print("Poderia nós dizer o seu nome: ");
		String nome = solicitarNome(digito);
		
		System.out.print("Senhor(a): " + nome + " Poderia nós informar sua idade: ");
		int idade = teclado.nextInt();
		
		if( idade >= 18) {
			
			System.out.print("Poderia nos dizer sua renda mensal: ");
			int renda = teclado.nextInt();
			
			if(renda >= 1100) {
				
				System.out.print("Qual valor você gostaria de fazer emprestimo: ");
				int valoremprestimo = teclado.nextInt();
				
				if(valoremprestimo >= 2000 && valoremprestimo <= 20000) {
					
					System.out.println("Valor do emprestimo: " + valoremprestimo);
					System.out.println("Gostaria de continuar? [S/N] ");
					String confirmacao = teclado.next();
					
					if(confirmacao.equalsIgnoreCase("s")) {
						System.out.println("Parabéns, agora precisamos de alguns dados ok? ");
						System.out.println("Digite seu email: ");
						String email = solicitarEmail(digito);
						
						System.out.print("Precisamos também do seu endereço: ");
						String endereco = solicitarEndereco(digito);
						
						System.out.println("Digite seu CPF: (OBS: Coloque pontos) ");
						String cpf = solicitarCpf(digito);
						
						System.out.println("Digite um numero de celular valido (Exp: (DDD) numero) ");
						String celular = solicitarCelular(digito);
						
						System.out.print("Por favor Aguarde ! ");
						for(int i = 0; i < 15 ; i++) {
							Thread.sleep(1000);
							System.out.print("." + " ");
						}
						
						System.out.println("");
						System.out.println("--------------------------------------------");
						System.out.println("       EMPRESTIMO REALIZADO COM SUCESSO       ");
						System.out.println("--------------------------------------------");
						System.out.println("");
						
						System.out.println("Nome: " + nome);
						System.out.println("Idade: " + idade);
						System.out.println("Renda Mensal: R$" + renda + " Reais");
						System.out.println("Emprestimo Solicitado: R$" + valoremprestimo + " Reais");
						System.out.println("Email: " + email);
						System.out.println("Endereço: " + endereco);
						System.out.println("CPF: " + cpf);
						System.out.println("Telefone: +55 " + celular);
						System.out.println(" ");
					
					} else if(confirmacao.equalsIgnoreCase("n")) {
						System.out.println("Muito Obrigado, Volte Sempre");
					} else {
						System.out.println("Erro!");
					}
				} else if ( valoremprestimo <=0) {
					System.out.println("Erro ! Impossivel realizar emprestimo");
				}
			} else {
				System.out.println("Senhor(a): " + nome+ " você não possui renda suficiente para realizar um emprestimo ! ");
			}
		} else {
			System.out.println("Senhor(a): " + nome +" Você ainda não possui idade suficiente para realizar um emprestimo ! ");
		}
		teclado.close();
		digito.close();
	}
	
	private static String solicitarCelular(Scanner digito) {
		String celular = digito.nextLine();
		
		if((celular == null) || (celular.isEmpty())){
			System.out.println("Celular invalido ou vazio");
			return solicitarCelular(digito);
		}
		return celular;
	}
	
	private static String solicitarCpf(Scanner digito) {
		String cpf = digito.nextLine();
		
		if((cpf == null) || (cpf.isEmpty())){
			System.out.println("CPF invalido ou vazio");
			System.out.println("Digite seu CPF novamente:");
			return solicitarCpf(digito);
		}
		return cpf;
	}
	
	private static String solicitarEndereco(Scanner digito) {
		String endereco = digito.nextLine();
		
		if((endereco == null) || (endereco.isEmpty())) {
			System.out.println("Endereço invalido ou vazio");
			System.out.print("Digite seu endereço novamente: ");
			return  solicitarEndereco(digito);
		}
		return endereco;
	}
	
	private static String solicitarNome(Scanner digito) {
		String nome = digito.nextLine();
		 
		if( (nome == null ) || (nome.isEmpty()) ) {
			System.out.println("Nome Invalido ou vazio");
			System.out.print("Digite seu nome novamente: ");
			return solicitarNome(digito); 
		}
		return nome; 
	} 
	
	private static String solicitarEmail(Scanner digito) {
		String email = digito.nextLine();
		
		if((email == null) || (email.isEmpty())) {
			System.out.println("Email null ou vazio");
			System.out.print("Digite seu Email novamente: ");
			return solicitarEmail(digito);
		}
		
		if(!email.contains("@")) {
			System.out.println("Email invalido...");
			System.out.println("Digite um email valido: ");
			return solicitarEmail(digito); 
		}
		return email;
	}
}

				
