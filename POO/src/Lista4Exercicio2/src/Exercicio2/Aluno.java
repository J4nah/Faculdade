package Exercicio2;

public abstract class Aluno {

	private String ra;
	private String nome;
	private String curso;

	public Aluno() {

	}

	public Aluno(String ra, String nome, String curso) {
		this.ra = ra;
		this.nome = nome;
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "RA: " + ra + "\nNome: " + nome + "\nCurso: " + curso;
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

	public abstract double calcularMedia();

	public abstract String verificarAprovacao();

}
