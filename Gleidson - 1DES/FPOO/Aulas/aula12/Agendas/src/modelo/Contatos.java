package modelo;

public class Contatos {
	public int id;
	public String nome;
	public int idade;
	public String telefone;
	Contatos(){}
	Contatos(int id, String nome, int idade, String telefone){
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	}

	public String tabular() {
		return id+"\t"+nome+"\t"+idade+"\t"+telefone;
	}
	
	}