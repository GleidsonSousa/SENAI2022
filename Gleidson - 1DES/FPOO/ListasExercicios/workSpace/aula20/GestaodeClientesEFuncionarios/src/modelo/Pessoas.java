package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Pessoas {
	
	private SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nome;
	private String telefone;
	private Date nascimento;
	
	public Pessoas(){
		super();
	}
	
	public Pessoas( String nome, String telefone, String nascimento) throws ParseException {
		super();
		
		this.nome = nome;
		this.telefone = telefone;
		this.nascimento = df.parse(nascimento);
	}
	
	@Override
	public String toString() {
		return "\n"+ " Nome:  " + nome + "\n Telefone: " 
				+ telefone + "\n Data de Nascimento:  " + df.format(nascimento);
	}
		

<<<<<<< HEAD:Gleidson - 1DES/FPOO/workSpace/aula20/GestãodeClienteseFuncionários/src/modelo/Pessoas.java
public String toString2() {
	return "\n"+ " Nome do Funcion�rio: " + nome + "\n Contato: " 
			+ telefone;
}
	
public String toString3() {
	return "\n"+" Nome do Cliente: " + nome + "Contato: "+telefone;
}	
	}
=======
	public String toString2() {
		return super.toString();
	}
}


	
	

>>>>>>> 445a56de88a891a2933e2d938e0d1a93915e4f53:Gleidson - 1DES/FPOO/workSpace/aula20/GestaodeClientesEFuncionarios/src/modelo/Pessoas.java
