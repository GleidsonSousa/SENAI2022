package iniciante;
// se for testar na beecrowd tirar o package e mudar a class Ex_1035 para Main.

	
	import java.io.IOException;
	import java.util.Scanner;

	public class Ex_1035 {
	    
	    public static void main(String[] args) throws IOException {
	        Scanner leitor = new Scanner(System.in);
	        int a = leitor.nextInt();
	        int b = leitor.nextInt();
	        int c = leitor.nextInt();
	        int d = leitor.nextInt();
	        if (b > c && d > a && c > 0 && d > 0 && (c + d) > (a + b) && a % 2 == 0) {
	            System.out.println("Valores aceitos"); 
	        } else { 
	            System.out.println("Valores nao aceitos");
	        }
	        
	    }
	    
	}