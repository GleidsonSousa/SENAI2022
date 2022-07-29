package controles;

import java.util.ArrayList;

import modelos.Funcionarios;

public class FuncionarioProcess {

	public static ArrayList<Funcionarios> funcionarios = new ArrayList<>();
	private static FuncionarioDAO ud = new FuncionarioDAO();
	public static String LoginFuncionarioConectado;

	public static void carregar() {
		funcionarios = ud.abrir();
	}

	public static int checarEmail(String funcionario) {
		int retorno = -1;
		for (int i = 0; i < funcionarios.size(); i++) {
			if (funcionarios.get(i).getEmail().equals(funcionario)) {
				return i;
			}
		}
		return retorno;
	}

	public static boolean checarSenha(int indice, String senha) {
		if (funcionarios.get(indice).getSenha().equals(senha)) {
			
			
			LoginFuncionarioConectado = funcionarios.get(indice).getLogin(); 
			
			return true;
		}
		return false;
	}
}