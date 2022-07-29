package modelo;


public class Agenda02 {

	public static void main(String[] args) {
		// criando um objeto
			Contatos c1 = new Contatos();
			c1.id = 30;
			c1.nome = "jojopose";
			c1.idade = 19;
			System.out.println(c1.id+"\t"+c1.nome+"\t"+c1.idade);
			// renova o objeto
			 c1 = new Contatos();
			 System.out.println(c1.id+"\t"+c1.nome+"\t"+c1.idade);
			c1.id = 25;
			c1.nome = "issoéideia não boy";
			c1.idade = 5;
			System.out.println(c1.id+"\t"+c1.nome+"\t"+c1.idade);
			

	}

}
