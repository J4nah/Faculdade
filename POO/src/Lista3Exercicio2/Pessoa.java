package Lista3Exercicio2;

import java.util.ArrayList;

public class Pessoa {

	private int codigo;
	private String nome;
	private ArrayList<Automovel> automoveis;
	
	

	public ArrayList<Automovel> getAutomoveis() {
		return automoveis;
	}

	public void setAutomoveis(ArrayList<Automovel> automoveis) {
		this.automoveis = automoveis;
	}

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

	public Pessoa() {

	}

	public Pessoa(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
		this.automoveis = new ArrayList<>();
	}

	public void inserirAutomovel(Automovel automovel) {
		automoveis.add(automovel);
	}

	public void removerAutomovel(int index) {
		if (index >= 0 && index < automoveis.size()) {
			automoveis.remove(index);
		}
	}

	public String imprimir() {
		return "Código: " + this.codigo + "\nNome: " + this.nome;
	}

	public String imprimirCompleto() {
		String resultado = this.imprimir() + "\nAutomóveis: ";
		for (Automovel auto : automoveis) {
			resultado += "\n\t" + auto.imprimir();
		}
		return resultado;
	}
}
