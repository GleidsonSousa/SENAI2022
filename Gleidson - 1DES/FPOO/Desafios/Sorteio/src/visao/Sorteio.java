package visao;

import java.util.Scanner;

import modelo.Turma;

public class Sorteio {

	private static Scanner scan = new Scanner(System.in);
	private static Turma turma = new Turma();
	
	public static void main(String[] args) {
		System.out.print("Digite quantos alunos a turma possui,em seguida os nomes alunos:");
		turma.preencherVetor(scan.nextInt());
		
	System.out.println("\nLista de alunos:");
		turma.listarTodos();
		
	}

}