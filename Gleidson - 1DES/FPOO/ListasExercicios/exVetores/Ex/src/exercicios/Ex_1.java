package exercicios;

import java.util.Scanner;

public class Ex_1 {
public static Scanner sc =  new Scanner (System.in);
	public static void main(String[] args) {
		int [] n = new int [10];
		System.out.println("Digite uma sequ�ncia de 10 n�meros inteiros.");
		n [0]=  sc.nextInt();
		n [1]=  sc.nextInt();
		n [2]=  sc.nextInt();
		n [3]=  sc.nextInt();
		n [4]=  sc.nextInt();
		n [5]=  sc.nextInt();
		n [6]=  sc.nextInt();
		n [7]=  sc.nextInt();
		n [8]=  sc.nextInt();
		n [9]=  sc.nextInt();
		
		
		System.out.println("\nSequ�ncia dos n�meros na ordem normal:");
		
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
			
		}
		
		System.out.println("\n Na ordem inversa:");
		
		for (int i = n.length - 1; i >= 0 ; i--) {
			System.out.print(n[i] + " ");
		}

	}

}
