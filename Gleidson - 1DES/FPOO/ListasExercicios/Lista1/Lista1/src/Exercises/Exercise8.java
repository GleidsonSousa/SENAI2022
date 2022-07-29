package Exercises;

import java.util.Scanner;

public class Exercise8 {
	public static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner (System.in);
		Double v1,v2,resto;
		System.out.println("Digite o 1° valor \n");
	v1 = entrada.nextDouble();
	System.out.println("Digite o 2° valor \n ");
	v2 = entrada.nextDouble();
	resto = v1/v2;
	System.out.println("\nO resto é:\n"+resto);
	}
	

}