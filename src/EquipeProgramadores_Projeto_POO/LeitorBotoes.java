package EquipeProgramadores_Projeto_POO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class LeitorBotoes implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton origem = (JButton) e.getSource();
		if (origem.getText() == "Calcular") {
			criarUsuario();
		}
	}

	private void criarUsuario() {

	}
}