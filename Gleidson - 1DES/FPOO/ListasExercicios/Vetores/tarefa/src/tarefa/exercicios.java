package tarefa;

import java.util.Scanner;

public class exercicios {

	public static void main(String[] args) {
             int opc;
             String nome , nota ;
             Scanner aluno;
            
     
             aluno = new Scanner(System.in);
     		
             System.out.println("         menu");
             System.out.println(" Cadstrar um aluno:");
             System.out.println(" Buscar aluno por nota:");
             System.out.println(" M�dia do aluno:");
             System.out.println(" Sair...");
    		
        		opc = aluno.nextInt();    
        		aluno.nextLine();
        		
        		switch(opc) {
        		
        		
        		case 1:
        		    System.out.println(" Nome ");
        		    nome = aluno.nextLine();
        			System.out.println(" Nota ");
        			nota = aluno.nextLine();
        			
        		   break;
        		case 2:
        		    break;
        		case 3:
        		    break;
        		
        		case 0:
        		  System.out.println("saindo...");
        		  
        		  default:
        		  System.out.println("op��o invalida");
        		}
        	  
          
         
		
  


}

}