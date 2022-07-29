package controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Usuarios;

public class DAO {
	private BufferedWriter bw;
	private BufferedReader br;
	private String entrada = "C:\\Users\\GLEIDSON  1- DES\\Documents\\Gleidson - 1DES\\FPOO\\Desafios\\DesafioReenye\\Desafio_4\\dados\\usuarios.csv";

	public ArrayList<Usuarios> abrir() {
		ArrayList<Usuarios> linhas = new ArrayList<Usuarios>();

		Usuarios p;

		try {
			br = new BufferedReader(new FileReader(entrada));

			String l = br.readLine();

			while (l != null) {
				p = new Usuarios(l);
				linhas.add(p);
				l = br.readLine();
			}

			br.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return linhas;
	}

	public boolean validarConta(String email, String senha, ArrayList<Usuarios> linhas) {
		Usuarios u = new Usuarios(email + ";" + senha);

		if (u.validaEmail(email, linhas)) {
			if (u.validaSenha(email, senha, linhas)) {
				System.out.println("Acesso permitido");
				return true;
			} else {
				System.out.println("Acesso negado");
				return false;
			}
		} else {
			System.out.println("usuário não encontrado");
			return false;
		}
	}

}