package iniciante;
// se for testar na beecrowd tirar o package e mudar a class Ex_1017 para Main.

	
	import java.io.IOException;
	import java.util.Scanner;

	public class Ex_1017 {
		
	    public static void main(String[] args) throws IOException {
	        Scanner leitor = new Scanner(System.in);
	        int tempo = leitor.nextInt();
	        int velocidade = leitor.nextInt();
	        double kilometros = tempo * velocidade;
	        double media = kilometros / 12;
	        System.out.println(String.format("%.3f", media)); 
	    }
		
	}