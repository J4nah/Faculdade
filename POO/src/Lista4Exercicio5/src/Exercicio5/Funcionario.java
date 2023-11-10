package Exercicio5;

public class Funcionario {

	private static int qtd;
	private int matricula;

	public Funcionario() {
		Funcionario.qtd++;
		this.matricula = Funcionario.qtd;
	}

	public static int getQtd() {
		return qtd;
	}

	public static void setQtd(int qtd) {
		Funcionario.qtd = qtd;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

}
