package exercicios;

import java.util.Scanner;

public class Ex_6 {
public static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		int a;
		System.out.println("Digite a Quantidade de N�meros que dejesa organizar:");
		a =  sc.nextInt();
		
		int[] numeros = new int[a];
		for(int i = 0; i < a; i++) {
			System.out.print("N�meros["+i+"]: ");
			numeros[i] = sc.nextInt();
			int b;
			System.out.println("Digite a Quantidade de N�meros que dejesa organizar:");
			b =  sc.nextInt();
			
			int[] num = new int[b];
			for(int j = 0; i < b; i++) {
				System.out.print("N�meros["+j+"]: ");
				num[i] = sc.nextInt();
			

			}
		}
	}
}