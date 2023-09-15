package Lista2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class apolice {

	private int numero;
	private String nome;
	private int idade;
	private char sexo;
	private double valorAutomovel;

	public apolice() {

	}

	public apolice(int numero, String nome, int idade, char sexo, double valorAutomovel) {

		this.numero = numero;
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.valorAutomovel = valorAutomovel;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getValorAutomovel() {
		return valorAutomovel;
	}

	public void setValorAutomovel(double valorAutomovel) {
		this.valorAutomovel = valorAutomovel;
	}

	public Double calcularValor() {
		if (sexo == 'M' && idade <= 25) {
			return (double) valorAutomovel * 10 / 100;
		} else {
		}
		if (sexo == 'M' && idade > 25) {

			return (double) valorAutomovel * 5 / 100;
		} else {
		}
		if (sexo == 'F') {

			return (double) valorAutomovel * 2 / 100;
		}
		return calcularValor();
	}

	public String imprimir() {
		return "A apolice de numero: " + this.numero + ". Pertence ao(a) proprietário(a): " + this.nome
				+ ", que tem a idade: " + this.idade + " anos, do sexo: " + this.sexo
				+ ", possui um automovel no valor de: R$ " + this.valorAutomovel + ", e sua apolice tem o valor de: R$ "
				+ this.calcularValor();
	}

	public void menu() {
		Object[] itens = { "Criar apólice", "Ver dados da apólice", "Sair" };
		String selectedItem = (String) JOptionPane.showInputDialog(null, "Escolha um item", "Opçao",
				JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

		ArrayList<apolice> listaApolices = new ArrayList<apolice>();

		while (!selectedItem.equals("Sair")) {
			if (selectedItem.equals("Criar apólice")) {
				apolice newApolice = new apolice();
				newApolice.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Número")));
				newApolice.setNome(JOptionPane.showInputDialog("Informe o nome"));
				newApolice.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade")));
				newApolice.setSexo(JOptionPane.showInputDialog("Informe o sexo").toUpperCase().charAt(0));
				newApolice.setValorAutomovel(
						Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do Automovel")));
				listaApolices.add(newApolice);
			} else {
				if (selectedItem.equals("Ver dados da apólice")) {
					int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da apólice"));
					apolice findApolice = new apolice();
					for (int i = 0; i < listaApolices.size(); i++) {
						if (listaApolices.get(i).numero == numero) {
							findApolice = listaApolices.get(i);
						}
					}
						if (findApolice.getNome() == null) {
							JOptionPane.showMessageDialog(null, "Apólice não localizada");
						} else {
							JOptionPane.showMessageDialog(null, findApolice.imprimir());
						}
					}
				}
			selectedItem = (String) JOptionPane.showInputDialog(null, "Escolha um item", "Opçao",
					JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
			}
		}
	}
