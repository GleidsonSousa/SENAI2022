package modelo;



public class Pratos {

	

	public int codigoPT;
	public String tipo;
	public String nome;
	public	String descricao;
	public float preco;

	

	public Pratos() {
	}

	
	public Pratos( int codigo,String tipo,String nome,float preco,String desc) {
		this.codigoPT = codigo;
		this.tipo= tipo;
		this. nome = nome;
		this.descricao= desc;
		this.preco = preco;
	
		
	}
	public String paraString() {
		return   codigoPT + "\t"+tipo + "\t" + nome + "\t" +preco+ "\n"+ descricao;
	}
}