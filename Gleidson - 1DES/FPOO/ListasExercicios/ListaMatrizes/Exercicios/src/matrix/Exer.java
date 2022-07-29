package matrix;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Exer {

	static Random rand = new Random();
	public static Scanner scan;

	public static void main(String[] args) throws IOException {
		scan = new Scanner(System.in);
		int menu = 0;
		mostrarOpcoes();
		menu = scan.nextInt();

		while (menu != 9) {
			
			switch (menu) {
			case 1: 
				exercicio1(5,5);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
				default :
					System.out.println("Erro,digite uma opção válida!.");
			
			
			
			}
		}
	}



	static void exercicio1(int l, int c) {
		int x[][] = new int[l][c];
		int maior = 0;
		for(int i = 0; i < l; i++)
			for(int j = 0; j < c; j++)
				x[i][j] = rand.nextInt(100);

		for(int i = 0; i < l; i++) {
			for(int j = 0; j < c; j++)
				System.out.print(x[i][j]+"\t");
			System.out.println();
			break;
			}
		}
	
		
	
public static void mostrarOpcoes() {
	String[] vetor_opcoes = new String[9];
	vetor_opcoes[0] = " [1]  Exercício 1.";
	vetor_opcoes[1] = " [2]  Exercício 2.";
	vetor_opcoes[2] = " [3]  Exercício 3.";
	vetor_opcoes[3] = " [4]  Exercício 4.";
	vetor_opcoes[4] = " [5]  Exercício 5.";
	vetor_opcoes[5] = " [6]  Exercício 6.";
	vetor_opcoes[6] = " [7]  Exercício 7.";
	vetor_opcoes[7] = " [8]  Exercício 8.";
	vetor_opcoes[8] = " [9]  Sair.";
	
	
	for(int i = 0; i < vetor_opcoes.length; i++) {
		System.out.println(vetor_opcoes[i]);
		}
	}
}