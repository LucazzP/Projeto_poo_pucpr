package EquipeProgramadores_Projeto_POO;

import java.util.ArrayList;

public abstract class Setor {

	protected int id;

	protected String nome;

	protected ArrayList<String> linguagens;

	public Setor(int id, String nome) {
		this.id = id;
		this.nome = nome;
		this.linguagens = new ArrayList<String>();
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<String> getLinguagem() {
		return linguagens;
	}

	public void addLinguagem(String linguagem) {
		linguagens.add(linguagem);
	}

}
