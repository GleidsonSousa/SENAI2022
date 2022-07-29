package visao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import modelo.Aluno;
import modelo.Nota;


public class Principal {
	public static Scanner sc=  new Scanner (System.in);
	private static Object nome;
	private static Object ra;
	
		public static void main(String[] args) throws ParseException {
			int opcao = 0;
			while(opcao != 9) {
				mostrarOpcao();
				opcao = sc.nextInt();
				switch(opcao) {
					case 1: 
					 Alunos();
						break;
					case 2: 
						Notas();
						break;
					case 3: 
						buscaNOME();
						break;
					case 4:
						
						break;
					case 5:
						
						break;
					case 6:
	
						break;
					case 7:
						break;
					case 8:
						break;
					case 9:
						System.out.println("Saindo . . . ");
	
						break;
						 default: System.out.println("Essa opção é invalida, por favor tente novamente\n");
				}
			}
		}
	

					

public static void buscaNOME() {
			
			
}



public static void Notas() {

			
		}

	public static void Alunos() throws ParseException {
			for (int i = 0; i < Aluno.length; i++) {
				if (alunos[9] == null) {
					if(alunos[i] == null) {
						System.out.println("Digite o nome do Aluno");
						String nome = sc.next();
						
						System.out.println("");
						String nasc = sc.next();
						
						
						int ra = i+1;
						
						alunos[i] = new Aluno(ra, nome, idade);
						
						System.out.println("[---__---__---__---__---__---]");
						break;
					}
				} else {
					System.out.println("Limite Excedido");
					break;
				}
			}
		}

public static void mostrarOpcao() {
	String[] vetor_opcoes = new String[9];
	vetor_opcoes[0] = "1- Cadastro de Alunos.";
	vetor_opcoes[1] = "2- Cadastro de Notas.";
	vetor_opcoes[2] = "3- Lista de Alunos.";
	vetor_opcoes[3] = "4- Lista de Notas.";
	vetor_opcoes[4] = "5- Buscar Aluno(a) por Nome.";
	vetor_opcoes[5] = "6- Buscar Aluno(a) por RA.";
	vetor_opcoes[6] = "7- Lista de Aprovados.";
	vetor_opcoes[7] = "8- Lista de Reprovados.";
	vetor_opcoes[8] = "9- Sair.";
	
	for(int i = 0; i < vetor_opcoes.length; i++) {
		System.out.println(vetor_opcoes[i]);
		}
	}
}