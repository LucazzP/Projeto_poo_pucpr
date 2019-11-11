public void menuEquipes() {

		String menu = "";
		String entrada;
		int    opc1, opc2;

		do {
			menu = "Controle Empresa de Software\n" +
					"Opções:\n" + 
					"1. Criar equipe\n" +
					"2. Exibir equipes\n" +
					"3. Remover equipe\n" +
					"4. Gravar equipes\n" +
					"5. Recuperar equipes\n" +
					"9. Sair";
			entrada = JOptionPane.showInputDialog (menu + "\n\n");
			
			while (!numeroInteiroValido(entrada)) {
	            entrada = JOptionPane.showInputDialog(null, menu + 
	                    "\n\nEntrada inválida! Digite um número inteiro.");
	        }
			opc1 = new Integer(entrada);

			switch (opc1) {
			case 1:// Entrar dados
				menu = "Criar Equipe\n" +
						"Opções:\n" + 
						"1. Adicionar programador\n" +
						"2. Definir lider\n" +
						"3. Definir nome da equipe\n";

				entrada = JOptionPane.showInputDialog (menu + "\n\n");
				while (!numeroInteiroValido(entrada)) {
		            entrada = JOptionPane.showInputDialog(null, menu + 
		                    "\n\nEntrada inválida! Digite um número inteiro.");
		        }
				opc2 = new Integer(entrada);
				
				String nome = "";
				Programador lider;
				ArrayList<Programador> programadores = new ArrayList<Programador>();

				switch (opc2){
				case 1: programadores.add(criarProgramador());
				break;
				case 2: lider = criarProgramador();
				break;
				case 3: nome = criarNomeEquipe();
				break;
				default: 
					JOptionPane.showMessageDialog(null,"Não digitado uma opção válida");
				}

				break;
			case 2: // Exibir dados
				if (this.equipes.size() == 0) {
					JOptionPane.showMessageDialog(null,"Crie uma equipe primeiro!");
					break;
				}
				String dados = "";
				for (int i=0; i < this.equipes.size(); i++)	{
					dados += this.equipes.get(i).toString() + "\n";
				}
				JOptionPane.showMessageDialog(null,dados);
				break;
			case 3: // Limpar Dados
				if (this.equipes.size() == 0) {
					JOptionPane.showMessageDialog(null,"Crie uma equipe primeiro!");
					break;
				}
				this.equipes.clear();
				JOptionPane.showMessageDialog(null,"Dados LIMPOS com sucesso!");
				break;
			case 4: // Grava Dados
				if (this.equipes.size() == 0) {
					JOptionPane.showMessageDialog(null,"Crie uma equipe primeiro!");
					break;
				}
				salvaProdutos(this.equipes);
				JOptionPane.showMessageDialog(null,"Dados SALVOS com sucesso!");
				break;
			case 5: // Recupera Dados
				this.equipes = recuperaEquipes();
				if (this.equipes.size() == 0) {
					JOptionPane.showMessageDialog(null,"Sem dados para apresentar.");
					break;
				}
				JOptionPane.showMessageDialog(null,"Dados RECUPERADOS com sucesso!");
				break;
			case 9:
				JOptionPane.showMessageDialog(null,"Fim do aplicativo Empresa de Software");
				break;
			}
		} while (opc1 != 9);
	}
	
	private Programador criarProgramador() {
		String [] valores = new String [5];
		String [] nomeVal = {"id", "Nome", "Cpf", "Setor", "Linguagem"};
		valores = leValores (nomeVal);

		Programador prodLat = new Programador(valores[0],valores[1],valores[2],
				valores[3],valores[4]);
		return prodLat;
	}
	
	private boolean numeroInteiroValido(String n) {
        boolean resultado;
        try {
            Integer.parseInt(n);
            resultado = true;
        } catch (NumberFormatException e) {
            resultado = false;
        }
        return resultado;
	}
