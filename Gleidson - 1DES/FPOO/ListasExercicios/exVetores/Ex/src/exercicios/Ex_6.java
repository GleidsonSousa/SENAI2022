package exercicios;
import java.util.Scanner;

public class Ex_6 {
public static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("Digite quantos números deseja inserir no vetor");
		int qtde = sc.nextInt();
		
		int[] vec = new int[qtde];
		
		int qtdeImp = 0, qtdePar = 0;
		
		for (int i = 0; i < vec.length; i++) {
			System.out.println("Digite um número");
			vec[i] = sc.nextInt();
			
			if(vec[i] % 2 == 0) {
				qtdePar++;
			} else {
				qtdeImp++;
			}
		}
		
		int[] imp = new int[qtdeImp];
		int[] par = new int[qtdePar];
		
		for (int i = 0; i < par.length; i++) {
			par[i] = 1;
		}
		
		for (int i = 0; i < imp.length; i++) {
			imp[i] = 0;
		}
		
		for (int i = 0; i < vec.length; i++) {
			if(vec[i] % 2 == 0) {
				for (int j = 0; j < par.length; j++) {
					if(par[j] == 1) {
						par[j] = vec[i];
						break;
					}
				}
			} else {
				for (int j = 0; j < imp.length; j++) {
					if(imp[j] == 0) {
						imp[j] = vec[i];
						break;
					}
				}
			}
		}
		
		System.out.println("Pares:");
		
		for (int i = 0; i < par.length; i++) {
			System.out.print(par[i] + " ");
		}
		
		System.out.println("\n\nImpares:");
		
		for (int i = imp.length - 1; i >= 0; i--) {
			System.out.print(imp[i] + " ");
		}
	}
}