package Lista2;

import javax.swing.JOptionPane;

public class Vendedor {

	private int codigo;
	private String nome;
	private double percentualComissao;

	public Vendedor() {

	}

	public Vendedor(int codigo, String nome, double percentualComissao) {

		this.codigo = codigo;
		this.nome = nome;
		this.percentualComissao = percentualComissao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPercentualComissao() {
		return percentualComissao;
	}

	public void setPercentualComissao(double percentualComissao) {
		this.percentualComissao = percentualComissao;
	}

	
	public double calcularPagamentoComissao(double valorVenda) {

		return valorVenda * percentualComissao / 100;

	}

	public double calcularPagamentoComissao(double valorVenda, double desconto) {

		return calcularPagamentoComissao(valorVenda) - desconto;
	}

		
	public void cadastrarVendedor() {
		this.codigo = Integer.parseInt(JOptionPane.showInputDialog("Código do(a) funcionário(a)"));
		this.nome = JOptionPane.showInputDialog("Nome do(a) funcionário(a)");
		this.percentualComissao = Double.parseDouble(JOptionPane.showInputDialog("Valor da comissão"));
	}
	
	public String imprimir(double valorVenda, double desconto) {

		return "Código: " + this.codigo + "\n" + "Nome Funcionario(a): " + this.nome + "\n" + "Valor da venda: R$"
				+ valorVenda + "\n" + "% comissao: " + this.percentualComissao + "\n" + "desconto: R$" + desconto + "\n"
				+ "valor a pagar: R$" + this.calcularPagamentoComissao(valorVenda, desconto);

	}

}