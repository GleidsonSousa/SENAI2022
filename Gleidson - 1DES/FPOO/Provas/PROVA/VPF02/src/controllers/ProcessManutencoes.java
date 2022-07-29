package controllers;

import java.util.ArrayList;

import models.Manutencao;
import dao.ManutencaoDAO;

public class ProcessManutencoes{

	public static ArrayList<Manutencao> manutencoes = new ArrayList<>();
	private static ManutencaoDAO md = new ManutencaoDAO();
	
	public static void abrir() {
		manutencoes = md.ler();
		if(manutencoes.size() == 0) {
			manutencoes.add(new Manutencao("1", "03/10/2021", "Miniagua", "300,00","30,00"));
		}
	}
	
	public static void salvar() {
		md.escrever(manutencoes);
	}

	
}