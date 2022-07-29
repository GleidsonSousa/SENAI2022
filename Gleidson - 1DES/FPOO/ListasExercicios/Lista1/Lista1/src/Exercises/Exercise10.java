package Exercises;

import java.util.Scanner;

public class Exercise10 {
	public static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner (System.in);
		double at,R;
		int pacotes;
		float x,result,X ;
		System.out.println("Digite a área em m2");
	at = entrada.nextDouble();
	R = at * 10;
	x = (float) (R/3.7);
	X = x/10;
	pacotes =  (int) (x/10);
	System.out.println("A quantidade de pacotes usados será:\n"+pacotes);
	System.out.println("Quantidade de quilos da Pedra mineira\n"+x+"kg");

	result = (float) (X*130);
	
	
	System.out.println("O dinheiro gasto será\n"+"R$"+result);
	}
	

}