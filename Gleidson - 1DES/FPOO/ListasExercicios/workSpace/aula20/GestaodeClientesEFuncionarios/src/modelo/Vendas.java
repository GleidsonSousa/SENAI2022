package modelo;


public class Vendas {
	
	private int idCliente;
	private float valor;
	
	public  Vendas(int idCliente, float valor) {
	super();
	this.idCliente = idCliente;
	this.valor = valor;
	
	}

	
	public String toString() {
		return "Venda: \n ID Cliente = " + idCliente + "Comissão" + valor + "\n";
	}

	
	public float getValor() {
		return (valor * 30) / 100;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}
	
	

}