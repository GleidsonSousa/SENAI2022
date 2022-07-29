package iniciante;
// se for testar na beecrowd tirar o package e mudar a class Ex_1007 para Main.
import java.io.IOException;
import java.util.Scanner;

public class Ex_1007 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int d = leitor.nextInt();
        int diferenca = a * b - c * d;
        System.out.println("DIFERENCA = " + diferenca);
    }
	
}