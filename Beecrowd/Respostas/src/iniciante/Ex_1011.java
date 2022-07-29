package iniciante;
// se for testar na beecrowd tirar o package e mudar a class Ex_1011 para Main.
import java.io.IOException;
import java.util.Scanner;

public class Ex_1011 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double pi = 3.14159;
        double raio = leitor.nextDouble();
        double volume = (4.0 / 3) * pi * Math.pow(raio, 3.0);
        System.out.println(String.format("VOLUME = %.3f", volume));
    }
	
}