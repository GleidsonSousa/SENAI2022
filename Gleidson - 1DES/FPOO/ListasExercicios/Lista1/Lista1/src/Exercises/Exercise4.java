package Exercises;

import java.util.Scanner;

public class Exercise4 {
	public static Scanner entrada;
	public static void main(String[] args) {
	entrada = new Scanner (System.in);
	int cv,km,result;
	System.out.println("Digite a distância em km a ser percorrida");
	km = entrada.nextInt();
	cv = 900;
	result = km/ cv;
	System.out.println("o cruzeiro de um avião 747-300 levará\n "+result+ " HORA(s) para completar o trajeto");

	}

}
