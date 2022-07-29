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
}
