package revisao;

import java.util.Random;

public class revisao {
	
	  static Random rand = new  Random();

	public static void main(String[] args) {
		
       // declaração de matriz
		int[][] m = new int[5][5]; 
		   //pecorrer as colunas 
		 for(int i = 0; i < 5; i++) {
			// pecorrer as colunas 
		for(int c = 0; i< 4; i++) {
			m[i][c] = rand.nextInt(100);
			System.out.println(m [i][c]+ "/t");
			}
		
		for(int i = 0)
		System.out.println();
			
		}

	}

}
