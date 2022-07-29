package modelo;

public class Cao extends Animal{

	private int qtMotoqueirosAtacados;

	public Cao( String especie,String nome,String raca,float peso,int qtMotoqueirosAtacados){
		super(especie,nome,peso,raca);
		this.qtMotoqueirosAtacados = qtMotoqueirosAtacados;
	}

	@Override
	public String toString() {
		return "\n  Cães \n Quanntos Motoqueiros Atacados = " +"["+ qtMotoqueirosAtacados + "]   JANTEI KKKK  \n" + super.toString();
	}

}
