package controle;

import java.util.ArrayList;

import modelo.Pets;

public class PetsProcess {
	
	public static ArrayList<Pets> pets = new ArrayList<>();
	
	public static void carregarTestes(){
		pets = new ArrayList<>();
		pets.add(new Pets(1," Cachorro","Tot�","Vira Latas",26,"20/10/2010","Diego","(19)98877-7897"));
		pets.add(new Pets(2," Gato","Mini","Angor�",4,"02/11/2012","Silas","(19)98788-4456"));
		pets.add(new Pets(3," Coelho","Perna","Basic�o",3,"21/01/2010","Marta","(19)98555-2254"));
		pets.add(new Pets(4," Outros","Tia","Norm",3,"25/10/2020","Ana","(19)98873-3355"));
	}
	
}