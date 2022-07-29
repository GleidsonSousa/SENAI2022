package model;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main2 {
	static Random round = new Random();
	public static void main(String[] args) {
	
		
		Ex2 arq = new Ex2 ();
		
		Scanner input = new Scanner(System.in);
		
		int opcao = 0;
		
		do {
			System.out.println("1 - Escolha quantos números você quer gerar :D;");
			System.out.println("2 - Listar números em ordem Crescente ;");
			System.out.println("3 - Sair;");
			opcao = input.nextInt();
			input.nextLine();
			
			switch(opcao) {
				case 1: 
					System.out.print("Digite a quantidade dos números (Exemplo: 10,21,22): ");
					int n = input.nextInt();
					int    dados[] = numerosAleatorios(n);
					
	
				
					
					
					String data = "";
					
					arq.escrever(data, "Numeros", true);
					break;
				case 2:
						ArrayList<String> infoFile = arq.ler("Numeros");
					
							for(String linha : infoFile) {
								System.out.println(linha);
						
						
								}
					break;
				case 3:
					System.out.println("Falue mecie");
					break;
			}
		}while(opcao != 3);
		
		
		
		}
	private static int[] numerosAleatorios(int n) {
		
		return null;
	}
	}

