package iniciante;
// se for testar na beecrowd tirar o package e mudar a class Ex_1008 para Main.
import java.io.IOException;
import java.util.Scanner;

public class Ex_1008 {
	
	public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int funcionarios = leitor.nextInt();
        int horas = leitor.nextInt();
        double valorPorHora = leitor.nextDouble();
        double salario = horas * valorPorHora;
        System.out.println("NUMBER = " + funcionarios);
        System.out.println(String.format("SALARY = U$ %.2f" , salario));
    }
	
}