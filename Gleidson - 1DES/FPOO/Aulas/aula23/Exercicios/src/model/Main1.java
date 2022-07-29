package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		
		Ex1 arq = new Ex1 ();
		Scanner input = new Scanner(System.in);
		
		int opcao = 0;
		
		do {
			System.out.println("1 - Cadastrar Poessoa;");
			System.out.println("2 - Listar Pessoas;");
			System.out.println("3 - Sair;");
			opcao = input.nextInt();
			input.nextLine();
			
			switch(opcao) {
				case 1: 
					System.out.println("Informe o seu nome : ");
					String nome = input.nextLine();
					
					System.out.println("Informe seu ano de Nascimento (Exemplo: 2002,2003) : ");
					int ano = input.nextInt();
					int Ano = 2022 - ano;
					
					String data = "Nome: "+nome + " ;\n" +"Idade: "+ Ano + " ;";
					
					arq.escrever(data, "Pessoas", true);
					break;
				case 2:
					ArrayList<String> infoFile = arq.ler("Pessoas");
					
					for(String linha : infoFile) {
						System.out.println(linha);
						
						
						}
					
					break;
				case 3:
					System.out.println("Isso é tudo pessoal :D ");
					break;
			}
		}while(opcao != 3);
		
		
		
	}

}