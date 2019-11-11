package EquipeProgramadores_Projeto_POO;

import java.util.ArrayList;

public class Equipe {

	private ArrayList<String> programadores;

	private Programador lider;

	private String nome;

	public Equipe(Programador lider, String nome) {
		this.lider = lider;
		this.nome = nome;
		this.programadores = new ArrayList<String>();
	}

	public void enviarProjeto() {
		
	}

	public Programador getLider() {
		return lider;
	}

	public void setLider(Programador lider) {
		this.lider = lider;
	}

	public ArrayList<String> getProgramadores() {
		return programadores;
	}

	public void addProgramador(String programador) {
		programadores.add(programador);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


}
