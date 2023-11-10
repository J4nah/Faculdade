package Exercicio4;

public class AlunoPosGraduacao extends Aluno {

	private String anoConclusaoGraduacao;

	public AlunoPosGraduacao() {

	}

	public AlunoPosGraduacao(String ra, String nome, String curso, String anoConclusao) {
		super(ra, nome, curso);
		this.anoConclusaoGraduacao = anoConclusao;
	}

	@Override
	public String toString() {
		return super.toString() + "Ano de conclusão da graduação: " + anoConclusaoGraduacao + "\n";
	}

	public String getAnoConclusaoGraduacao() {
		return anoConclusaoGraduacao;
	}

	public void setAnoConclusaoGraduacao(String anoConclusaoGraduacao) {
		this.anoConclusaoGraduacao = anoConclusaoGraduacao;
	}
	
}
