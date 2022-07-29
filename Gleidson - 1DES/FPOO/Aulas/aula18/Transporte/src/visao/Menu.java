package visao;


import java.util.Scanner;

import modelo.Veiculos;;

public class Menu {
	private static Scanner leia = new Scanner(System.in);
	private static Veiculos vei[] = new Veiculos[10];
	private static int id = 0; //  dar um id começando de 0 para os carros listados.
	private static int contVei= 0; //para saber quantos veiculos estao sendo cadastrados.
	static int menu = 0;



	public static void main(String[] args)  {
		boolean sucesso = false;

		System.out.println("|------------BEM-VINDO------------|");

		while (menu != 3) {
			System.out.println(
					"Escolha uma opcao:\n1 - Cadastrar um Carro.\t2 - Listar Carros.\t3 - Sair.\nR:");
			menu = leia.nextInt();
			switch (menu) {
			case 1:
				sucesso = cadastrarCarros();
				if (sucesso) {
					System.out.println("---|CARRO CADASTRADO|----");
					contVei++;
				} else
					System.out.println("---|Erro ao cadastrar, TENTE NOVAMENTE|---");
				break;
				
			case 2:
				listarCarros();
				break;
			case 3:
				System.out.println("--|Volte Sempre,bye bye.|---");
				break;
			}
		}
	}



	private static void listarCarros() {
		System.out.println("Id\tPLACA\tMARCA\tMODELO\tANO MODELO\tANO FABRICAÇÃO\tCOR");
		for (int i = 0; i < contVei; i++) {
			System.out.println(vei[i].paraString());
			System.out.println("\n");
		}
	}
	

	private static boolean cadastrarCarros() {
		id++;
		System.out.println("PLACA\tMARCA\tMODELO\tANO MODELO\tANO FABRICAÇÃO\tCOR");
		vei[contVei] = new Veiculos(id, leia.next(), leia.next(), leia.next(),leia.nextInt(),leia.nextInt(),leia.next());
		return true;
		
		
	}
}