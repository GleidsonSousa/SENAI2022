package Ex3;
import java.util.Scanner;

public class Cases{
	private static Scanner leia;
	public static void main(String[] args)  {
		leia = new Scanner(System.in);
		int opcao = 0;
		while(opcao != 11) {
			System.out.println("Digite uma op��o:");
			System.out.println("1-Programa1\t5-Programa5\t9-Programa9");
			System.out.println("2-Programa2\t6-Programa6\t-10Programa10");
			System.out.println("3-Programa3\t7-Programa7\t11-Sair");
			System.out.println("4-Programa4\t8-Programa8");
			opcao = leia.nextInt();
			switch(opcao) {
			case 1: 
				for (int i = 10; i <= 200; i++) {
				System.out.println(i);
				}
				break;
			case 2: for (int i = 200; i > 0; i--){
				System.out.println(i);
			}
				break;
			case 3: System.out.println("Digite um valor inteiro");
				int valor = leia.nextInt();
				for(int i = 0; i < valor; i++) {
				System.out.println(i);
				}
				break;
			case 4:System.out.println("Digite o primeiro valor inteiro");
			int valor1 = leia.nextInt();
			System.out.println("Digite o segundo valor inteiro,sendo maior que o primeiro valor");
			int valor2 = leia.nextInt();
			for (int i = valor1; i < valor2; i++){
				System.out.println(i);
			}
			break;
			case 5: System.out.println("Digite o primeiro valor inteiro");
			int valor3 = leia.nextInt();
			System.out.println("Digite o segundo valor inteiro,sendo maior que o primeiro valor");
			int valor4 = leia.nextInt();
			for (int i = valor3; i < valor4; i++) {
				System.out.println(i);}
			case 6:System.out.println("Digite o primeiro valor inteiro");
			int valor5 = leia.nextInt();
			System.out.println("Digite o segundo valor inteiro,sendo maior que o primeiro valor");
			int valor6 = leia.nextInt();
			int result = valor5 + valor6;
			System.out.println("A soma dos valores \n"+result);{
			}
			break;
			case 7:System.out.println("Digite o primeiro valor inteiro");
			int valor7 = leia.nextInt();
			System.out.println("Digite o segundo valor inteiro,sendo maior que o primeiro valor");
			int valor8 = leia.nextInt();
			for (int i = valor7; i < valor8; i++){
				System.out.println(i);
			}
			break;
				
			case 8:System.out.println("Digite o primeiro valor inteiro");
			int valor9 = leia.nextInt();
			System.out.println("Digite o segundo valor inteiro,sendo maior que o primeiro valor");
			int valor10 = leia.nextInt();
			for (int i = valor9; i < valor10; i++){
				System.out.println(i);}
			break;
			
			case 9:System.out.println("Digite15 valores inteiros");
			int valor11 = leia.nextInt();
			int valor12= leia.nextInt();
			int valor13= leia.nextInt();
			int valor14= leia.nextInt();
			int valor15= leia.nextInt();
			int valor16= leia.nextInt();
			int valor17= leia.nextInt();
			int valor18= leia.nextInt();
			int valor19= leia.nextInt();
			int valor20= leia.nextInt();
			int valor21= leia.nextInt();
			int valor22= leia.nextInt();
			int valor23= leia.nextInt();
			int valor24= leia.nextInt();
			int valor25= leia.nextInt();
			int result1 = valor11+valor12+valor13+valor14+valor15+valor16+valor17+valor18+valor19+valor20+valor21+valor22+valor23+valor24+valor25;
			for (int i = result1; i < 0; i++){
				System.out.println(i);}
			break;
			case 10:     
			
			break;
			case 11: 
				System.out.println("At� logo.");
			break;
			
			default:
				System.out.println("Ta de brincation with me."+"OP��O INV�LIDA");
			}
		}

	}

}