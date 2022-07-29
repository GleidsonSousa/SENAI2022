package Exercises;

import java.util.Scanner;

public class Exercise5 {
	public static Scanner entrada;
	public static void main(String[] args) {
	entrada = new Scanner (System.in);
	int qa,qc,result0,result1,result2;
	
	System.out.println("Digite a quantidade de alquieres de sua fazenda ");
	qa = entrada.nextInt();
	System.out.println("Digite a quantidade de caminhões usados no transporte das laranjas");
	qc = entrada.nextInt();
	result0 = qa*250;
	result1 = qc*18;
	result2 = result0 / result1;
	
	System.out.println("Total de viagens \n"+result2);
	}
}
