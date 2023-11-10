package Exercicio2;

public class AlunoGraduacao extends Aluno {

	private String anoConclusaoEnsinoMedio;
	private double ac1;
	private double ac2;
	private double af;
	private double ag;

	public AlunoGraduacao() {

	}

	public AlunoGraduacao(String ra, String nome, String curso, String anoConclusao) {
		super(ra, nome, curso);
		this.anoConclusaoEnsinoMedio = anoConclusao;

	}

	@Override
	public String toString() {
		return super.toString() + "\nAno de conclusao do ensino médio: " + anoConclusaoEnsinoMedio + "\nAC1: " + ac1
				+ "\nAC2: " + ac2 + "\nAF: " + af + "\nAG: " + ag + "\nMédia: " + calcularMedia() + "\nSituação: "
				+ verificarAprovacao() + "\n\n";
	}

	public String getAnoConclusaoEnsinoMedio() {
		return anoConclusaoEnsinoMedio;
	}

	public void setAnoConclusaoEnsinoMedio(String anoConclusaoEnsinoMedio) {
		this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
	}

	public double getAc1() {
		return ac1;
	}

	public void setAc1(double ac1) {
		this.ac1 = ac1;
	}

	public double getAc2() {
		return ac2;
	}

	public void setAc2(double ac2) {
		this.ac2 = ac2;
	}

	public double getAf() {
		return af;
	}

	public void setAf(double af) {
		this.af = af;
	}

	public double getAg() {
		return ag;
	}

	public void setAg(double ag) {
		this.ag = ag;
	}

	@Override
	public double calcularMedia() {
		return (ac1 * 0.1) + (ac2 * 0.3) + (ag * 0.2) + (af * 0.4);
	}

	@Override
	public String verificarAprovacao() {
		double media = calcularMedia();
		if (media >= 7) {
			return "Aluno Aprovado!!";
		} else {
			return "Aluno Reprovado!!";
		}
	}
}
