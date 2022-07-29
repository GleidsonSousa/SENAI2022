package modelo;

public class Vendas {
	
	private int idCliente;
	private float valorCompra;
	
	public  Vendas(int idCliente) {
	super();
	this.idCliente = idCliente;
	
	}

	
	


	public Vendas(float valor) {
		super();
		this.valorCompra = valor;	
	}





	public String toString() {
		return "Venda: \n ID Cliente = " + idCliente + "Comissão = " + valorCompra + "\n";
	}

	
	public float getValor() {
		return (valorCompra * 30) / 100;
	}


	public void setValor(float valor) {
		this.valorCompra = valor;
	}
	
	

}