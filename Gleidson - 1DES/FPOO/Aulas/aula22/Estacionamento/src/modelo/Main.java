package modelo;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			
			Veiculos arq = new Veiculos();
			Scanner input = new Scanner(System.in);
			
			int opcao = 0;
			
			do {
				System.out.println("01 - Cadastrar;");
				System.out.println("02 - Listar;");
				System.out.println("03 - Sair;");
				opcao = input.nextInt();
				
				switch(opcao) {
					case 1: 
						System.out.println("Informe o Modelo  do Veiculo: ");
						String modelo = input.next();
						
						System.out.println("\nInforme a Marca do Veículo : ");
						String marca = input.next();
						
						System.out.println("Informe a Cor do Veículo: ");
						String cor = input.next();
						
						System.out.println("Informe o Ano do Veículo: ");
						String ano = input.next();
						
						System.out.println("Informe a Placa do Veículo: ");
						String placa = input.next();
						
						
						String data = "Modelo = " + modelo + "; " + "\nMarca = "+ marca + "; "
						+"\nCor = " + cor +"\nAno = " + ano + "\nPlaca = " + placa;
						
						 arq.escrever(data, "Pessoas", true);
						break;
					case 2:
						
						ArrayList<String> infoFile = arq.ler("Pessoas");
						
						System.out.println("Informe o nome que deseja localizar : ");
						String busca = input.nextLine();
						
						for(String linha : infoFile) {
							String[] temp = linha.split(";");
							if(temp[0].toLowerCase().contains(busca.toLowerCase())) {
								System.out.println("Nome : " + temp[0]);
								System.out.println("Idade : " + temp[1]);
								System.out.println("Cidade : " + temp[2]);	
							}
						}
						break;
					case 0:
						System.out.println("Ahh Ehhh");
						break;
				}
			}while(opcao != 0);
			
			
			
		}

	}