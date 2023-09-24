package Lista3Exercicio1;

import java.util.ArrayList;

public class Curso {

	private int codigo;
	private String nome;
	private int cargaHoraria;
	private ArrayList<Aluno> alunos;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	
	  public ArrayList<Aluno> getAlunos() { return alunos; }
	 
	  public void setAlunos(ArrayList<Aluno> alunos) { this.alunos = alunos; }
	 

	public Curso() {

	}

	public Curso(int codigo, String nome, int cargaHoraria) {
		this.codigo = codigo;
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.alunos = new ArrayList<>();
	}

	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);

	}

	public void removerAluno(int index) {
		if (index >= 0 && index < alunos.size()) {
			alunos.remove(index);
		}

	}

	public String imprimir() {
		return "Código: " + this.codigo + "\nNome: " + this.nome + "\nCarga Horária: " + this.cargaHoraria;
	}

	public String imprimirCompleto() {
		String impressao = this.imprimir() + "\n";
		for (Aluno a : this.alunos) {
			impressao += a.imprimir() + "\n";
		}
		return impressao;
	}

	public boolean removerAlunoPeloRA(String ra) {
	    for (int i = 0; i < alunos.size(); i++) {
	        if (alunos.get(i).getRa().equals(ra)) {
	            alunos.remove(i);
	            return true; 
	        }
	    }
	    return false;  
	}
}
