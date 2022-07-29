package modelo;

public class Pratos {

	public static void main(String[] args) {
		
	}
		public int    codigo;
		public String tipo;
		public String nome;
		public String descricao;
		public float  preco;
		public String cor;
		
		public Pratos() {		
		}

		public Pratos (int codigo, String tipo, String nome, float preco, String descricao) {
			super();
			this.codigo = codigo;
			this.tipo = tipo;
			this.nome = nome;
			this.preco = preco;
			this.descricao = descricao;
		
		}

		@Override
		public String toString() {
			return "Prato:  Código = " + codigo + ", Tipo = " + tipo + ", Nome = " + nome + "." + "\n Preço = " + preco
					+ ", Descrição = " + descricao+". \n";
		}
	}
	


