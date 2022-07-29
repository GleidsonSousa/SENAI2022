package iniciante;
// se for testar na beecrowd tirar o package e mudar a class Ex_1004 para Main.

import java.io.IOException;
import java.util.Scanner;

public class Ex_1004 {
		
	    public static void main(String[] args) throws IOException {
	        Scanner leitor = new Scanner(System.in);
	        int a = leitor.nextInt();
	        int b = leitor.nextInt();
	        int prod = a * b;
	        System.out.println("PROD = " + prod);
	    }
		
	}