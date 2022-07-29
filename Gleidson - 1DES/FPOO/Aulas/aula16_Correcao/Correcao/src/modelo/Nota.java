package modelo;

public class Nota {

	
	public String componente;
	public float[] nota = { -1, -1, -1 };
	
	public float obterMedia() {
		float soma = 0;
		int div = 0;
		for (int i = 0; i < nota.length; i++)
			if (nota[i] != -1) {
				soma += nota[i];
				div++;
			}
		if (div > 0)
			return soma / (float) div;
		else
			return -1;
	}
	
	
	public String paraString() {
		return String.format("%s\t%.2f\t%.2f\t%.2f", componente, nota[0],nota[1],nota[2]);
	}
}
