package aula01102026;

public class Principal {

	public static void main(String[] args) {
		
		Lobo geraldo = new Lobo();
		Gato ravena = new Gato();
		
		geraldo.dormir();
		geraldo.caminhar();
		geraldo.correr();
		geraldo.emitirSom();
		
		System.out.print("\n");
		
		ravena.dormir();
		ravena.caminhar();
		ravena.correr();
		ravena.emitirSom();
		
		System.out.print("\n");

	}

}
