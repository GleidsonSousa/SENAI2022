package Exercises2;

import java.util.Scanner;

public class Exercise1 {
public static Scanner enrada;
	public static void main(String[] args) {
	try (Scanner entrada = new Scanner (System.in)) {
		int A, B, C;
		
		System.out.print("Insira o valor do 1� lado: ");
		A = entrada.nextInt();
		System.out.print("Insira o valor do 2� lado: ");
		B = entrada.nextInt();
		System.out.print("Insira o valor do 3� lado: ");
		C = entrada.nextInt();
		
		if (A == B && B == C) {
			System.out.println("O triangulo � Equil�tero.");
		} else if (A != B && B != C) {
			System.out.println("O triangulo � Escaleno");
		} else if(A != B && B == C ){
			System.out.println("O triangulo � Is�sceles.");
		}
	}
	}
}