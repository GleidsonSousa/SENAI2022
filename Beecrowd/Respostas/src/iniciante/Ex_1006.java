package iniciante;
// se for testar na beecrowd tirar o package e mudar a class Ex_1006 para Main.
import java.io.IOException;
import java.util.Scanner;

public class Ex_1006 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double media = ((A * 2) + (B * 3) + (C * 5)) / 10;
        System.out.println(String.format("MEDIA = %.1f" , media));
    }
	
}