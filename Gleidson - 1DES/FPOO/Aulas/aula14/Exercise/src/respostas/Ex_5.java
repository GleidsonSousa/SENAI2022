package respostas;

import java.util.Scanner;

public class Ex_5 {
public static Scanner scan =  new Scanner (System.in);
	public static void main(String[] args) {

		System.out.println("Digite o preço do Xérox na sua Loja");
		
		double vl = scan.nextDouble();
		
		System.out.println("\n\n");
		
		int cont = 1;
		
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("%d: %.2f __-__ ",cont ,vl*cont);
				cont++;
			}
			System.out.println();
		}
		
		

	}

}
