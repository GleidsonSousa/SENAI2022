package visao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import modelo.Pet;
import modelo.Servico;

public class Menu {


	
	private static Scanner read = new Scanner(System.in);
	private static int opcao = 0;
	private static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	private static String funcionalidades[] = { "Cadastrar Animal/Pet", "Cadastrar Servico   ", "Listar todos os Pets",
			"Listar Servi�os", "Sair                " };
	
	private static Pet[] pets = new Pet[10];
	private static Servico[] servicos = new Servico[100];
	private static int id = 0; 
	private static int contPets = 0; 
	private static int contServicos = 0; 

	
	public static void main(String[] args) throws IOException, ParseException {
		boolean sucesso = false;
		System.out.println("[ [ Gest�o de Servi�os de Banho e Tosa ] ]");
		while (opcao != 5) {
			System.out.print("Op��o: ");
			opcao = menu(funcionalidades);
			switch (opcao) {
			case 1:
				sucesso = cadastrarAnimal();
				if (sucesso) {
					System.out.println("Animal/Pet cadastrado com sucesso.");
					contPets++;
				} else
					System.out.println("Erro ao cadastrar animal.");
				break;
			case 2:
				
					int op = 0;
				
				
				
				while(op != 1 && op != 2) {
					System.out.println("Selecione uma op��o de cadastro\n1 - AGORA\n2 - AGENDAR");
					op = read.nextInt();
					
					
					
					switch (op) {
					case 1:
						System.out.println("Com qual funcion�rio deseja realizar o cadastro?:");
						int agr = 0;
						while(agr != 1 && agr != 2) {
							System.out.println("Data e hor�rio atuais:");
							 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
						        System.out.println(" "+dtf.format(LocalDateTime.now()));
							System.out.println("\n1 - FELIPE\n2 - ANGELICA");
							op = read.nextInt();
							 
							
							
							
							switch (op) {
							
							case 1:
								int op1 = 0;
								System.out.println("Qual tipo de servi�o?:");
				
								while(op1 != 1 && op1 != 2	 && op1 != 3 && op1 !=4) {
									
									System.out.println("\n1 - BANHO\n2 - TOSA\n3 - BANHO E TOSA\n4 - OUTROS");
									op = read.nextInt();
									
									
								
								break;
								}
								
							case 2:
								
						break;
							}
						}
						
					case 2:
						
						sucesso = cadastrarServico();
						if (sucesso) {
							System.out.println("Servi�o registrado com sucesso.");
							contServicos++;
						} else
							System.out.println("Erro ao registrar servi�o.");
						break;
						
					
						
					default:
						
						System.out.println("Op��o inv�lida");
						
						break;
					}
				}
				
				
				sucesso = cadastrarServico();
				if (sucesso) {
					System.out.println("Servi�o registrado com sucesso.");
					contServicos++;
				} else
					System.out.println("Erro ao registrar servi�o.");
				break;
			case 3:
				listarPets();
				break;
			case 4:
				listarServicos();
				break;
			case 5:
				System.out.println("At� logo e volte sempre.");
				break;
			default:
				System.out.println("Op��o inv�lida");
				break;
			}
		}
	}

	
	private static int menu(String[] itens) {
		System.out.println("\t._______________________.");
		for (int i = 0; i < itens.length; i++) {
			System.out.println("\t|" + (i + 1) + "." + itens[i] + "\t|");
		}
		System.out.println("\t:___Escolha uma op��o___:");
		return read.nextInt();
	}

	
	private static boolean cadastrarAnimal() {
		id++; 
		System.out.println("Tipo\tNome do Pet\tNome Dono\tPeso");
		pets[contPets] = new Pet(id, read.next(), read.next(), read.next(), read.nextFloat());
		return true;
	}


	private static boolean cadastrarServico() throws ParseException {
		System.out.println("Para registrar um servi�o, primeiro o pet deve estar cadastrado");
		System.out.println("Digite qual o id do pet/animal?");
		Pet animal = buscarAnimal(read.nextInt());
		if (animal != null) {
			System.out.println(animal.paraString());
			System.out.println("Funcion�rio\tDescri��o\tData(dd/mm/aaaa)\tHora(hh:mm)");
			servicos[contServicos] = new Servico(animal, read.next(), read.next(), read.next(), read.next());
			return true;
		} else {
			System.out.println("Pet n�o encontrado.");
			return false;
		}
	}

	
	private static Pet buscarAnimal(int idAnimal) {
		for (int i = 0; i < contPets; i++) {
			if (pets[i].idPet == idAnimal) {
				return pets[i];
			}
		}
		return null;
	}

	
	private static void listarPets() {
		System.out.println("Id\tTipo\tNomePet\tNome dono\tPeso");
		for (int i = 0; i < contPets; i++) {
			System.out.println(pets[i].paraString());
		}
	}

	
	private static void listarServicos() throws ParseException {
		System.out.println("Animal/Pet(id, tipo, nome, dono, peso)\tfuncionario\tDescri��o\tData\tHora");
		for (int i = 0; i < contServicos; i++) {
			System.out.println(servicos[i].tabularString());
		}
		String[] subItens = { "Filtrar Servi�os    ", "Filtrar Por data    " };
		opcao = menu(subItens);
		if (opcao == 1) {
			System.out.print("Digite o nome do animal ou do dono, ou funcion�rio, ou a descri��o do servi�o:");
			listarServicos(read.next());
		} else if (opcao == 2) {
			System.out.print("Digite a data em que o servi�o foi realizado dd/mm/aaaa:");
			Date data = df.parse(read.next());
			listarServicos(data);
		} else {
			System.out.println("Filtro inv�lido.");
		}
	}

	
	private static void listarServicos(String filtro) {
		System.out.println("Animal/Pet(id, tipo, nome, dono, peso)\tfuncionario\tDescri��o\tData\tHora");
		for (int i = 0; i < contServicos; i++) {
			if (servicos[i].nomeFuncionario.equals(filtro) || servicos[i].descricao.equals(filtro)
					|| servicos[i].pet.nomePet.equals(filtro) || servicos[i].pet.nomeDono.equals(filtro)
					|| servicos[i].pet.tipoPet.equals(filtro))
				System.out.println(servicos[i].tabularString());
		}
	}


	private static void listarServicos(Date filtro) {
		System.out.println("Animal/Pet(id, tipo, nome, dono, peso)\tfuncionario\tDescri��o\tData\tHora");
		for (int i = 0; i < contServicos; i++) {
			if (servicos[i].data.equals(filtro))
				System.out.println(servicos[i].tabularString());
		}
	}

}
