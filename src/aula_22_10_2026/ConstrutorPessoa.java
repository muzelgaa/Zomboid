package aula_22_10_2026;

public class ConstrutorPessoa {

	public static void main(String[] args) {
		
		Pessoa jogador1 = new Pessoa();
		Pessoa jogador2 = new Pessoa("Messi",36);
		Pessoa jogador3 = new Pessoa();
		Pessoa jogador4 = new Pessoa();
		
		System.out.println(jogador2.getNome());
		System.out.println(jogador2.getIdade());
		
		jogador1.setNome("Ronaldo");
		jogador1.setIdade(56);
		System.out.println(jogador1.getNome());
		System.out.println(jogador1.getIdade());
		
		jogador3.setNome("Joao");
		System.out.println(jogador3.getNome());
		
		jogador4.setIdade(13);
		System.out.println(jogador4.getIdade());

	}

}
