package respostas;

import java.util.Scanner;

public class Ex_2 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.print("Cadastre no max 10 alunos(as):\n");
	
		alunos[] aluninhos = new alunos[10];
		for(int i = 0; i < 10; i++) {
			aluninhos[i] = new alunos();
			aluninhos[i].nome = scan.next();
			aluninhos[i].mat = scan.nextInt();
			aluninhos[i].nota1 = scan.nextInt();
			aluninhos[i].nota2 = scan.nextInt();
			aluninhos[i].nota3 = scan.nextInt();
			
		}

		System.out.println("Nome\tMatrícula\tNotas");
		for(int i = 0; i < 10; i++) {
			System.out.println("\nDeseja encontrar um aluno(a)?");
			Buscar();
		}
	}

	public static void Buscar() {
		scan = new Scanner(System.in);
		int opcao = 0;
		
		while(opcao != 3) {
			mostrarOpcoes();
			opcao = scan.nextInt();
			
			switch(opcao) {
				case 1: 
					Buscarpornome();
					
					break;
				case 2: 
					Buscarpormat();
					break;
				case 3: 
					System.out.println("Vlw men stuart liru");
					break;
					
					default : System.out.println("\nOpção não encontrada");
			}
		}
	}
	
			private static boolean Buscarpormat() {
				System.out.print("Digite a matrcula que deseja buscar:");
				int c = scan.nextInt();
				int aluninhos =  c;
				for(int i = 0; i < aluninhos; i++)
					if(aluninhos == c)
						return true;
				return false;
	}

			private static boolean Buscarpornome() {
				System.out.print("Digite o número que deseja buscar:");
				String b = scan.next();
				String aluninhos =  b;
				
					if(aluninhos == b)
						return true;
				return false;
		
	}
	public static void mostrarOpcoes() {
		String[] vetor_opcoes = new String[3];
		vetor_opcoes[0] = "1.Buscar pelo Nome do ALUNO ALUNO(A)";
		vetor_opcoes[1] = "2.Buscar pela Matrícula do (A)";
		vetor_opcoes[2] = "3.Sair";
		for(int i = 0; i < vetor_opcoes.length; i++) {
			System.out.println(vetor_opcoes[i]);
		}
		
		
	}

}