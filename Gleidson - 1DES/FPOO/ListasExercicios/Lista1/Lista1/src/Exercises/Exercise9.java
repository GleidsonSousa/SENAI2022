package Exercises;

import java.util.Scanner;

public class Exercise9 {
	public static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner (System.in);
		int v1,v2,soma;
		System.out.println("Digite o 1� n�mero \n");
	v1 = entrada.nextInt();
	System.out.println("Digite o 2� n�mero \n ");
	v2 = entrada.nextInt();
	soma = v1+v2;
	System.out.println("\nA soma dos valores  �:\n"+soma);
	}
	

}