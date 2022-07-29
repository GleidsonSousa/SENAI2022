package modelo;

import java.text.ParseException;

public class Cliente  extends Pessoas {
	
	private int id;
	private	double creditoLimite;
		
	public Cliente() {
		super();
	}
	public Cliente(int id,String nome, String telefone, String nascimento, double creditoLimite) throws ParseException {
	super(nome, telefone, nascimento);
	this.id = id;
	this.creditoLimite = creditoLimite;
}



	@Override
	public String toString() {
		return "\nCliente: "+"\n Id: " + id + super.toString()+"\n Limite do Cr�dito: " + "R$"+creditoLimite+"\n";
}
	public String toString3() {
		return "\nCliente: "+"\n Id: " + id + super.toString2();
}	
	
	
	public double getCreditoLimite() {
		return creditoLimite;
	}
	public void setCreditoLimite(double creditoLimite) {
		this.creditoLimite = creditoLimite;
		
		
		
		
}
<<<<<<< HEAD:Gleidson - 1DES/FPOO/workSpace/aula20/GestãodeClienteseFuncionários/src/modelo/Cliente.java
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
		}



=======
	}
>>>>>>> 445a56de88a891a2933e2d938e0d1a93915e4f53:Gleidson - 1DES/FPOO/workSpace/aula20/GestaodeClientesEFuncionarios/src/modelo/Cliente.java
