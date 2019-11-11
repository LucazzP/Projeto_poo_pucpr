package Profissoes;

import java.util.ArrayList;

public class Profissao {
	private String nome;
	private String genero;
	private ArrayList<String> linguagens;
	private ArrayList<String> frameworks;
	private String gitHub;

	public Profissao(String nome, String genero, String gitHub) {
		this.nome = nome;
		this.genero = genero;
		this.linguagens = new ArrayList<String>();
		this.frameworks = new ArrayList<String>();
		this.gitHub = gitHub;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public ArrayList<String> getLinguagens() {
		return linguagens;
	}

	public void addLinguagens(ArrayList<String> linguagens) {
		for (String l : linguagens) {
			if (!this.linguagens.contains(l)) {
				this.linguagens.add(l);
			}
		}
	}

	public ArrayList<String> getFrameworks() {
		return frameworks;
	}

	public void addFrameworks(ArrayList<String> frameworks) {
		for (String f : frameworks) {
			if (!this.frameworks.contains(f)) {
				this.frameworks.add(f);
			}
		}
	}

	public String getGitHub() {
		return gitHub;
	}

	public void setGitHub(String gitHub) {
		this.gitHub = gitHub;
	}
}
