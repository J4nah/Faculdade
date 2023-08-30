package exemploMetodoConstrutor;

public class Pessoa {
	private String cpf;
    private String nome;
    private String cnh;

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    
    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    
    public String imprimir() {
        return "A pessoa " + this.nome + " tem CPF " + this.cpf + " e CNH " + this.cnh;
    }
}
	
	

