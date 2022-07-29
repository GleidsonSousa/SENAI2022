package iniciante;
// se for testar na beecrowd tirar o package e mudar a class Ex_1038 para Main.
	
	import java.io.IOException;
	import java.util.Scanner;

	public class Ex_1038 {

		public static void main(String[] args) throws IOException {
			Scanner leitor = new Scanner(System.in);
			int codigo = leitor.nextInt();
			int quantia = leitor.nextInt();
			double total;
			switch (codigo) {
				case 1:	total = quantia * 4.00; break;
				case 2: total = quantia * 4.50; break;
				case 3: total = quantia * 5.00; break;
				case 4: total = quantia * 2.00; break;
				case 5: total = quantia * 1.50; break;
				default: total = 0;
			}
			System.out.println(String.format("Total: R$ %.2f", total));
		}
		
	}