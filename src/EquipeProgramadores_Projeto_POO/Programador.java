package EquipeProgramadores_Projeto_POO;

import java.io.Serializable;

public class Programador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7286963424227992132L;
	private int id;
	private String nome;
	private String cpf;
	private Setor setor;

	public Programador(int id, String nome, String cpf, Setor setor) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.setor = setor;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}
	
	public String toString () {
		String retorno;
		
		retorno = "--------------------------" + 
			      "         Programador     " +  
				  "--------------------------\n" +
				  "Nome: " + this.getNome() +  "\n" +
				  "Cpf: " + this.getCpf() + "\n" +
		          "Setor:  " + this.getSetor().getNome() + "\n";
		          
	
		return retorno;
	}

}
