package modelos;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Pacientes {

	private int id;
	private String orgao;
	private String nomePac;
	private Date dataentrada;
	private String medico;
	
	//formata��o da Data
	private SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
	
	// Construtor s� com Id
	public Pacientes(int id) {
		this.id = id;
		
		
	}


	//construtores  gerais
	
	public Pacientes(String id,  String Orgao, String Nome, String data, String medico) {
		
		try {
			this.id = Integer.parseInt(id);
			this.dataentrada = sdf.parse(data);
			this.orgao = Orgao;
			this.nomePac = Nome;
			this.medico = medico;
			
		} catch (ParseException e) {
			System.out.println(e);
		}
	}
	
public Pacientes(String id,  String Orgao, String Nome,  String medico) throws ParseException {
		
		this.id = Integer.parseInt(id);
		this.dataentrada = new Date();
		this.orgao = Orgao;
		this.nomePac = Nome;
		this.medico = medico;
	}
	
	//construtor para ler dados separados por ";"
	public Pacientes(String linha) {
		try {
			
		this.id = Integer.parseInt(linha.split(";")[0]);
		this.orgao = linha.split(";")[1];
		this.nomePac = linha.split(";")[2];
		this.dataentrada = sdf.parse(linha.split(";")[3]);
		this.medico = linha.split(";")[4];
		} catch (ParseException e) {
			System.out.println(e);
		}
		
	}

	//gets && sets
	
	public int getId() {
		return id;
	}

	public String getId(String s) {
		return String.format("%d", id);
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getOrgao() {
		return orgao;
	}

	public void getOrgao(String orgao) {
		this.orgao = orgao;
	}

	public String getNome() {
		return nomePac;
	}

	public void setNome(String nomePac) {
		this.nomePac = nomePac;
	}
	
	public Date getDataEntrada() {
		return dataentrada;
	}

	public String getDataEntrada(String s) {
		return sdf.format(dataentrada);
	}

	public void setDataEntrada(Date dataentrada) {
		this.dataentrada = dataentrada;
	}

	public String getNomeMedico() {
		return medico;
	}

	public void setNomeMedico(String medico) {
		this.medico = medico;
	}
	public void getNomeMedico(String medico) {
		this.medico = medico;
	}
	@SuppressWarnings("deprecation")
	
	public int obterAnoDeEspera() {
		return (new Date().getYear() - dataentrada.getYear()) ;
	}

	// Define o "id" como campo Chave
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	// Define o "id" como campo Chave
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pacientes other = (Pacientes) obj;
		return id == other.id;
	}

	
	
	
	
	//construtor para exibir na tela!! ( � para isso que serve o toString em geral >:c )
	public String toString() {
		return id + "\t" + orgao + "\t" + nomePac + "\t" + sdf.format(dataentrada) + "\t" + medico + "\t"
				+ obterAnoDeEspera() + "\n";
	}
	
	
//construtor para enviar os dados para a planilha:

	public String toCSV() {
		return id + ";" + orgao + ";" + nomePac + ";" + sdf.format(dataentrada) + ";" + medico + ";"+ obterAnoDeEspera() +"\r\n";
		}		
	//construtor para preencher tabela / igual o toString .
	public String[] toVetor() {
		
					return new String[] { String.format("%d", id),orgao,nomePac,
							sdf.format(dataentrada), medico ,  String.format("%d",obterAnoDeEspera()) + " Anos" };
				
	}

}

