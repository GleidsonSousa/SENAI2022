package visao;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.Carro;
import modelo.Moto;


public class Main {

	public static Scanner scan = new Scanner(System.in);
	private static ArrayList<Carro> carros = new ArrayList<>();
	private static ArrayList<Moto> motos = new ArrayList<>();
	private static String itens[] = { "Cadastrar Carro", "Listar Carros.", "Cadastrar Moto."
			, "Listar Motos.", "Sair." };
	private static int menu = 0;
	private static int quantoscarros = 0;
	private static int quantasmotos = 0;

	
	public static void main(String[] args) throws ParseException {
		boolean sucesso = false;
		
		while (menu != 5) {
			menu = printMenu(itens);
			switch (menu) {
			
			case 1:
				sucesso = cadastrarCarros();
				if (sucesso) {
					System.out.println("---[Carro Cadastrado!]---");
					quantoscarros++;
				
					System.out.println("Quantidade de Carros Cadastrados: "+quantoscarros+"\n");
				} else
					System.out.println("[ERROR506]==={ALGO DEU ERRADO, POR FAVOR TENTE NOVAMENTE!!}");
				break;
				
				
			case 2:
				listarCarros();
				break;
				
			case 3:
				sucesso = cadastrarMotos();
				if (sucesso) {
					System.out.println("---[Moto Cadastrada!]---");
					quantoscarros++;
				
					System.out.println("Quantidade de Carros Cadastrados: "+quantasmotos+"\n");
				} else
					System.out.println("[ERROR506]==={ALGO DEU ERRADO, POR FAVOR TENTE NOVAMENTE!!}");
				break;
			
			case 4:
				listarMotos();
				break;
			case 5:
				System.out.println("Volte Sempre :D");
				break;
			default:
				System.out.println("Erro505 [ OPÇÃO INVÁLIDA! ]");

				}
			}
		}


	private static boolean cadastrarMotos() {
		
		System.out.println("---{ Cadastro De Motos! }---");
		System.out.println("t Placa\t Ano Modelo\t Ano Fabricação \t Modelo\t Marca\t Cilindradas\t Valor");
		Moto mot = new Moto( scan.next(),scan.nextInt(),scan.nextInt(),scan.next(),scan.next(),scan.nextInt(), scan.nextDouble());
		motos.add(mot);
		return true;
	
	}


	private static void listarMotos() {
		System.out.println("--{Lista De Motos}--");
		for(Moto m: motos){
			System.out.println(m.toString());
			System.out.println("\n");
			
		}
	}
		


	


	private static void listarCarros() {
System.out.println("--{Lista De Carros}--");
		for(Carro c: carros){
			System.out.println(c.toString());
			System.out.println("\n");
			
		}
	}
		
	private static boolean cadastrarCarros() {
		
		System.out.println("---{ CADASTRO DE CARROS! }---");
		System.out.println(" Tipo\t Quantidade Passageiros\t Placa\t Ano Modelo\t Ano Fabricação \t Modelo\t Marca\t Valor");
		Carro car = new Carro( scan.next(), scan.nextInt(), scan.next(), scan.nextInt(),scan.nextInt(),scan.next(),scan.next(),scan.nextDouble());
		carros.add(car);
		return true;
	
	}

	private static int printMenu(String[] itens) {
	for (int i = 0; i < itens.length; i++)
		System.out.println((i + 1) + "." + itens[i]);
	System.out.print("Digite uma Opção:");
	return scan.nextInt();
	}
}