package respostas;

import java.util.Scanner;

public class Ex_4 {
	public static Scanner scan =  new Scanner ( System.in);
	public static void main( String[] args ) {
		 System.out.println( "Digite o Número que dejesa saber a fatorial" );
	      int numero = scan.nextInt();
	      
	      
	      System.out.println( "A fatorial de: " + numero + " é: " + fatorial( numero ) );      
					}
	 
	   public static int fatorial( int numero ) {
	      int fact = 1;
	      for( int i = 1; i <= numero; i++ ) {
	         fact *= i;
	      	}
	 
	      return fact;
	 
	   }
	}