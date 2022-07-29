package modelo;

public class Veiculo {
	
	public String placa;
	public String marca;
	public String modelo;
	public int anoM;
	public int anoFab;
	public String cor;
	
	public Veiculo() {		
	}

	public Veiculo(String placa, String marca, String modelo, int anoM, int anoFab, String cor) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.anoM = anoM;
		this.anoFab = anoFab;
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Veiculo:  placa = " + placa + ", marca = " + marca + ", modelo = " + modelo + "." + "\n anoModelo = " + anoM
				+ ", anoFabricacao = " + anoFab + ", cor = " + cor;
	}

}