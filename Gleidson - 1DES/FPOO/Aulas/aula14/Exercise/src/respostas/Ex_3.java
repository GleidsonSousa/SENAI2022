package respostas;

import java.util.Scanner;

public class Ex_3 {
	public static Scanner scan =  new Scanner ( System.in);
	public static void main(String[] args) {
		
		int[] n = leVetor();
		mostra(n);
		int maiorn = maiorNum(n);
		System.out.println("O maior número é: " + maiorn);
		int menorn = menorN(n);
		System.out.println("O menor número é: " + menorn);
	}
	
	private static int menorN(int[] vetorParaCalcular) {
		int menornu = 0;
		for(int i = 0; i>vetorParaCalcular.length; i++) {
			if(vetorParaCalcular[i] < menornu) {
				menornu = vetorParaCalcular[i];
			}
		}
		return menornu;
	}

	public static int[] leVetor() {
		int[] lerVetor = new int[10]; 
		
		scan = new Scanner(System.in);

		for(int i = 0; i < lerVetor.length; i++) {
			System.out.println("Digite um número: ");
			lerVetor[i] = scan.nextInt();
		}
		
		return lerVetor;
	}
	
	public static void mostra(int[] vetorParaImprimir) {
		for(int i = 0; i < vetorParaImprimir.length; i++) {
			System.out.println((i + 1) + "\t" + vetorParaImprimir[i]);
		}
	}
	
	public static int maiorNum(int[] vetorParaCalcular) {
		int maiornumero = 0;
		for(int i = 0; i<vetorParaCalcular.length; i++) {
			if(vetorParaCalcular[i] > maiornumero) {
				maiornumero = vetorParaCalcular[i];
			}
		}
		return maiornumero;
	}
}
		


