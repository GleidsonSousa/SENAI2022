package vetor;
import java.util.Scanner;
public class Lista2_1{


		public static Scanner leia;
		
			public static void main(String[] args) {
				leia = new Scanner(System.in);
				int opcao = 0;
				
				while(opcao != 2) {
					opcoes();
					opcao = leia.nextInt();	
					switch(opcao) {
						case 1: 
							mostrar();
							break;
						case 2: 
									System.out.println("Bye,bye.");
						break;
						}
					}	
				}	
			
			public static void mostrar() {
				leia = new Scanner(System.in);
				int[] vetor_opcoes = new int [5];
				vetor_opcoes[0] = 2;
				vetor_opcoes[1] = 4;
				vetor_opcoes[2] = 5;
				vetor_opcoes[3] =6;
				vetor_opcoes[4] = 8;
				System.out.println("Indice\tValor");
				for(int i = 0; i < vetor_opcoes.length; i++) {
					System.out.println(i +"\t"+vetor_opcoes[i]);}
			}
			
			
						public static void opcoes() {
							String[] vetor_opcoes = new String[2];
							vetor_opcoes[0] = "1. Exercicio ";
							vetor_opcoes[1] = "2. Sair ";
							
							for(int i = 0; i < vetor_opcoes.length; i++) {
								System.out.println(vetor_opcoes[i]);
						
							}
						}
					}