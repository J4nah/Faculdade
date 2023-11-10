package Exercicio1;

import java.util.ArrayList;

public class Professor extends Funcionario {

	private String urlLattes;
	private ArrayList<Disciplina> disciplinas = new ArrayList<>();

	public Professor() {

	}

	public Professor(String nome, String cpf, String urlLattes) {
		super(nome, cpf, 0, 0.0);
		this.urlLattes = urlLattes;

	}

	public void addDisciplina(Disciplina disciplina) {
		disciplinas.add(disciplina);
	}

	public void removeDisciplina(int index) {
		if (index >= 0 && index < disciplinas.size()) {
			disciplinas.remove(index);
		}
	}

	public void removeDisciplina(Disciplina disciplina) {
		disciplinas.remove(disciplina);
	}

	public Disciplina getDisciplina(int index) {
		if (index >= 0 && index < disciplinas.size()) {
			return disciplinas.get(index);
		}
		return null;
	}

	public String getUrlLattes() {
		return urlLattes;
	}

	public void setUrlLattes(String urlLattes) {
		this.urlLattes = urlLattes;
	}

	public ArrayList<Disciplina> getDisciplina() {
		return disciplinas;
	}

	public void setDisciplina(ArrayList<Disciplina> disciplina) {
		this.disciplinas = disciplina;
	}

	@Override
	public String toString() {
	    String result = super.toString();
	    result += "\nCurrículo Lattes: " + urlLattes;
	    result += "\nDisciplinas ministradas:\n";

	    for (Disciplina disciplina : disciplinas) {
	        result += "- " + disciplina.getNome() + "\n";
	    }

	    return result;
	}

}
