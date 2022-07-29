package Exercises;

import java.util.Scanner;

public class Exercise2 {
public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner (System.in);
		int  velocidade,km,result;
		System.out.println("Digite a velocidade em KM/H que o veiculo esta se movendo");
		velocidade = entrada.nextInt();
		System.out.println("Digite a distância em km que o veiculo irá percorrer ");
		km = entrada.nextInt();
		result = km / velocidade;
		System.out.println("O percurso irá durar\n:"+result + "Horas");
		
		
	}

}