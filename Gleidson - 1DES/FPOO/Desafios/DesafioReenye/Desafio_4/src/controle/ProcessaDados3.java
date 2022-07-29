package controle;

import java.util.ArrayList;

import modelo.Usuarios;

public class ProcessaDados3 {
	private static ArrayList<Usuarios> linhas = new ArrayList<Usuarios>();
	private static DAO dao = new DAO();

	public static void carregar() {
		linhas = dao.abrir();
	}

	public static void saida(String email, String senha) {
		dao.validarConta(email, senha, linhas);
	}
}