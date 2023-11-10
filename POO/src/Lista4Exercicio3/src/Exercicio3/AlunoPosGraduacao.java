package Exercicio3;

public class AlunoPosGraduacao implements Aluno {

	private String ra;
	private String nome;
	private String curso;
	private String anoConclusaoGraduacao;
	private double nota1;
	private double nota2;

	public AlunoPosGraduacao(String ra, String nome, String curso, String anoConclusaoGraduacao) {
		this.ra = ra;
		this.nome = nome;
		this.curso = curso;
		this.anoConclusaoGraduacao = anoConclusaoGraduacao;
	}

	@Override
	public double calcularMedia() {
		return (nota1 + nota2) / 2.0;
	}

	@Override
	public String verificarAprovacao() {
		double media = calcularMedia();
		if (media >= 7.0) {
			return "Aprovado";
		} else {
			return "Reprovado";
		}
	}

	@Override
	public String toString() {
		return "\nRA: " + ra + "\nNome: " + nome + "\nCurso: " + curso + "\nAno que concluiu a Graduação: "
				+ anoConclusaoGraduacao + "\nNota 1: " + nota1 + "\nNota 2: " + nota2 + "\nMédia: " + calcularMedia()
				+ "\nSituação: " + verificarAprovacao() + "\n";
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getAnoConclusaoGraduacao() {
		return anoConclusaoGraduacao;
	}

	public void setAnoConclusaoGraduacao(String anoConclusaoGraduacao) {
		this.anoConclusaoGraduacao = anoConclusaoGraduacao;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

}