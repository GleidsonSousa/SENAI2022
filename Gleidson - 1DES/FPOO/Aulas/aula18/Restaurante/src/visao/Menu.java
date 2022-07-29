package visao;


import java.util.Scanner;

import modelo.Pratos;

public class Menu {
	private static Scanner leia = new Scanner(System.in);
	private static Pratos pt[] = new Pratos[10];
	private static int contPt= 0; 
	static int menu = 0;



	public static void main(String[] args)  {
		boolean sucesso = false;

		System.out.println("|------------BEM-VINDO------------|");
		System.out.println("            |---AO---|");
		System.out.println(" |-------COMIDA DE LA MADRE-------|");
		while (menu != 3) {
			System.out.println(
					"Escolha uma opcao:\n1 - Cadastrar um Prato.\t2 - Listar o Cardápio.\t3 - Sair.\nR:");
			menu = leia.nextInt();
			switch (menu) {
			case 1:
				sucesso = cadastrarPratos();
				if (sucesso) {
					System.out.println("---|PRATO CADASTRADO|----");
					contPt++;
				} else
					System.out.println("---|Erro ao cadastrar, TENTE NOVAMENTE|---");
				break;
				
			case 2:
				listarPratos();
				break;
			case 3:
				System.out.println("--|Volte Sempre,bye bye.|---");
				break;
			}
		}
	}



	private static void listarPratos() {
		System.out.println("Codigo\tNome\tPreço\nDescrição:");
		for (int i = 0; i < contPt; i++) {
			System.out.println(pt[i].paraString());
			System.out.println("\n");
		}
	}
	

	private static boolean cadastrarPratos() {
		System.out.println("Codigo\tNome\tTipo\t\tPreço.\nDescrição:");
		pt[contPt] = new Pratos( leia.nextInt(), leia.next(), leia.next(),leia.nextFloat(),leia.next());
		return true;
		
		
	}
}