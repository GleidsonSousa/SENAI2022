package modelo;


import java.util.Scanner;

public class Agenda_6 {
	
	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.print("Digite quantos contatos deseja cadastrar:");
		int cada = ler.nextInt();
		
		Contatos[] contatos = new Contatos[cada];
		
		System.out.println("id\tNome\tIdade\tTelefone");
		for(int i = 0; i < cada; i++) {
			contatos[i] = new Contatos();
			contatos[i].id = ler.nextInt();
			contatos[i].nome = ler.next();
			contatos[i].idade = ler.nextInt();
			contatos[i].telefone = ler.next();
			
		


			System.out.println("Escola uma opção:\n");
			int opcao = 0;
			while (opcao !=5) {
			System.out.println("Digite uma opção: ");
			System.out.println("1.Mostrar Todos\n2.Buscar por Id\n3.Buscar por Nome\n4.Buscar por Telefone\n5.Sair");		
			opcao = ler.nextInt();
			switch (opcao) {

			case 1:
				MostrarTodos();
				break;
			case 2:
				Buscar();
				break;
			case 3:
				MateriasPrimas();
				break;
			case 4:
				Blocos();
				break;
			case 5:
				System.out.print("Obrigado!");
				break;
			default: 
				System.out.println("Opção Inválida");
				break;
			
				
				
				public static void MostrarTodos() {
					ler =  new Scanner(System.in);
					
					System.out.println("id\tNome\tIdade\tTelefone");
					for(int i = 0; i < cada; i++) {
						System.out.println(contatos[i].tabular());
				
				
				
				
					}
					
				
				}
				public static void MostrarTodos() {
			}
		}
	}






		
		
