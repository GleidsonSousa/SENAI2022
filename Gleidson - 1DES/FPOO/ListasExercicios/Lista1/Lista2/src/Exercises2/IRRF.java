package Exercises2;

import java.util.Scanner;
public class IRRF {
public static Scanner entrada;
public static void main(String[] args) {
			
			entrada = new Scanner(System.in);
			double salario, desconto;
			float porcentagem;
		
			System.out.print("Digite o valor do seu salário: ");
			salario = entrada.nextDouble();
			
		
			if(salario <=1903.98) {
				porcentagem = 0f;
			}else if(salario <=2826.65) {
				porcentagem = 7.5f;
			}else if(salario <=3751.05){
				porcentagem = 15f;
			}else if(salario <=4664.68 ){
				porcentagem = 22.5f;
			} else if(salario >=4664.69){
				porcentagem = 27.5f;
			} else {
				porcentagem = 7.5f;		
			} 
			if(porcentagem == 0f)
				desconto = 0.00;
			else
				desconto = salario * porcentagem / 100;	
			
			System.out.printf("A alíquota aplicada é %.2f%% \n",porcentagem);
			System.out.printf("O desconto de IRRF é %.2f\n",desconto);
			System.out.printf("Você vai receber %.2f\n",salario  - desconto);	
		}

	}