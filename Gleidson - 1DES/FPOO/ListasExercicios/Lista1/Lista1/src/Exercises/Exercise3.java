package Exercises;
import java.util.Scanner;

public class Exercise3 {
public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner (System.in);
		int n,soma,sub;
		System.out.println("Digite um n�mero");
		n = entrada.nextInt();
	soma = n +1;
	sub = n - 1;
			
		
		System.out.println("o resultado da soma �:\n"+soma + "\no resultado da subtra��o �:\n"+sub);
	}
}