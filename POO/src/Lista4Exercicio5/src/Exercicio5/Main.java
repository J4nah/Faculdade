package Exercicio5;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Funcionario func1 = new Funcionario();
		JOptionPane.showMessageDialog(null, "Matricula: " + func1.getMatricula());

		Funcionario func2 = new Funcionario();
		JOptionPane.showMessageDialog(null, "Matricula: " + func2.getMatricula());

		Funcionario func3 = new Funcionario();
		JOptionPane.showMessageDialog(null, "Matricula: " + func3.getMatricula());

		JOptionPane.showMessageDialog(null, "Quantidade de Funcionarios: " + Funcionario.getQtd());

	}

}
