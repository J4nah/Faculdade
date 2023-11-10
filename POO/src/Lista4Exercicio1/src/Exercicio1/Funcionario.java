package Exercicio1;

public class Funcionario extends Pessoa {

	private int cracha;
	private double salario;

	public Funcionario() {

	}

	public Funcionario(String nome, String cpf, int cracha, double salario) {
		super(nome, cpf);
		this.cracha = cracha;
		this.salario = salario;
	}

	public int getCracha() {
		return cracha;
	}

	public void setCracha(int cracha) {
		this.cracha = cracha;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCrachá: " + cracha + "\nSalário: R$ " + salario;
	}

}
