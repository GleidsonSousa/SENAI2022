package modelo;

public class Carro extends Veiculo {

	private String tipo;
	private int passageiros;
	
	
	

	public Carro(String tipo,int passageiros,String placa, int anoModelo, int anoFabricacao, String modelo, String marca, double valor) {
	super(placa, anoModelo, anoFabricacao, modelo, marca, valor);
}


	@Override
	public String toString() {
		return "Carro: \n "+ "Tipo: " + tipo + "\n Passageiros: " + passageiros + "\n"+super.toString();
	}


	public int getPassageiros() {
		return passageiros;
	}


	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}

	
