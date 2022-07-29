package modelo;

public class Moto extends Veiculo {

	private int cilindradas;
	

	public Moto() {
		super();
		
}
	
	public Moto(String placa, int anoModelo, int anoFabricacao, String modelo, String marca,int cilindradas, double valor) {
	super(placa, anoModelo, anoFabricacao, modelo, marca, valor);
	this.cilindradas =  cilindradas;
	
}

	@Override
	public String toString() {
		return "Moto: \n"+"\nCilindradas =  " + cilindradas + "\n"+super.toString();
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
}


