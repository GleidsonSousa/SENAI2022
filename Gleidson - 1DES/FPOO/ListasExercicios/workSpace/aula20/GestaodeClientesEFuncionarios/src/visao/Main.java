package visao;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.Funcionario;
import modelo.Vendas;
import modelo.Cliente;
import modelo.Vendas;

public class Main {

	public static Scanner scan = new Scanner(System.in);
	private static ArrayList<Vendas> compras = new ArrayList<>();
	private static ArrayList<Funcionario> funcionarios = new ArrayList<>();
	private static ArrayList<Cliente> clientes = new ArrayList<>();
	private static String itens[] = { "Cadastrar Cliente", "Listar Clientes.", "Cadastrar Funcionario."
			, "Listar Funcion�rios.","Cadastrar Venda","Consultar Vendas", "Sair." };
	private static int menu = 0;
	private static int quantosclientes = 0;
	private static int quantosfuncionarios = 0;
	private static int quantasVendas = 0;
	private static int id = 0;
	private static int matricula = 0;
	

	public static void main(String[] args) throws ParseException {
		boolean sucesso = false;
		
		while (menu != 7) {
			menu = printMenu(itens);
			switch (menu) {

					case 1:
						sucesso = cadastrarCli();
						if (sucesso) {
							System.out.println("---[CLIENTE CADASTRADO]---");
							quantosclientes++;
						
							System.out.println("Quantidade de Clientes Cadastrados na Loja: "+quantosclientes+"\n");
						} else
							System.out.println("[ERROR506]==={ALGO DEU ERRADO, POR FAVOR TENTE NOVAMENTE!!}");
						break;
						
						
					case 2:
						listarCli();
<<<<<<< HEAD:Gleidson - 1DES/FPOO/workSpace/aula20/GestãodeClienteseFuncionários/src/visao/Main.java
						break;
						
					case 3:
						sucesso = cadastrarFun();
						if (sucesso) {
							System.out.println("\n---[FUNCION�RIO CADASTRADO COM SUCESSO]---\n");
							quantosfuncionarios++;
							
							System.out.println("Quantidade de Funcion�ros em nossa Loja: "+quantosfuncionarios+"\n");
							
						} else
							System.out.println("[ERROR506]==={ALGO DEU ERRADO, POR FAVOR TENTE NOVAMENTE!!}");
=======
						
					
						break;
						
					case 3:
						sucesso = cadastrarFun();
					if (sucesso) {
						System.out.println("\n---[FUNCION�RIO CADASTRADO COM SUCESSO]---\n");
						quantosfuncionarios++;
						
						System.out.println("Quantidade de Funcion�ros em nossa Loja"+quantosfuncionarios+"\n");
						
					} else
						System.out.println("[ERROR505]==={ALGO DEU ERRADO, POR FAVOR TENTE NOVAMENTE!!}");
						
>>>>>>> 445a56de88a891a2933e2d938e0d1a93915e4f53:Gleidson - 1DES/FPOO/workSpace/aula20/GestaodeClientesEFuncionarios/src/visao/Main.java
						break;
					
					case 4:
						listarFun();
						break;
					case 5:
<<<<<<< HEAD:Gleidson - 1DES/FPOO/workSpace/aula20/GestãodeClienteseFuncionários/src/visao/Main.java
						cadastroVendas();
							
=======
					
							cadastroVenda();
>>>>>>> 445a56de88a891a2933e2d938e0d1a93915e4f53:Gleidson - 1DES/FPOO/workSpace/aula20/GestaodeClientesEFuncionarios/src/visao/Main.java
						break;
					case 6:
						
						listarCompras();
						break;
					case 7:
						System.out.println("Volte Sempre :D");
						break;
					default:
						System.out.println("Erro505 [ OP��O INV�LIDA! ]");

					}
				}
			}
	
<<<<<<< HEAD:Gleidson - 1DES/FPOO/workSpace/aula20/GestãodeClienteseFuncionários/src/visao/Main.java
	private static void listarCompras() {
		
		
	}

