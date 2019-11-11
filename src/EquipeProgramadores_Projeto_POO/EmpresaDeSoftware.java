package EquipeProgramadores_Projeto_POO;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class EmpresaDeSoftware {
	
	ArrayList<Equipe> equipes;
	
	public EmpresaDeSoftware(){
		this.equipes = new ArrayList<Equipe>();
	}

	public static void main(String[] args) {
		EmpresaDeSoftware empresa = new EmpresaDeSoftware();
		Interface.iniciarInterface();
	}

	public void menuEquipes() {
		
	}

	public void mostraEquipe(String dados) {
		
	}

	public void salvaEquipes(int equipes) {
		
	}

	public void recuperaEquipes() {
		ObjectInputStream inputStream = null;
		try {
			inputStream = new ObjectInputStream (new FileInputStream("c:\\temp\\empresa.dat"));
			Object obj = null;
			while((obj = inputStream.readObject()) != null) {
				if (obj instanceof Equipe)
					this.equipes.add((Equipe)obj);
			}	
		}catch (EOFException ex) {
			System.out.println("End of file reached.");
		}catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}catch (IOException ex) {
			ex.printStackTrace();
		}finally {
			try {
				if (inputStream != null) {
					inputStream.close();
					System.out.println("Animais recuperados com sucesso!\n");
				}
			}catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	public void excluirEquipe(Equipe equipe) {

	}

	public String[] leValores(String[] dadosIn) {
		return null;
	}

}
