package exercicios;
	import java.io.IOException;
	import java.util.Random;
	import java.util.Scanner;

	public class Ex_4{
		
		static Random r = new Random();
		static Scanner scan = new Scanner(System.in);
		
		public static void main(String[] args) throws IOException{
			System.out.print("Digite a quantidade de  nomes que voc� dejesa ");
			int n =  scan.nextInt();
			int dados[] = nomesale(n);
			System.out.print("Digite o nome que quer encontrar");
			String b = scan.next();
			mostrarDados(dados);
			boolean resultado = buscaSimples(dados,b);
			System.out.println("O resultado da sua Busca:"+resultado);
			
		}

	private static boolean buscaSimples(int[] dados, String b) {
		                                                                                                                                  
			return false;
		}

	private static int[] nomesale(int n) {
		
			return null;
		}

	private static void mostrarDados(int[] dados) {
			
			
		}

	
	}