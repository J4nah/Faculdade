package Exercicio4;

public class AlunoGraduacao extends Aluno {

	private String anoConclusaoEnsinoMedio;

	public AlunoGraduacao() {

	}

	public AlunoGraduacao(String ra, String nome, String curso, String anoConclusao) {
		super(ra, nome, curso);
		this.anoConclusaoEnsinoMedio = anoConclusao;

	}

	@Override
	public String toString() {
		return super.toString() + "Ano de conclusão do ensino médio: " + anoConclusaoEnsinoMedio + "\n";
	}

	public String getAnoConclusaoEnsinoMedio() {
		return anoConclusaoEnsinoMedio;
	}

	public void setAnoConclusaoEnsinoMedio(String anoConclusaoEnsinoMedio) {
		this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
	}

}
