package modelos;

public class Funcionarios {
	
	
	private String funcionario;
	private String senha;
	

	
	public Funcionarios(String funcionario, String senha) {
		super();
		this.funcionario = funcionario;
		this.senha = senha;
	}

	public Funcionarios(String linha) {
		super();
		this.funcionario = linha.split(";")[0];
		this.senha = linha.split(";")[1];
	}

	public String getEmail() {
		return funcionario;
	}

	public void setEmail(String email) {
		this.funcionario = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public String toString() {
		return funcionario + "\t********";
	}

	//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
public String getLogin() {
	return funcionario;
}
public void setLogin(String login) {
	this.funcionario = login;
}

}