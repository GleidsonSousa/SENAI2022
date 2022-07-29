package modelo;



public class Veiculo {
	
	private String placa;
	private int anoModelo;
	private int anoFabricacao;
	private String modelo;
	private String marca;
	private double valor;
				
	
	public Veiculo() {
		super();
}

	

	public Veiculo(String placa, int anoModelo, int anoFabricacao, String modelo, String marca, double valor) {
		super();
		this.placa = placa;
		this.anoModelo = anoModelo;
		this.anoFabricacao = anoFabricacao;
		this.modelo = modelo;
		this.marca = marca;
		this.valor = valor;
}



	@Override
	public String toString() {
		return "Veiculo: \n"+"Placa:  "  + placa + "\n Ano Modelo:  " + anoModelo + "\n Ano Fabricacao:  " + anoFabricacao
				+ "\n Modelo:  "+ modelo + "\n Marca:  " + marca + "\n Valor:  " +"R$"+ valor + "\n";
}
	}


