package control;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import model.Planilha;

public class DAO {
	
	private BufferedReader br;
	private BufferedWriter bw;
	private String entrada = "C:\\Users\\GLEIDSON  1- DES\\Documents\\Gleidson - 1DES\\FPOO\\Aulas\\aula25\\SoluçãoSPOO\\src\\Dados\\entrada.csv";
	private String saida = "C:\\Users\\GLEIDSON  1- DES\\Documents\\Gleidson - 1DES\\FPOO\\Aulas\\aula25\\SoluçãoSPOO\\src\\Dados\\saida.csv";
	
	public ArrayList<Planilha> abrir(){
		ArrayList<Planilha> linhas = new ArrayList<>();
		Planilha p;
		try {
			br = new BufferedReader(new FileReader(entrada));
			String linha = br.readLine();
			while(linha != null) {
				p = new Planilha(linha);
				linhas.add(p);
				linha = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return linhas;
	}
	
	public void salvarSoma(ArrayList<Planilha> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			for (Planilha l : linhas) {
				bw.write(l.soma()+"\r\n");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void salvarSub(ArrayList<Planilha> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			for (Planilha l : linhas) {
				bw.write(l.sub()+"\r\n");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void salvarMult(ArrayList<Planilha> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			for (Planilha l : linhas) {
				bw.write(l.mult()+"\r\n");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void salvarDiv(ArrayList<Planilha> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			for (Planilha l : linhas) {
				bw.write(l.div()+"\r\n");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
