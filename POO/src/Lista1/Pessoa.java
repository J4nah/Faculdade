package Lista1;

import javax.swing.JOptionPane;

public class Pessoa {

	private String cpf;
	private String nome;
	private Character sexo;
	private Integer idade;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String imprimir() {
		return "Nome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nSexo: " + this.getSexo() + "\nIdade: "
				+ this.getIdade();
	}

	public void menu() {
		Object[] itens = { "Criar pessoa", "Mostrar pessoa", "Sair" };
		Object selectedItem = JOptionPane.showInputDialog(null, "Escolha um item", "Opção",
				JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

		while (selectedItem != "Sair") {
			if (selectedItem == "Criar pessoa") {
				String inputNome = JOptionPane.showInputDialog("Informe o Nome: ");
				this.setNome(inputNome);

				String inputCpf = JOptionPane.showInputDialog("Informe o CPF: ");
				this.setCpf(inputCpf);

				Character inputSexo = JOptionPane.showInputDialog("Informe o Sexo (F/M): ").charAt(0);
				this.setSexo(inputSexo);

				Integer inputIdade = Integer.parseInt(JOptionPane.showInputDialog("Informe a Idade: "));

				this.setIdade(inputIdade);
			} else {
				if (selectedItem == "Mostrar pessoa") {
					JOptionPane.showMessageDialog(null, this.imprimir());
				}
			}
			selectedItem = JOptionPane.showInputDialog(null, "Escolha um item", "Opção",
					JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
		}
	}
}