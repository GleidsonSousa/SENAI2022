package modelo;

public class Agenda_5 {

	public static void main(String[] args) {
		
			Contatos c1 = new Contatos();
			c1.id = 30;
			c1.nome = "jojopose";
			c1.idade = 19;
			c1.telefone = "(11)8866-9955";
			
			Contatos c2 = new Contatos();
			c2.id = 25;
			c2.nome = "JojoPose";
			c2.idade = 50000;
			c2.telefone = "(11)3200-3435";
			
			
			System.out.println(c1.tabular());
			System.out.println(c2.tabular());
			
			

	}

}

