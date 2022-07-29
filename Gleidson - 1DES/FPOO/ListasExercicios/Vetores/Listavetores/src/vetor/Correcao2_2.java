package vetor;

import java.util.Scanner;

public class Correcao2_2 {

	public static Scanner ler;
	
	public static void main(String[] args) {

			
			int[] idades = leVetor();
			mostra(idades);
			int maiorIdade = maiorIdade(idades);
			System.out.println("A maior idade é: " + maiorIdade);
		}
		
		public static int[] leVetor() {
			int[] lerVetor = new int[5]; 
			
			Scanner input = new Scanner(System.in);
			for(int i = 0; i < lerVetor.length; i++) {
				System.out.println("Digite uma idade: ");
				lerVetor[i] = input.nextInt();
			}
			
			return lerVetor;
		}
		
		public static void mostra(int[] vetorParaImprimir) {
			for(int i = 0; i < vetorParaImprimir.length; i++) {
				System.out.println((i + 1) + "\t" + vetorParaImprimir[i]);
			}
		}
		
		public static int maiorIdade(int[] vetorParaCalcular) {
			int maiorIdade = 0;
			for(int i = 0; i<vetorParaCalcular.length; i++) {
				if(vetorParaCalcular[i] > maiorIdade) {
					maiorIdade = vetorParaCalcular[i];
				}
			}
			return maiorIdade;
		}
	}