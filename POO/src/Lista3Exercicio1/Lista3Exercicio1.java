package Lista3Exercicio1;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Lista3Exercicio1 {

	public static void main(String[] args) {

		ArrayList<Curso> cursos = new ArrayList<>();

		while (true) {
			String opcao = JOptionPane.showInputDialog(
					"Menu:\n[1] – Criar Curso\n[2] – Criar Aluno\n[3] – Remover Aluno\n[4] – Mostrar Todos os Cursos\n[5] – Mostrar alunos do curso\n[6] – Sair");
			if (opcao.equals("1")) {
				int codigo = Integer.parseInt(JOptionPane.showInputDialog("Código do curso:"));
				String nome = JOptionPane.showInputDialog("Nome do curso:");
				int cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Carga horária do curso:"));

				Curso curso = new Curso(codigo, nome, cargaHoraria);
				cursos.add(curso);

			} else if (opcao.equals("2")) {
				String ra = JOptionPane.showInputDialog("RA do aluno:");
				String nomeAluno = JOptionPane.showInputDialog("Nome do aluno:");

				Aluno aluno = new Aluno(ra, nomeAluno);

				String cursoOptions = "";
				for (int i = 0; i < cursos.size(); i++) {
					cursoOptions += i + " - " + cursos.get(i).imprimir() + "\n";
				}
				int cursoEscolhido = Integer
						.parseInt(JOptionPane.showInputDialog("Escolha o curso do aluno:\n" + cursoOptions));
				cursos.get(cursoEscolhido).adicionarAluno(aluno);

			} else if (opcao.equals("3")) {
				String raParaRemover = JOptionPane.showInputDialog("RA do aluno a ser removido:");

				boolean alunoRemovido = false;

				for (Curso curso : cursos) {
					if (curso.removerAlunoPeloRA(raParaRemover)) {
						alunoRemovido = true;
					}
				}

				if (alunoRemovido) {
					JOptionPane.showMessageDialog(null, "Aluno com RA " + raParaRemover + " foi removido.");
				} else {
					JOptionPane.showMessageDialog(null, "Aluno com RA " + raParaRemover + " não foi encontrado.");
				}

			} else if (opcao.equals("4")) {
				String info = "";
				for (Curso c : cursos) {
					info += c.imprimir() + "\n";
				}
				JOptionPane.showMessageDialog(null, info);

			} else if (opcao.equals("5")) {
				String cursoOptions = "";
				for (int i = 0; i < cursos.size(); i++) {
					cursoOptions += i + " - " + cursos.get(i).imprimir() + "\n";
				}
				int cursoEscolhido = Integer.parseInt(JOptionPane.showInputDialog("Escolha o curso:\n" + cursoOptions));
				JOptionPane.showMessageDialog(null, cursos.get(cursoEscolhido).imprimirCompleto());

			} else if (opcao.equals("6")) {
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Opção inválida.");
			}
		}
	}
}
