package controle;
import java.util.ArrayList;

import modelo.PlanilhaMedias;

public class ProcessaDados {
	
	public static ArrayList<PlanilhaMedias> linhas = new ArrayList<>();
	private static DAO dao = new DAO();
	
	public static void carregar() {
		linhas = dao.abrir();
	}
	
	public static void enviar() {
		
		dao.salvarMedia(linhas); 
	}
}