package controles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import modelos.Pacientes;

public class PacientesDAO {
	
	private BufferedReader br;
	private BufferedWriter bw;
	private String path = "./dados/pacientes.csv";

	public ArrayList<Pacientes> ler() {
		ArrayList<Pacientes> linhas = new ArrayList<>();
		Pacientes manutencao;
		try {
			br = new BufferedReader(new FileReader(path));
			String linha = br.readLine();
			while(linha != null) {
				manutencao = new Pacientes(linha);
				linhas.add(manutencao);
				linha = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		return linhas;
	}
	
	public void escrever(ArrayList<Pacientes> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(path));
			for (Pacientes p : linhas) {
				bw.write(p.toCSV());
			}
			bw.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
