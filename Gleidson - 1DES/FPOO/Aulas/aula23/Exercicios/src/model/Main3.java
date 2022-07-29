package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		Ex2 arq = new Ex2 ();
		Scanner input = new Scanner(System.in);
		
		int opcao = 0;
		
		do {
			System.out.println("1 - Cadastrar Aluno;");
			System.out.println("2 - Listar Alunos;");
			System.out.println("3 - Sair;");
			opcao = input.nextInt();
			input.nextLine();
			
			switch(opcao) {
				case 1: 
					System.out.println("Informe o seu nome : ");
					String nome = input.nextLine();
					
					System.out.println("Informe as Notas (Exemplo: 1,5,6) : ");
					int a = input.nextInt();
					int b = input.nextInt();
					int c = input.nextInt();
				
					
					
					String data = "Nome do Aluno(a): "+nome + ";\t" +"Primeira Nota: "+ a + 
					";\t"+"Segunda Nota: "+ b +";\t"+ "Terceira Nota: "+ c;
					
					arq.escrever(data, "Alunos", true);
					break;
				case 2:
					ArrayList<String> infoFile = arq.ler("Alunos");
					
					System.out.println("Informe o nome que deseja localizar : ");
					String busca = input.nextLine();
					
					for(String linha : infoFile) {
						String[] temp = linha.split(";");
						if(temp[1].toLowerCase().contains(busca.toLowerCase())) {
							System.out.println("Nome : " + temp[0]);
							System.out.println("Idade : " + temp[1]);
						
							
						}
					}
					break;
				case 3:
					System.out.println("Good Night :) very much obrigado for using my program");
					break;
			}
		}while(opcao != 3);
		
		
		
	}

}