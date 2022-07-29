package Exercises;

import java.util.Scanner;

public class Exercise1 {
	public static Scanner entrada;
	public static void main(String[] args) {
	entrada = new Scanner (System.in);
	int  a,b,c,result;
	System.out.println("Digite um valor para a");
	a = entrada.nextInt();
	System.out.println("Digite um valor para b");	
	b = entrada.nextInt();
	System.out.println("Digite um valor para c");
	c =  entrada.nextInt();
	result = (a+b)/c;
	System.out.println("O resultado do calculo é:\n"+result);
	
	
	
	}
	

}
