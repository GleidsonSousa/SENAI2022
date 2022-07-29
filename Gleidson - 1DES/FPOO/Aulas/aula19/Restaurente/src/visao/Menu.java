package visao;

import java.util.Scanner;

import modelo.Pratos;

public class Menu {

	
	private static Scanner scan = new Scanner(System.in);
	private static Pratos pratos[] = new Pratos[10];
	private static String itens[] = { "Cadastro de Prato", "Listar Pratos", "Sair." };
	private static int menu = 0;
	private static int id = 0;


	
	public static void main(String[] args) {
		while (menu != 3) {
			menu = printMenu(itens);
			switch (menu) {
			case 1:
				
						cadastrarPrato();
						
						break;
			case 2:
				listarPratos();
				
				break;
			case 3:
				System.out.println("Volte Sempre :D");
				break;
			default:
				 System.out.println("Erro505 [ OP��O INV�LIDA! ]");
				break;
			}
		}
	}

	private static int printMenu(String[] itens) {
		for (int i = 0; i < itens.length; i++)
			System.out.println((i + 1) + "." + itens[i]);
		System.out.print("Escolha uma op��o:");
		return scan.nextInt();
	}

	private static void cadastrarPrato() {
		id++;
		System.out.println("C�digo\tTipo\tNome\tPre�o\tDescri��o:");
		pratos [id] = new Pratos(id, scan.next(), scan.next(), scan.nextFloat(),scan.next());
		
	}

	private static void listarPratos() {
		for (int i = 0; i < id; i++) {
			System.out.println(pratos[i].toString());
		}
	}
}