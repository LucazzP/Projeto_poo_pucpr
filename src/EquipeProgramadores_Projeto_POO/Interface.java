package EquipeProgramadores_Projeto_POO;

import java.awt.event.ActionListener;

import javax.swing.*;

public class Interface {
	public static void iniciarInterface() {
		JFrame frame = new JFrame("Login");
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel painel = new JPanel();
		frame.add(painel);
		inserir_componentes(painel);
		frame.setLocation(600, 250);
		frame.setVisible(true);
	}

	private static void inserir_componentes(JPanel painel) {
		 painel.setLayout(null);
		 // rótulos e campos
		 
		 JLabel rotulo_altura = new JLabel("Altura (cm)");
		 rotulo_altura.setBounds(10, 10, 80, 25);
		 painel.add(rotulo_altura);
		 
		 JTextField campo_altura = new JTextField(20);
		 campo_altura.setBounds(100, 10, 160, 25);
		 painel.add(campo_altura);
		 
		 JLabel rotulo_peso = new JLabel("Peso (kg)");
		 rotulo_peso.setBounds(10, 40, 80, 25);
		 painel.add(rotulo_peso);
		 
		 JTextField campo_peso = new JTextField(20);
		 campo_peso.setBounds(100, 40, 160, 25);
		 painel.add(campo_peso);
		 
		 // botão
		 JButton botao_calcular = new JButton("Calcular");
		 botao_calcular.setBounds(180, 80, 80, 25);
		 painel.add(botao_calcular);
		 
		 ActionListener leitor_botoes = new LeitorBotoes();
		 botao_calcular.addActionListener(leitor_botoes);
	 }
}
