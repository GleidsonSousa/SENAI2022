package respostas;

		import java.io.IOException;
		import java.util.Random;
		import java.util.Scanner;

		public class Ex_1 {
			
			static Random rand = new Random();
			static Scanner scan = new Scanner(System.in);
			
			public static void main(String[] args) throws IOException{
				System.out.println("Escolha as proporções da sua Matriz");
				int x = scan.nextInt();
				int y = scan.nextInt();
				matriz(x,y);
			
	}
			
			public static void matriz(int l, int c) {
				System.out.println("Sua Matriz:\n");
				int x[][] = new int[l][c];
				for(int i = 0; i < l; i++)
					for(int j = 0; j < c; j++)
						x[i][j] = rand.nextInt(100);

				for(int i = 0; i < l; i++) {
					for(int j = 0; j < c; j++)
						System.out.print(x[i][j]+"\t");
					System.out.println();
				}
				System.out.println("Digtite os Números da sua matriz");
				numeros[] n = new numeros[25];
				for(int i = 0; i < 24; i++) {
					n [i] = new numeros();
				
		
			        if(i%2==0) {
			            System.out.println("Tenho aqui um número par.");
			        } else {
			            System.out.println("Tenho aqui um número impár");
			        }
			    }
			}
		}
		
				
	
					    
						
				
			
			
		
