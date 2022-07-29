package respostas;

import java.util.Scanner;

public class Ex_1 {
 public static Scanner scan;
	public static void main(String[] args) {
		 scan = new Scanner(System.in);
	       System.out.println("Digite um valor inteiro (EXEMPLO = 1):\n");
	      int num1 = scan.nextInt();
	        System.out.println("Digite outro valor inteiro maior que o anterior:\n");
	        int num2 =scan.nextInt();
	        int pares = 0;
	        for ( int i = num1 ; i < num2 ; i+=2){
	        	if(i %2 ==0);
	        	pares = i +1;
	     
	        System.out.println(pares);

	}

}
}

