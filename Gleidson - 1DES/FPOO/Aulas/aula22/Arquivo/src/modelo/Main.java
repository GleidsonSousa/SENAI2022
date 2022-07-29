package modelo;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Arquivo arq = new Arquivo();
		Scanner scan = new Scanner(System.in);
		
		int opcao = 0;
		
		do {
			System.out.println("1 - Cadastrar;");
			System.out.println("2 - Listar;");
			System.out.println("0 - Sair;");
			opcao = scan.nextInt();
			scan.nextLine();
			
			switch(opcao) {
				case 1: 
					System.out.println("Informe o seu nome : ");
					String nome = scan.nextLine();
					
					System.out.println("Informe sua idade : ");
					String idade = scan.next();
					
					System.out.println("Informe sua cidade : ");
					String cidade = scan.next();
					
					String data = nome + ";" + idade + ";" + cidade;
					
					arq.escrever(data, "Pessoas", true);
					break;
				case 2:
					ArrayList<String> infoFile = arq.ler("Pessoas");
					
					System.out.println("Informe o nome que deseja localizar : ");
					String busca = scan.nextLine();
					
					// 0     1      2
					//nome;idade;cidade
					for(String linha : infoFile) {
						String[] temp = linha.split(";");
						if(temp[2].toLowerCase().contains(busca.toLowerCase())) {
							System.out.println("Nome : " + temp[0]);
							System.out.println("Idade : " + temp[1]);
							System.out.println("Cidade : " + temp[2]);	
						}
					}
					break;
				case 0:
					System.out.println("Inté");
					break;
			}
		}while(opcao != 0);
		
		
		
	}

}	
//try {
//FileWriter  fw =  new FileWriter ("base.txt" , true);
//BufferedWriter bw = new BufferedWriter  ((Writer) fw);
//bw.write(" Meu primeiro arquivo ;-; . \r\n");
//
//
//bw.close();
//fw.close();
//
//
//} catch (IOException e) {
//System.out.println(e.toString());
		
			
		
	
