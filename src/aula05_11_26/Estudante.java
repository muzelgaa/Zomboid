package aula05_11_26;

public class Estudante {
	private String nome;
	private Universidade universidade;

	public Estudante(String nome, Universidade universidade) {
		super();
		this.nome = nome;
		this.universidade = universidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Universidade getUniversidade() {
		return universidade;
	}

	public void setUniversidade(Universidade universidade) {
		this.universidade = universidade;
	}

}
