package visao;

import java.util.Scanner;

import controle.ProcessaDados3;

public class Tela {

	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("----------------------------");
		System.out.println("BEM VINDO(A)!\n");
		System.out.println("Digite os dados abaixo para continuar:");
		System.out.println("Email de Login\t Exemplo: 123abc@email.com");
		String email = s.next();

		System.out.println("Digite sua senha");
		String senha = s.next();

		ProcessaDados3.carregar();
		ProcessaDados3.saida(email, senha);
	}

}