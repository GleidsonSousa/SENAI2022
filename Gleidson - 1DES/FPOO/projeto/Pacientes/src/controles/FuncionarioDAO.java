package controles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import modelos.Funcionarios;



//USADO PARA BUSCAR Funcionários dentro do csv 


public class FuncionarioDAO {
	
	private BufferedReader br;
	private String path = ".\\dados\\fun.csv";

	public ArrayList<Funcionarios> abrir() {
		ArrayList<Funcionarios> linhas = new ArrayList<>();
		Funcionarios logarFun;
		
		try {
			br = new BufferedReader(new FileReader(path));
			String linha = br.readLine();
			while(linha != null) {
				logarFun = new Funcionarios(linha);
				linhas.add(logarFun);
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
}