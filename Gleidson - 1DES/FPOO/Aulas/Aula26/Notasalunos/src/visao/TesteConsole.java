package visao;
import controle.ProcessaDados;

public class TesteConsole {

	
	public static void main(String[] args) {
		ProcessaDados.carregar();
		ProcessaDados.enviar();
		System.out.println("M�dias calculadas com sucesso!");

	}
}