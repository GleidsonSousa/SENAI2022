package exemploclassicos;

import java.util.Scanner;

public class Fatorial {
public static Scanner ler;
	public static void main(String[] args) {
		ler = new Scanner (System.in);
	int fato = 0  ;
	System.out.println("Digite um  numero");
	fato =  ler.nextInt();
	System.out.println("A fatorial de:" + fato + "\n�:" + Fatorial(fato));
	}
		public static int Fatorial( int numero) {
		int fat = 1;	
			for (int i = 1; i <= numero; i++) {
				fat *= i;

	}
			return fat;
		}
}
