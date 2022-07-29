package modelo;

import java.util.Date;

public class Aluno {

	public int ra;
	public String nome;
	public Date dataNascimento;
	public float notas;
	
	private SimpleDateFormat df = new SimplesDateFormat ("DD/MM/YYYY");
	
	public int idadeDoAluno() {
		Date hoje = new Date();
		return hojr.getYear() - dataNascimeno.getYear();
	}
	
	
	
		}
	