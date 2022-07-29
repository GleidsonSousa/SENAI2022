package visao;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Cao;
import modelo.Gato;

public class Principal {

	public static Scanner scan = new Scanner(System.in);
	private static ArrayList<Cao> caes = new ArrayList<>();
	private static ArrayList<Gato> gatos = new ArrayList<>();
	private static String itens[] = { "Cadastrar C�o", "Cadastrar Gato.", "Listar C�o.", "Listar C�o.", "Sair." };
	private static int menu = 0;
	private static int quantosgatos = 0;
	private static int quantoscaes = 0;

	public static void main(String[] args) {

		while (menu != 5) {
			menu = printMenu(itens);
			switch (menu) {

					case 1:
						
						cadastrarCao();
						break;
					case 2:
						cadastrarGato();
						break;
					case 3:
						listarCao();
						break;
					case 4:
						listarGato();
						break;
					case 5:
						System.out.println("Volte Sempre :D");
						break;
					default:
						System.out.println("Erro505 [ OP��O INV�LIDA! ]");

					}
				}
			}
		
	
	private static void cadastrarCao() {

		System.out.println("----.CADASTRO C�O.----");
		System.out.println("Esp�cie:  \nNome:  \nRa�a:  \nPeso:  \nQuantos Motoqueiros Atacados:  ");
		Cao cao = new Cao(scan.next(), scan.next(), scan.next(), scan.nextFloat(), scan.nextInt());
		caes.add(cao);
		quantoscaes++;
	}

	private static void cadastrarGato() {

		System.out.println("----.CADASTRO GATO.----");
		System.out.println("Esp�cie:  \nNome:  \nRa�a:  \nPeso:  \nQuantas Vidas:  ");
		Gato gato = new Gato(scan.next(), scan.next(), scan.next(), scan.nextFloat(), scan.nextInt());
		gatos.add(gato);
		quantosgatos++;
	}

	private static void listarCao() {
		System.out.println("----.Lita de C�es.----");
		
		for(Cao c: caes){
			System.out.println(c.toString());
			System.out.println("\n");
			
		}
	}

	private static void listarGato() {
System.out.println("----.Lita de Gatos.----");
		
		for(Gato g: gatos){
			System.out.println(g.toString());
			
		}
	}

	private static int printMenu(String[] itens) {
		for (int i = 0; i < itens.length; i++)
			System.out.println((i + 1) + "." + itens[i]);
		System.out.print("Digite uma Op��o:");
		return scan.nextInt();
	}
}
