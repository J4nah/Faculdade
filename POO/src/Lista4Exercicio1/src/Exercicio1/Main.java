package Exercicio1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();
		ArrayList<Professor> prof = new ArrayList<Professor>();
		ArrayList<Atendente> atend = new ArrayList<Atendente>();
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();

		Object[] itens = { "Adicionar Disciplina", "Adicionar Professor", "Adicionar Atendente", "Adicionar Aluno",
				"Adicionar Disciplina ao Professor", "Mostrar Pessoas", "Sair" };
		String selectedItem = (String) JOptionPane.showInputDialog(null, "Escolha um item", "Opção",
				JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

		while (!selectedItem.equals("Sair")) {
			switch (selectedItem) {
			case "Adicionar Disciplina":
				Disciplina d = new Disciplina();
				d.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Código da disciplina")));
				d.setNome(JOptionPane.showInputDialog("Nome da disciplina"));
				disciplina.add(d);
				JOptionPane.showMessageDialog(null, "Disciplina adicionada com sucesso.");
				break;

			case "Adicionar Professor":
				Professor pr = new Professor();
				pr.setCracha(Integer.parseInt(JOptionPane.showInputDialog("Número do crachá")));
				pr.setNome(JOptionPane.showInputDialog("Nome do Professor(a)"));
				pr.setCpf(JOptionPane.showInputDialog("CPF"));
				pr.setUrlLattes(JOptionPane.showInputDialog("Url Curriculo Lattes"));
				pr.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o Salário")));
				prof.add(pr);
				JOptionPane.showMessageDialog(null, "Professor(a) Adicionado(a) com sucesso.");
				break;

			case "Adicionar Atendente":
				Atendente at = new Atendente();
				at.setCracha(Integer.parseInt(JOptionPane.showInputDialog("Número do crachá")));
				at.setNome(JOptionPane.showInputDialog("Nome do(a) Atendente"));
				at.setCpf(JOptionPane.showInputDialog("CPF"));
				at.setFuncao(JOptionPane.showInputDialog("Digite a Função"));
				at.setSetor(JOptionPane.showInputDialog("Digite o Setor"));
				at.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o Salário")));
				atend.add(at);
				JOptionPane.showMessageDialog(null, "Atendente adicionado(a) com sucesso.");
				break;

			case "Adicionar Aluno":
				Aluno al = new Aluno();
				al.setRa(JOptionPane.showInputDialog("Número do RA"));
				al.setNome(JOptionPane.showInputDialog("Nome do Aluno(a)"));
				al.setCpf(JOptionPane.showInputDialog("CPF"));
				al.setCurso(JOptionPane.showInputDialog("Curso do Aluno(a)"));
				alunos.add(al);
				JOptionPane.showMessageDialog(null, "Aluno(a) adicionado(a) com sucesso.");
				break;

			case "Adicionar Disciplina ao Professor":
				int codProf = Integer.parseInt(JOptionPane.showInputDialog("Digite o Crachá do(a) Professor(a)"));
				int codDisc = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da Disciplina"));

				Professor pro = null;
				for (Professor p : prof) {
					if (p.getCracha() == codProf) {
						pro = p;
						break;
					}
				}
				Disciplina dis = null;
				for (Disciplina di : disciplina) {
					if (di.getCodigo() == codDisc) {
						dis = di;
						break;
					}
				}
				if (pro != null && dis != null) {
					pro.addDisciplina(dis);
					JOptionPane.showMessageDialog(null, "Disciplina adicionada ao(a) professor(a) com sucesso.");
				} else {
					JOptionPane.showMessageDialog(null, "Professor(a) ou disciplina não encontrados.");
				}

				break;

			case "Mostrar Pessoas":
				String pessoasInfo = "Pessoas Cadastradas";
				for (Aluno aluno : alunos) {
					pessoasInfo += "\nAluno(a)" + aluno.toString() + "\n";
				}
				for (Professor professor : prof) {
					pessoasInfo += "\nProfessor(a)" + professor.toString() + "\n";
				}
				for (Atendente atendentes : atend) {
					pessoasInfo += "Atendente" + atendentes.toString() + "\n";
				}

				JOptionPane.showMessageDialog(null, pessoasInfo);
				break;

			case "Sair":
				break;
			}

			selectedItem = (String) JOptionPane.showInputDialog(null, "Escolha um item", "Opção",
					JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
		}

	}

}
