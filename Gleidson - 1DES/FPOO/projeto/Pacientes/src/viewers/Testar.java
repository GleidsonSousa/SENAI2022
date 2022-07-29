package viewers;

import java.util.Scanner;

import controles.FuncionarioProcess;

public class Testar{

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		FuncionarioProcess.carregar();
		System.out.print("Digite o nome do Funcionário:");
		int indice = FuncionarioProcess.checarEmail(scan.next());
		if (indice != -1) {
			System.out.print("Digite a senha:");
			if(FuncionarioProcess.checarSenha(indice, scan.next())) {
				System.out.println("Login permitido");	
			}else {
				System.out.println("Login negado (Verifique a senha)");
			}
		} else {
			System.out.println("Funcionário não encontrado!");
			System.out.println("Entre em contato com o suporte");
		}
	}

}