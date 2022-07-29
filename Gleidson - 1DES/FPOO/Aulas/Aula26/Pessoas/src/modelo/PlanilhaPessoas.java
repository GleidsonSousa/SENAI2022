package modelo;

import java.util.Calendar;

public class PlanilhaPessoas {


	private String nome;
	private int anoNascimento;


	public PlanilhaPessoas(String entrada) {
		nome = (entrada.split(";")[0]);
		anoNascimento = Integer.parseInt(entrada.split(";")[1]);
	}

	public String toString() {
		int v3;
		 Calendar calendar = Calendar.getInstance();
		 v3 = calendar.get(Calendar.YEAR)- anoNascimento;
		
		return nome +";"+ v3;
	
	}
}