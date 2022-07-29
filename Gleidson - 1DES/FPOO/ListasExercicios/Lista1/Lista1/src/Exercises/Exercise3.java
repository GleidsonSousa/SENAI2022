package Exercises;
import java.util.Scanner;

public class Exercise3 {
public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner (System.in);
		int n,soma,sub;
		System.out.println("Digite um número");
		n = entrada.nextInt();
	soma = n +1;
	sub = n - 1;
			
		
		System.out.println("o resultado da soma é:\n"+soma + "\no resultado da subtração é:\n"+sub);
	}
}