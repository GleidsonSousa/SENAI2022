package iniciante;
// se for testar na beecrowd tirar o package e mudar a class Ex_1019 para Main.

	
	import java.io.IOException;
	import java.util.Scanner;

	public class Ex_1019 {
		
	    public static void main(String[] args) throws IOException {
	        Scanner leitor = new Scanner(System.in);
	        int duracaoSegundos = leitor.nextInt();
	        int horas = duracaoSegundos / 3600;
	        duracaoSegundos -= horas * 3600;
	        int minutos = duracaoSegundos / 60;
	        duracaoSegundos -= minutos * 60;
	        int segundos = duracaoSegundos;
	        System.out.println(horas + ":" + minutos + ":" + segundos);		
	    }
		
	}