	private static boolean cadastroVendas() {
		quantasVendas++;
		System.out.println("Digite o ID do cliente que dejesa realizar a compra: ");
		int id = scan.nextInt();
		for(Cliente c: clientes)
			if(c.getId() == id) {
			System.out.println(c.toString3());
	}else System.out.println("Cliente n�o encontrado.");
		System.out.println("Digite a Matricula do funcion�rio respons�vel pela compra: ");
		int matricula = scan.nextInt();
		for(Funcionario f:funcionarios)
			if(f.getMatricula() == matricula) {
			System.out.println(f.toString2());
			System.out.println("Digite o Valor da Venda: \t");
			
			Vendas compra = new Vendas(scan.nextFloat());
			compras.add(compra);
			
			
	}else System.out.println("Funcion�rio n�o encontrado.");
			
		
			
		return true;
		
		
	}

=======
	
	
	
	
	
	private static void cadastroVenda() {
		System.out.println("---- Cadastro de Vendas ----");
		System.out.println("Digite a matricula do funcion�rio: ");
		int matricula = scan.nextInt();
		
		for(Funcionario f: funcionarios) {
			if (f.getMatricula() == matricula) {
				Funcionario funcionario = new Funcionario();
				
				System.out.println(f.toString());
				System.out.println("Digite as seguintes informa��es: ");
				System.out.print("Id Cliente\tValor venda.");
				Vendas venda = new Vendas (scan.nextInt(), scan.nextFloat());
					vendas.add(venda);
						
					for(Venda v: vendas) {
						System.out.println("Sua comiss�o �: " + v.getValor());
			}
				
		} else {
			System.out.println("Funcionario n�o encontrado");
			break;
		}
	}
}
		
	






	private static void cadVenda() {
		System.out.println("---- Cadastro de Vendas ----");
		System.out.println("Digite a matricula do funcion�rio: ");
		int matricula = scan.nextInt();
		
		for(Funcionario f: funcionarios) {
			if (f.getMatricula() == matricula) {
				Funcionario funcionario = new Funcionario();
				
				System.out.println(f.toString1());
				System.out.println("Digite as seguintes informa��es: ");
				System.out.print("Id Cliente\tValor venda.");
				Venda venda = new Venda (scan.nextInt(), scan.nextFloat());
					vendas.add(venda);
						
					for(Venda v: vendas) {
						System.out.println("Sua comiss�o �: " + v.getValor());
			}
				
		} else {
			System.out.println("Funcionario n�o encontrado");
			break;
		}
	}
}
	
	
>>>>>>> 445a56de88a891a2933e2d938e0d1a93915e4f53:Gleidson - 1DES/FPOO/workSpace/aula20/GestaodeClientesEFuncionarios/src/visao/Main.java
	private static void listarFun() {
System.out.println("---{LISTA DE FUNCION�RIOS}---");
		
		for(Funcionario f: funcionarios){
			System.out.println(f.toString());
			System.out.println("\n");
		}
	}

		
	

	private static void listarCli() {
System.out.println("--{LISTA DE CLIENTES}--");
		
		for(Cliente c: clientes){
			System.out.println(c.toString());
			System.out.println("\n");
			
		}
	}
		
	

	private static boolean cadastrarFun() throws ParseException {
		matricula++;
		System.out.println("---{ CADASTRO DE FUNCIONARIOS! }---");
		System.out.println("Nome\tTelefone\tData de Nascimento(Exemplo:11/11/2011"
				+ ")\tPorcentagem Comiss�o");
		Funcionario func = new Funcionario(matricula, scan.next(), scan.next(), scan.next(), scan.nextDouble());
		funcionarios.add(func);
		return true;
		
		
	}

	private static boolean cadastrarCli() throws ParseException {
		id++;
		System.out.println("---{ CADASTRO DE CLIENTES! }---");
		System.out.println("Nome\tTelefone\tData de Nascimento(01/01/2001)\tLimite do Cr�dito");
		Cliente cli = new Cliente(id, scan.next(), scan.next(), scan.next(), scan.nextDouble());
		clientes.add(cli);
		return true;
	}
		

	private static int printMenu(String[] itens) {
		for (int i = 0; i < itens.length; i++)
			System.out.println((i + 1) + "." + itens[i]);
		System.out.print("Digite uma Op��o:");
		return scan.nextInt();
	}
}