package Lista3Exercicio2;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Pessoa> pessoas = new ArrayList<>();

		while (true) {
			String opcao = JOptionPane.showInputDialog(
					"[1] – Criar Pessoa\n[2] – Criar Automóvel\n[3] – Transferir Automóvel\n[4] – Mostrar Todas as Pessoas\n[5] – Mostrar automóvel da pessoa\n[6] – Sair");
			if (opcao.equals("1")) {
				int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da pessoa:"));
				String nome = JOptionPane.showInputDialog("Digite o nome da pessoa:");
				Pessoa pessoa = new Pessoa(codigo, nome);
				pessoas.add(pessoa);
			} else if (opcao.equals("2")) {
				if (pessoas.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Primeiro crie uma pessoa.");
					continue;
				}

				String marca = JOptionPane.showInputDialog("Marca do automóvel:");
				String modelo = JOptionPane.showInputDialog("Modelo do automóvel:");
				Automovel auto = new Automovel(marca, modelo);

				String pessoaOptions = "";
				for (int i = 0; i < pessoas.size(); i++) {
					pessoaOptions += i + " - " + pessoas.get(i).getNome() + "\n";
				}
				int pessoaEscolhida = Integer.parseInt(
						JOptionPane.showInputDialog("Escolha a pessoa para associar o automóvel:\n" + pessoaOptions));
				pessoas.get(pessoaEscolhida).inserirAutomovel(auto);

			} else if (opcao.equals("3")) {
				if (pessoas.size() < 2) {
					JOptionPane.showMessageDialog(null, "Crie ao menos duas pessoas para transferir automóveis.");
					continue;
				}

				String origemOptions = "";
				for (int i = 0; i < pessoas.size(); i++) {
					origemOptions += i + " - " + pessoas.get(i).getNome() + "\n";
				}
				int origemEscolhida = Integer
						.parseInt(JOptionPane.showInputDialog("Escolha a pessoa de origem:\n" + origemOptions));
				Pessoa pessoaOrigem = pessoas.get(origemEscolhida);

				if (pessoaOrigem.getAutomoveis().isEmpty()) {
					JOptionPane.showMessageDialog(null, "A pessoa de origem não possui automóveis.");
					continue;
				}

				String autoOptions = "";
				for (int i = 0; i < pessoaOrigem.getAutomoveis().size(); i++) {
					autoOptions += i + " - " + pessoaOrigem.getAutomoveis().get(i).imprimir() + "\n";
				}
				int autoEscolhido = Integer.parseInt(
						JOptionPane.showInputDialog("Escolha o automóvel a ser transferido:\n" + autoOptions));

				String destinoOptions = "";
				for (int i = 0; i < pessoas.size(); i++) {
					if (i != origemEscolhida) {
						destinoOptions += i + " - " + pessoas.get(i).getNome() + "\n";
					}
				}
				int destinoEscolhido = Integer
						.parseInt(JOptionPane.showInputDialog("Escolha a pessoa de destino:\n" + destinoOptions));
				Pessoa pessoaDestino = pessoas.get(destinoEscolhido);

				Automovel autoTransferido = pessoaOrigem.getAutomoveis().get(autoEscolhido);
				pessoaOrigem.removerAutomovel(autoEscolhido);
				pessoaDestino.inserirAutomovel(autoTransferido);

			} else if (opcao.equals("4")) {
				String info = "";
				for (Pessoa p : pessoas) {
					info += p.imprimir() + "\n";
				}
				JOptionPane.showMessageDialog(null, info);

			} else if (opcao.equals("5")) {
				if (pessoas.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Primeiro crie uma pessoa.");
					continue;
				}

				String pessoaOptions = "";
				for (int i = 0; i < pessoas.size(); i++) {
					pessoaOptions += i + " - " + pessoas.get(i).getNome() + "\n";
				}
				int pessoaEscolhida = Integer
						.parseInt(JOptionPane.showInputDialog("Escolha a pessoa:\n" + pessoaOptions));
				JOptionPane.showMessageDialog(null, pessoas.get(pessoaEscolhida).imprimirCompleto());

			} else if (opcao.equals("6")) {
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Opção inválida.");
			}

		}
	}
}
