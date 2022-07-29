package controles;

import java.util.ArrayList;

import modelos.Pacientes;
public class PacientesProcess {

	public static ArrayList<Pacientes> pacientes = new ArrayList<>();
	private static PacientesDAO pcd = new PacientesDAO();
	
	public static void abrir() {
		pacientes = pcd.ler();
		if(pacientes.size() == 0) {
			pacientes.add(new Pacientes("1", "rim", "Minnie", "03/10/2021","Dra.Mariana Rios"));
			
		}
	}
	
	public static void salvar() {
		pcd.escrever(pacientes);
	}
}
		
	
			
	
	
	
