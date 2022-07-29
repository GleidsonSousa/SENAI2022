package modelo;

import java.text.ParseException;
import modelo.Vendas;

public class Funcionario  extends Pessoas {
	
	private int matricula;
	private	double comissao;
	
		
	public Funcionario() {
		super();
}

	public Funcionario(int matricula,String nome, String telefone, String nascimento,double comissao) throws ParseException {
		super(nome, telefone, nascimento);
		this.matricula = matricula;
		this.comissao = comissao;
}
	


	public String toString() {
		return "Funcionários: \n"+"Dados:\n"+" Matricula: " + matricula +super.toString()+ "\n Porcentagem da comissão: " + comissao + "\n";
	}
	public String toString2() {
		return "Dados:\n"+" Matricula: " + matricula +super.toString2()+"\n";
	}
	
		public double getComissao (double  comissao) {
			return comissao;
			
		}
	
		public double setComissao (double comissao) {
			return comissao;
}
	
<<<<<<< HEAD:Gleidson - 1DES/FPOO/workSpace/aula20/GestÃ£odeClienteseFuncionÃ¡rios/src/modelo/Funcionario.java
		
		
		public int getMatricula() {
			return matricula;
		}

		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}

		public void valorAreceber(double valorCompra) {
			
			
}
	}
			
			
		
=======
		public int getMatricula() {
			return matricula;
}


		public void setMatricula(int matricula) {
			this.matricula = matricula;
	}
}
>>>>>>> 445a56de88a891a2933e2d938e0d1a93915e4f53:Gleidson - 1DES/FPOO/workSpace/aula20/GestaodeClientesEFuncionarios/src/modelo/Funcionario.java
