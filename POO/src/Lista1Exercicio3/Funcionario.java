package Lista1Exercicio3;

import javax.swing.JOptionPane;

public class Funcionario {

	private Integer Cracha;
	private String Nome;
	private Character TipoVinculo;
	private Float ValorHora;
	private Float QtdeHora;
	private Float Salario;
	private Float ValorDesconto;

	public Integer getCracha() {
		return Cracha;
	}

	public void setCracha(Integer cracha) {
		Cracha = cracha;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Character getTipoVinculo() {
		return TipoVinculo;
	}

	public void setTipoVinculo(Character tipoVinculo) {
		TipoVinculo = tipoVinculo;
	}

	public Float getValorHora() {
		return ValorHora;
	}

	public void setValorHora(Float valorHora) {
		ValorHora = valorHora;
	}

	public Float getQtdeHora() {
		return QtdeHora;
	}

	public void setQtdeHora(Float qtdeHora) {
		QtdeHora = qtdeHora;
	}

	public Float getSalario() {
		return Salario;
	}

	public void setSalario(Float salario) {
		Salario = salario;
	}

	public Float getValorDesconto() {
		return ValorDesconto;
	}

	public void setValorDesconto(Float valorDesconto) {
		ValorDesconto = valorDesconto;
	}

	public Float calcularValorSalario() {
		if (TipoVinculo.equals('H')) {
			return (float) (ValorHora * QtdeHora) - ValorDesconto;
		} else {
			return (float) Salario - ValorDesconto;
		}
			}
public Float Salarios() {
	if (TipoVinculo.equals('H')) {
		return (float) ValorHora * QtdeHora;
		
	}else {
		return (float) Salario;
	}
}
	public String imprimir() {
		return "Cracha: " + this.getCracha() + "\nNome: " + this.getNome() + "\nTipo Vínculo: " + this.getTipoVinculo()
				+ "\nSalário: " + Salarios() + "\nDesconto: " + this.getValorDesconto() + "\nValor a receber: " + calcularValorSalario();

	}

	public void menu() {
		Object[] itens = { "Criar Funcionário", "Mostrar Folha de Pagamento", "Alterar remuneração", "Sair" };
		Object selectedItem = JOptionPane.showInputDialog(null, "Escolha um item", "Opção",
				JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

		while (selectedItem != "Sair") {
			if (selectedItem == "Criar Funcionário") {

				Integer inputCracha = Integer.parseInt(JOptionPane.showInputDialog("Informe o Crachá: "));
				this.setCracha(inputCracha);

				String inputNome = JOptionPane.showInputDialog("Informe o Nome: ");
				this.setNome(inputNome);

				Character inputTipoVinculo = JOptionPane.showInputDialog("Informe Tipo Vinculo: ").charAt(0);
				this.setTipoVinculo(inputTipoVinculo);
				if (TipoVinculo == 'H') {

					Float inputValorHora = Float.parseFloat(JOptionPane.showInputDialog("Informe o Valor da Hora: R$"));
					this.setValorHora(inputValorHora);

					Float inputQtdeHora = Float
							.parseFloat(JOptionPane.showInputDialog("Informe a quantidade de horas: "));
					this.setQtdeHora(inputQtdeHora);

				} else {

					Float inputSalario = Float.parseFloat(JOptionPane.showInputDialog("Informe o Salário: R$"));
					this.setSalario(inputSalario);
				}

				Float inputValorDesconto = Float
						.parseFloat(JOptionPane.showInputDialog("Informe o valor do desconto: R$"));
				this.setValorDesconto(inputValorDesconto);

			} else {
				if (selectedItem == "Alterar remuneração") {

					Character inputTipoVinculo = JOptionPane.showInputDialog("Informe Tipo Vinculo: ").charAt(0);
					this.setTipoVinculo(inputTipoVinculo);

					if (TipoVinculo == 'H') {

						Float inputValorHora = Float
								.parseFloat(JOptionPane.showInputDialog("Informe o Valor da Hora: R$"));
						this.setValorHora(inputValorHora);

						Float inputQtdeHora = Float
								.parseFloat(JOptionPane.showInputDialog("Informe a quantidade de horas: "));
						this.setQtdeHora(inputQtdeHora);

					} else {

						Float inputSalario = Float.parseFloat(JOptionPane.showInputDialog("Informe o Salário: R$"));
						this.setSalario(inputSalario);
					}

					Float inputValorDesconto = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do desconto: R$"));
					this.setValorDesconto(inputValorDesconto);

				} else {
					if (selectedItem == "Mostrar Folha de Pagamento") {
					}
				}
				JOptionPane.showMessageDialog(null, this.imprimir());
			}

			selectedItem = JOptionPane.showInputDialog(null, "Escolha um item", "Opção",
					JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
		}
	}
}
