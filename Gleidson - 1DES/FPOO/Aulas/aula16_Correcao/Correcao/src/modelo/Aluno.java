package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno {

	
	public int ra;
	public String nome;
	public Date nascimento;
	
	public Nota[] notas = new Nota[4];
	
	public SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	
	public int calcIdade() {
		Date hoje = new Date();
		@SuppressWarnings("deprecation")
		int anoDif = hoje.getYear() - nascimento.getYear();
		@SuppressWarnings("deprecation")
		int mesDif = hoje.getMonth() - nascimento.getMonth();
		@SuppressWarnings("deprecation")
		int diaDif = hoje.getDay() - nascimento.getDay();
		if (mesDif <= 0)
			if (diaDif >= 0)
				anoDif -= 1;
		return anoDif;
	}
	

	public String obterConceito() {
		int totNotasCadastradas = 0;
		String conceito = "Aprovado";
		for (int i = 0; i < notas.length; i++)
			if (notas[i] != null)
				totNotasCadastradas++;
		for (int i = 0; i < totNotasCadastradas; i++)
			if (notas[i].obterMedia() < 50)
				conceito = "Reprovado";
		return conceito;
	}


	public String paraString() {
		return ra + "\t" + nome + "\t" + df.format(nascimento) + "\t" + calcIdade();
	}

	
	public String paraStringNotas() {
		int totNotasCadastradas = 0;
		String dados = ra + "\t" + nome + "\t" + df.format(nascimento) + "\t" + calcIdade();
		for (int i = 0; i < notas.length; i++)
			if (notas[i] != null)
				totNotasCadastradas++;
		dados += "\nComp.\tNota1\tNota2\tNota3\tMedia\n";
		for (int i = 0; i < totNotasCadastradas; i++) {
			dados += notas[i].componente + "\t";
			for (int j = 0; j < 3; j++)
				if (notas[i].nota[j] != -1)
					dados += notas[i].nota[j] + "\t";
				else
					dados += "-\t";
			dados += notas[i].obterMedia() + "\n";
		}
		dados += obterConceito();
		return dados;
	}
}