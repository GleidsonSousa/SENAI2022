package respostas;

import java.util.Scanner;

public class Ex_6 {
public static Scanner scan =  new Scanner (System.in);
	public static void main(String[] args) {
		int numImp = 0;
		int numPar = 0;
		
		System.out.println("Digite um n�mero: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite outro n�mero maior que o anterior: ");
		int num2 = scan.nextInt();
		
		for (int k = num1; k <= num2; k++) {
			
			if(k % 2 != 0) {
				
				numImp += k;
				
			}
		}
		System.out.println("\nA soma total dos n�mero �mpares � : " + numImp + "\n");
		
		for (int j = num1; j <= num2; j++) {
			
			if(j % 2 == 0) {
				
				numPar += j;
				
			}
		}
		
		System.out.println("\nA soma total dos n�meros pares � :" + numPar + "\n");
	
	        
	        }
			
		}
	
	