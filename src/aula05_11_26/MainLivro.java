package aula05_11_26;

public class MainLivro {

	public static void main(String[] args) {
		
		Livro livro = new Livro("Como pegar curioso", "Arnaldo Batista");
		
		System.out.println("Livro: " + livro.getNome() + "\nAutor: " + livro.getAutor());

	}

}
