package iniciante;
// se for testar na beecrowd tirar o package e mudar a class Ex_1003 para Main.
import java.io.IOException;
import java.util.Scanner;

public class Ex_1003 {

	public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int soma = a + b;
        System.out.println("SOMA = " + soma);
    }
	
}