package Exercicio4;

import javax.swing.JOptionPane;


import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<AlunoPosGraduacao> alunoPos = new ArrayList<AlunoPosGraduacao>();
		ArrayList<AlunoGraduacao> alunoGrad = new ArrayList<AlunoGraduacao>();

		Object[] itens = { "Inserir Aluno(a)", "Exibir Alunos", "Sair" };
		String selectedItem = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
				JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

		while (!selectedItem.equals("Sair")) {
			switch (selectedItem) {
			case "Inserir Aluno(a)":
				Object[] itens2 = { "Aluno(a) de Pós Graduação", "Aluno(a) de Graduação" };
				String selectedItem2 = (String) JOptionPane.showInputDialog(null, "Escolha um item", "Opção",
						JOptionPane.INFORMATION_MESSAGE, null, itens2, itens2[0]);

				if (selectedItem2.equals("Aluno(a) de Pós Graduação")) {
					AlunoPosGraduacao alunoPosG = new AlunoPosGraduacao(JOptionPane.showInputDialog("RA do Aluno(a)"),
							JOptionPane.showInputDialog("Nome do Aluno(a)"), JOptionPane.showInputDialog("Curso"),
							JOptionPane.showInputDialog("Ano de conclusão da graduação"));
					alunoPos.add(alunoPosG);
					JOptionPane.showMessageDialog(null, "Aluno(a) cadastrado(a) com sucesso!!");
				}

				if (selectedItem2.equals("Aluno(a) de Graduação")) {
					AlunoGraduacao alunoGraduacao = new AlunoGraduacao(JOptionPane.showInputDialog("RA do Aluno(a)"),
							JOptionPane.showInputDialog("Nome do Aluno(a)"), JOptionPane.showInputDialog("Curso"),
							JOptionPane.showInputDialog("Ano de conclusão do ensino médio"));
					alunoGrad.add(alunoGraduacao);
					JOptionPane.showMessageDialog(null, "Aluno(a) cadastrado(a) com sucesso!!");
				}
				break;

			case "Exibir Alunos":
				String alunosInfo = "Alunos Cadastrados\n";
				for (AlunoPosGraduacao alunosPos : alunoPos) {
					alunosInfo += "\nAluno(a) de Pós Graduaçao\n" + alunosPos.toString();
				}

				for (AlunoGraduacao alunosGrad : alunoGrad) {
					alunosInfo += "\nAluno(a) de Graduaçao\n" + alunosGrad.toString();
				}

				JOptionPane.showMessageDialog(null, alunosInfo);
				break;

			case "Sair":
				break;
			}

			selectedItem = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
					JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
		}
	}
}
