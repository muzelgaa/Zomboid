package aulaspoo;

public class ObjetosTransformer {

	public static void main(String[] args) {
		Transformer carro1 = new Transformer ();
		Transformer carro2 = new Transformer ();
		Transformer carro3 = new Transformer ();
		Transformer carro4 = new Transformer ();
		
		carro1.setNome("BYD");
		carro1.setCor("Roxo");
		carro1.setAno("1765");
		carro1.setModelo("Brocador");
		
		carro2.setNome("NANOCAR");
		carro2.setCor("Purpura");
		carro2.setAno("1");
		carro2.setModelo("Aparador");
		
		carro3.setNome("ULTRABOT");
		carro3.setCor("Lilas");
		carro3.setAno("34");
		carro3.setModelo("XUNXADOR");
		
		carro4.setNome("PRICABOT");
		carro4.setCor("AZUL BEBE");
		carro4.setAno("1999");
		carro4.setModelo("Picador");
		
		System.out.println("----------- TRANSFORMER 1 ----------");
		System.out.println(carro1.getNome());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getAno());
		System.out.println(carro1.getModelo());
		
		System.out.println("----------- TRANSFORMER 2 ----------");
		System.out.println(carro2.getNome());
		System.out.println(carro2.getCor());
		System.out.println(carro2.getAno());
		System.out.println(carro2.getModelo());
		
		System.out.println("----------- TRANSFORMER 3 ----------");
		System.out.println(carro3.getNome());
		System.out.println(carro3.getCor());
		System.out.println(carro3.getAno());
		System.out.println(carro3.getModelo());
		
		System.out.println("----------- TRANSFORMER 4 ----------");
		System.out.println(carro4.getNome());
		System.out.println(carro4.getCor());
		System.out.println(carro4.getAno());
		System.out.println(carro4.getModelo());
		
		
		

	}

}
