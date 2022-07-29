package Exercises;

import java.util.Scanner;

public class Exercise7 {
public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner (System.in);
		Double m,v,result;
		System.out.println("Digite o valor da Massa da barra");
		m =  entrada.nextDouble();
		System.out.println("Digite o valor do volume da barra");
		v = entrada.nextDouble();
		result = m/v;
		System.out.println("A densidade da barra é:\n"+result);
	}
	

}