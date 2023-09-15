package Lista2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class lista2Exercicio2 {

	public static void main(String[] args) {

		ArrayList<Vendedor> listaVendedor = new ArrayList<Vendedor>();

		String selecao = JOptionPane
				.showInputDialog("Digite a opção para: \n[1] Cadastrar vendedor(a) \n[2] Calcular venda \n[3] Sair");

		while (!selecao.equals("3")) {
			if (selecao.equals("1")) {
				Vendedor vendedor = new Vendedor();
				vendedor.cadastrarVendedor();
				listaVendedor.add(vendedor);
			} else {

				int codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do(a) vendedor(a)"));
				Vendedor findVendedor = new Vendedor();
				for (int i = 0; i < listaVendedor.size(); i++) {
					if (listaVendedor.get(i).getCodigo() == codigo) {
						findVendedor = listaVendedor.get(i);

						Double valorVenda = (Double.parseDouble(JOptionPane.showInputDialog("Valor da venda")));
						Double desconto = (Double.parseDouble(JOptionPane.showInputDialog("Valor do desconto")));

						JOptionPane.showMessageDialog(null, findVendedor.imprimir(valorVenda, desconto) + "\n");
					}
				}

			}

			do {
				selecao = JOptionPane.showInputDialog(
						"Digite a opção para: \n[1] Cadastrar vendedor(a) \n[2] Calcular venda \n[3] Sair");
			} while (selecao.equals("2") && selecao.equals("1"));

		}

	}
}
