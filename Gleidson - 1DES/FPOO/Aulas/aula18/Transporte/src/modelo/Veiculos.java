package modelo;



public class Veiculos {

	

	public String placa;
	public String marca;
	public String modelo;
	public int anoModelo;
	public int anoFab;
	public int id;
	public String cor;
	

	public Veiculos() {
	}

	
	public Veiculos(int id, String placa,String marca,String modelo,int anoModelo,int anoFab,String cor) {
		this.placa = placa;
		this. marca = marca;
		this.modelo = modelo;
		this.anoModelo = anoModelo;
		this. anoFab= anoFab;
		this. cor = cor;
		this.id = id;
	}
	public String paraString() {
		return   id + "\t"+placa + "\t" + marca + "\t" + modelo + "\t"+ anoModelo + "\t"+ anoFab + "\t"+ cor;
	}
}
	