package respostas;

public class alunos {


		public String nome;
		public int mat;
		public int nota1;
		public int nota2;
		public int nota3;
	
		
		
		alunos(){}
		
	
		alunos(String nome, int mat, int media, int nota2, int nota1, int nota3){
			
			this.nome = nome;
			this.mat = mat;
			this.nota1 = nota1;
			this.nota2 = nota2;
			this.nota3 = nota3;
		}
		
				 public String alunosTab () {
					return nome+"\t"+mat+"\t"+nota1+"\t"+nota2+"\t"+nota3;
				} 
							
		}
