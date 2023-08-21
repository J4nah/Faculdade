package Lista1Exercicio2;

import javax.swing.JOptionPane;

public class Aluno {

	private String Ra;
	private String Nome;
	private Float AC1;
	private Float AC2;
	private Float AG;
	private Float AF;

	public String getRa() {
		return Ra;
	}

	public void setRa(String ra) {
		Ra = ra;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Float getAC1() {
		return AC1;
	}

	public void setAC1(Float aC1) {
		AC1 = aC1;
	}

	public Float getAC2() {
		return AC2;
	}

	public void setAC2(Float aC2) {
		AC2 = aC2;
	}

	public Float getAG() {
		return AG;
	}

	public void setAG(Float aG) {
		AG = aG;
	}

	public Float getAF() {
		return AF;
	}

	public void setAF(Float aF) {
		AF = aF;
	}

	public Float media() {
		return (float) ((AC1 * 0.15) + (AC2 * 0.30) + (AG * 0.10) + (AF * 0.45));
	}

	public String situacao() {
		if (media() >= 5) {
			return "Aprovado";
		} else {
			return "Reprovado";
		}

	}

	public String imprimir() {
		return "RA: " + this.getRa() + "\nNome: " + this.getNome() + "\nAC1: " + this.getAC1() + "\nAC2: "
				+ this.getAC2() + "\nAG: " + this.getAG() + "\nAF: " + this.getAF() + "\nMédia: " + media()
				+ "\nSituação: " + situacao();
	}

	public void menu() {
		Object[] itens = { "Criar Aluno", "Mostrar Aluno", "Sair" };
		Object selectedItem = JOptionPane.showInputDialog(null, "Escolha um item", "Opção",
				JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

		while (selectedItem != "Sair") {
			if (selectedItem == "Criar Aluno") {
				
				String inputRa = JOptionPane.showInputDialog("Informe o RA: ");
				this.setRa(inputRa);

				String inputNome = JOptionPane.showInputDialog("Informe o Nome: ");
				this.setNome(inputNome);

				Float inputAC1 = Float.parseFloat(JOptionPane.showInputDialog("Informe nota AC1: "));
				this.setAC1(inputAC1);

				Float inputAC2 = Float.parseFloat(JOptionPane.showInputDialog("Informe nota AC2: "));
				this.setAC2(inputAC2);

				Float inputAG = Float.parseFloat(JOptionPane.showInputDialog("Informe nota AG: "));
				this.setAG(inputAG);

				Float inputAF = Float.parseFloat(JOptionPane.showInputDialog("Informe nota AF: "));
				this.setAF(inputAF);

			} else {
				if (selectedItem == "Mostrar Aluno") {
					JOptionPane.showMessageDialog(null, this.imprimir());
				}
			}
			selectedItem = JOptionPane.showInputDialog(null, "Escolha um item", "Opção",
					JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
		}
	}
}
