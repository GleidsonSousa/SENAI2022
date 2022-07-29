
package respostas;

import java.util.Scanner;

public class Ex_2 {

	public static Scanner scan;

	public static void main(String[] args) {
		
		        scan = new Scanner(System.in);
		       System.out.println("Digite um valor inteiro (EXEMPLO = 1):\n");
		      int num1 = scan.nextInt();
		        System.out.println("Digite outro valor inteiro maior que o anterior:\n");
		        int num2 =scan.nextInt();
		        int somapares = 0;
		        for ( int i = num1 ; i < num2; i++){
		        if (i % 2 == 0 );
		        somapares = i+i;
		        System.out.println("\t"+"Soma dos pares entre:\t"+num1+"\te\t" + num2+"\té=\t"+somapares);
		        
		  
	}}}