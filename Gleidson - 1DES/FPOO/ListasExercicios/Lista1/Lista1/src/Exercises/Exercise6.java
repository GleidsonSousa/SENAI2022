package Exercises;
import java.util.Scanner;

public class Exercise6 {
	public static Scanner entrada;

	public static void main(String[] args) {
	entrada= new Scanner (System.in);
	int r ,altura,ar,vol;
	System.out.println("digite o raio do cilindro em CM.");
	r = entrada.nextInt();
	System.out.println("Digite um valor para altira do cilindro  em CM");
	altura = entrada.nextInt();
	vol =  (r*r)*altura;
	ar = 2*r*(r+altura);
	System.out.println("O volume do cilindo é\n:"+vol+"PI" +"cm³");
	System.out.println("A área dp cilindro é\n:"+ar+"PI"+"cm²");
	}
	

	}


