package modelo;

import java.text.DecimalFormat;

public class PlanilhaMedias {


	private String nome;
	private float nota01;
	private float nota02;
	private float nota03;


	public PlanilhaMedias(String entrada) {
		nome = (entrada.split(";")[0]);
		nota01 = Float.parseFloat(entrada.split(";")[1]);
		nota02 = Float.parseFloat(entrada.split(";")[2]);
		nota03 = Float.parseFloat(entrada.split(";")[3]);
	}

	public String toString() {
		float media = (nota01+nota02+nota03)/3;
		
		return nome +";"+ (new DecimalFormat("0.00").format(media));
	
	}
}