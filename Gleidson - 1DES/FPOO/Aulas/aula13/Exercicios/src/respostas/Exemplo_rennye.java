package respostas;

import java.util.Random;

public class Exemplo_rennye {

	public static void main(String[] args) {
		Random a = new Random();
		int[][] n = new int [5][5];
		for (int l = 0; l <5 ; l++){
			for(int c =0; c <4; c++){
			n[l][c] = a.nextInt(100);
			System.out.print(n[l][c]+"\t");
			System.out.println();
		}
			
			}
		}
	}


