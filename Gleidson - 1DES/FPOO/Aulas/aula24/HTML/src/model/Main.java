package model;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {
		
		Desafio arq = new Desafio ();
		Scanner sc = new Scanner(System.in);
		
		int opcao = 0;
		
		do {
			System.out.println("0 - Abrir arquivo.");
			System.out.println("1 - Limpar HTML;");
			System.out.println("2 - Escrever no HTML;");
			System.out.println("3 - Crie uma lista no HTML;");
			System.out.println("4 - Crie uma tabela no HTML;");
			System.out.println("4 - Sair.");
			
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
				case 0:
					abrirHtml();
					
				break;
				case 1:
					break;
				case 2: 
					System.out.println("Escreva aqui: ");
					String escrever = sc.nextLine();
					String data = "<center><h1>"+escrever+"<h1><center>";

					arq.escrever(data, "index",true);
					break;
				case 3:
					
					System.out.println("Escreva aqui: ");
					String escrever2 = sc.nextLine();
					String data01 = "<center><h2>Aqui est� a sua lista: </h2></center>"+"<h1><center>";
					String data02 = "<center><h2>Aqui est� a sua lista: </h2></center>"+"<h1><center>";
					String data03 ="";
					
					arq.escrever(data01,data02, "index",false);
						
						
					break;
				case 4:
					System.out.println("Isso � tudo pessoal :D ");
					break;
				case 5:
					System.out.println("Isso � tudo pessoal :D ");
					break;
				case 6:
					System.out.println("Isso � tudo pessoal :D ");
					break;
			}
		}while(opcao != 6);
		
		
		
	}

	private static void escreverHTML() {
		// TODO Auto-generated method stub
		
	}

	private static void abrirHtml() {
		Desktop desktop = null;
		desktop = Desktop.getDesktop();
		URI url = null;

		File file = new File("C:\\Users\\GLEIDSON  1- DES\\Documents"
				+ "\\Gleidson - 1DES\\FPOO\\aula24\\HTML\\index.html");

		try {

		    url = new URI(file.toURI().toString());
		    desktop.browse(url);

		} catch (URISyntaxException | IOException ex) {
		    Logger.getLogger(Desafio.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}

}