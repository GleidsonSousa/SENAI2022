package controle;
import java.util.ArrayList;

import modelo.PlanilhaPessoas;

public class ProcessaDados {
	

		public static ArrayList<PlanilhaPessoas> linhas = new ArrayList<>();
		private static DAO dao = new DAO();
		
		public static void carregar() {
			linhas = dao.abrir();
		}
		
		public static void enviar() {
	
			 dao.salvarIdade(linhas); 
		}

		public static int checarEmail(String email) {
			int retorno = -1;
			for (int i = 0; i < linhas.size(); i++) {
				if (linhas.get(i).equals(email)) {
					return i;
				}
			}
			return retorno;
		}

		public static boolean checarSenha(int indice, String senha) {
			if (linhas.get(indice).equals(senha)) {
				return true;
			}
			return false;
		}
	}
