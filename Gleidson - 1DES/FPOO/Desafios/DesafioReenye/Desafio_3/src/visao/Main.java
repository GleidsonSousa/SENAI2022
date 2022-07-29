package visao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	
	private static BufferedReader br;
	private static String entrada = "C:\\Users\\GLEIDSON  1- DES\\Documents\\Gleidson - 1DES\\FPOO\\Desafios\\DesafioReenye\\Desafio_3\\dados\\entrada.csv";

	public static void main(String[] args) {
		ArrayList<Integer> linhas = new ArrayList<>();	
		Integer Numbers;
		try {
			br =  new BufferedReader(new FileReader(entrada));
			String lin = br.readLine();
			
			while(lin != null) {
				Numbers = Integer.parseInt(lin);
				linhas.add(Numbers);
				lin =  br.readLine();
			}
			br.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		linhas.sort(null);
		for(Integer i: linhas) {
			System.out.println(i);
		
			
		
		}
	}
}
