package exercicios;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ex_4{
	
	static Random r = new Random();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException{
		String[] c = new String[10];
		
		for (int i = 0; i < c.length; i++) {
			System.out.println("Digite um nome");
			c[i] = scan.next();
		}
		
		System.out.println("\nDigite um nome para ser buscado");
		String nome = scan.next();
		boolean achou = false;
		for (int i = 0; i < c.length; i++) {
			if (c[i].equals(nome)) {
				System.out.println("ACHEI");
				achou = true;
			}
		}
		
		if (!achou) {
			System.out.println("NÃO ACHEI");
		}		
	}
}