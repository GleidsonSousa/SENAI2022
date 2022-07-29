package provajava;
import java.util.Scanner;
public class prova {
public static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int opcao = 0;
		while(opcao != 5) {
			mostrarOpcoes();
			opcao = input.nextInt();
			switch(opcao) {
				case 1: 
					calcularHorasExtras();
					break;
				case 2: 
					calcularApuracao();
					break;
				case 3: 
					calcularMateriasPrimas();
					break;
				case 4:
					calcularBlocos();
					break;
			}
		}
	}
	public static void calcularHorasExtras() {
		input = new Scanner(System.in);
		int opcao_horas = 0;	
		while(opcao_horas != 2) {
			System.out.println("1. Calcular um novo funcionario. ");
			System.out.println("2. Voltar ao menu.");
			opcao_horas = input.nextInt();
			if(opcao_horas == 1) {
				System.out.println("Digite quantas horas foram trabalhadas.");
				int total_horas = input.nextInt();
				
				System.out.println("Digite quantas horas extras foram trabalhadas.");
				int horas_extras = input.nextInt();
				double salario = total_horas * 5.625;
				salario = salario + (horas_extras * (5.625*1.75));
				System.out.printf("O salario é: R$ %.2f\n", salario);
			}
		}
	}	
	public static void calcularApuracao() {
		input = new Scanner(System.in);

		String[] categorias = new String[3];
		categorias[0] = "Bateria";
		categorias[1] = "Samba-enredo";
		categorias[2] = "Fantasias";

		String[] nome_escolas = new String[5];
		int[] soma_escolas = new int[5];
		int[] media_escolas = new int[5];

		for(int i = 0; i < nome_escolas.length; i++) {
			System.out.print("Informe o nome da escola: ");
			nome_escolas[i] = input.nextLine();
		}
		int maior_nota = 0;
		int index_maior_nota = 0;
		for(int i = 0; i < 5; i++) {
			for(int k = 0; k < categorias.length; k++) {
				System.out.println("Classifique a escola " + nome_escolas[i] + " na categoria: " + categorias[k]);

				soma_escolas[i] = soma_escolas[i] + input.nextInt();
			}
			media_escolas[i] = soma_escolas[i] / categorias.length;

			if(media_escolas[i] > maior_nota) {
				maior_nota = media_escolas[i];
				index_maior_nota = i;
			}
		}

		for(int i = 0; i < soma_escolas.length; i++) {
			System.out.println("Nome da escola: " + nome_escolas[i]);
			System.out.println("Média da escola: " + media_escolas[i]);
			System.out.println();
		}

		System.out.println("A escola campea, foi a: " + nome_escolas[index_maior_nota]);
	}
		
	
	public static void calcularMateriasPrimas() {
		input = new Scanner(System.in);

		String[] vetor_materias_primas = new String[3];
		vetor_materias_primas[0] = "Lantejoulas";
		vetor_materias_primas[1] = "Penas de Avestruz";
		vetor_materias_primas[2] = "Tecido de seda";

		Double[] valor_gasto = new Double[3];
		Double[] valor_estimado = new Double[3];
		int[] kg = new int[3];

		for(int i = 0; i < vetor_materias_primas.length; i++) {
			System.out.println(
					"Valor gasto do material " + vetor_materias_primas[i] + ": ");
			valor_gasto[i] = input.nextDouble();

			System.out.println("Valor estimado do material " + vetor_materias_primas[i] + ": ");
			valor_estimado[i] = input.nextDouble();

			System.out.println("Quantidade em quilos do material " + vetor_materias_primas[i] + ": ");
			kg[i] = input.nextInt();
		}

		double maior_gasto = 0.0;
		int index_maior_gasto = 0;
		int index_menor_gasto = 0;
		int index_medio_gasto = 0;
		for(int i = 0; i< vetor_materias_primas.length; i++) {

			if(valor_gasto[i] > maior_gasto) {
				maior_gasto = valor_gasto[i];
				index_maior_gasto = i;
			}else if(maior_gasto > valor_gasto[0] && maior_gasto > valor_gasto[1] && maior_gasto > valor_gasto[2]) {
				index_maior_gasto = i;
			}else if(maior_gasto < valor_gasto[1] && maior_gasto > valor_gasto[2]) {
				index_medio_gasto = 1;
			}else if(maior_gasto < valor_gasto[0] && maior_gasto < valor_gasto[1] && maior_gasto < valor_gasto[2]) {
				index_menor_gasto = 2;
			}


			if(valor_gasto[i] > valor_estimado[i]) {
				System.out.println("A relação kg/R$ do material " + vetor_materias_primas[i] + " é: " + (kg[i]/valor_gasto[i]));
				System.out.println("O valor gasto do material " + vetor_materias_primas[i] + " foi maior que o valor estimado.");
			}else if(valor_gasto[i] < valor_estimado[i]) {
				System.out.println("A relação kg/R$ do material " + vetor_materias_primas[i] + " é: " + (kg[i]/valor_gasto[i]));
				System.out.println("O valor gasto do material " + vetor_materias_primas[i] + " foi menor que o estimado");
			}else {
				System.out.println("A relação kg/R$ do material " + vetor_materias_primas[i] + " é: " + (kg[i]/valor_gasto[i]));
				System.out.println("O valor gasto do material " + vetor_materias_primas[i] + " foi igual");
			}
		}

		System.out.println("O maior gasto, se encontra no material: " + vetor_materias_primas[index_maior_gasto]);
	}
	
	public static void calcularBlocos() {
		input = new Scanner(System.in);
		System.out.println("Digite a quantidade de pessoas: ");
		int quantidade_pessoas = input.nextInt();
		System.out.println("Comissão de frente: " + quantidade_pessoas*0.15);
		System.out.println("Abre-alas: " + quantidade_pessoas*0.05);
		System.out.println("Ala das baianas: " + quantidade_pessoas*0.15);
		System.out.println("Carros Alegóricos: " + quantidade_pessoas * 0.2);
		System.out.println("Mestre-sala e Porta-Bandeira: " + quantidade_pessoas * 0.03);
		System.out.println("Bateria: " + quantidade_pessoas*0.2);
		System.out.println("Madrinha de bateria: " + quantidade_pessoas*0.02);
		System.out.println("Recuo da bateria: " + quantidade_pessoas * 0.2);
	}
	
	public static void mostrarOpcoes() {
		String[] vetor_opcoes = new String[5];
		vetor_opcoes[0] = "1. Horas extras.";
		vetor_opcoes[1] = "2. Apuração.";
		vetor_opcoes[2] = "3. Matérias primas.";
		vetor_opcoes[3] = "4. Blocos.";
		vetor_opcoes[4] = "5. Sair.";	
		for(int i = 0; i < vetor_opcoes.length; i++) {
			System.out.println(vetor_opcoes[i]);
		}
	}
}