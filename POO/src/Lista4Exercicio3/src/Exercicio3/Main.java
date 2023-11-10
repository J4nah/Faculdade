package Exercicio3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		ArrayList<AlunoPosGraduacao> alunoPos = new ArrayList<AlunoPosGraduacao>();
		ArrayList<AlunoGraduacao> alunoGrad = new ArrayList<AlunoGraduacao>();

		Object[] itens = { "Inserir Novo Aluno(a)", "Exibir Alunos(as)", "Sair" };
		String selectedItem = (String) JOptionPane.showInputDialog(null, "Escolha um item", "Opção",
				JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

		while (!selectedItem.equals("Sair")) {
			switch (selectedItem) {
			case "Inserir Novo Aluno(a)":
				Object[] itens2 = { "Aluno(a) de Pós Graduação", "Aluno(a) de Graduação" };
				String selectedItem2 = (String) JOptionPane.showInputDialog(null, "Escolha um item", "Opção",
						JOptionPane.INFORMATION_MESSAGE, null, itens2, itens2[0]);

				if (selectedItem2.equals("Aluno(a) de Pós Graduação")) {
					AlunoPosGraduacao alunoPosG = new AlunoPosGraduacao(JOptionPane.showInputDialog("RA do Aluno(a)"),
							JOptionPane.showInputDialog("Nome do(a) Aluno(a)"), JOptionPane.showInputDialog("Curso"),
							JOptionPane.showInputDialog("Ano de conclusão da graduação"));
					alunoPosG.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira Nota")));
					alunoPosG.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda Nota")));
					alunoPos.add(alunoPosG);
					JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!!");
				}

				if (selectedItem2.equals("Aluno(a) de Graduação")) {
					AlunoGraduacao alunoGradu = new AlunoGraduacao(JOptionPane.showInputDialog("RA do Aluno(a)"),
							JOptionPane.showInputDialog("Nome do(a) Aluno(a)"), JOptionPane.showInputDialog("Curso"),
							JOptionPane.showInputDialog("Ano de conclusão do ensino médio"));
					alunoGradu.setAc1(Double.parseDouble(JOptionPane.showInputDialog("Nota AC1")));
					alunoGradu.setAc2(Double.parseDouble(JOptionPane.showInputDialog("Nota AC2")));
					alunoGradu.setAf(Double.parseDouble(JOptionPane.showInputDialog("Nota AF")));
					alunoGradu.setAg(Double.parseDouble(JOptionPane.showInputDialog("Nota AG")));
					alunoGrad.add(alunoGradu);
					JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!!");
				}
				break;

			case "Exibir Alunos(as)":
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

			selectedItem = (String) JOptionPane.showInputDialog(null, "Escolha um item", "Opção",
					JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
		}
	}
}
