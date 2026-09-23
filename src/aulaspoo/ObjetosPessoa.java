package aulaspoo;

public class ObjetosPessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		Pessoa pessoa4 = new Pessoa();
		
		pessoa1.setNome("Lagartixa");
		pessoa1.setIdade(60);
		pessoa1.setEndereco("California, USA");
		pessoa1.setProfissao("Ator");
		pessoa1.setCPF("123.345.567-89");
		pessoa1.setRG("23.854.123-4");
		
		pessoa2.setNome("Messi");
		pessoa2.setIdade(35);
		pessoa2.setEndereco("Miami, USA");
		pessoa2.setProfissao("Jogador de Futebol");
		pessoa2.setCPF("213.122.125-56");
		pessoa2.setRG("12.123.123-2");
		
		pessoa3.setNome("Luiz Inacio Lula da Silva");
		pessoa3.setIdade(69);
		pessoa3.setEndereco("Meu coração");
		pessoa3.setProfissao("Embaixador");
		pessoa3.setCPF("234.345.456-67");
		pessoa3.setRG("12.123.234-4");
		
		pessoa4.setNome("Pica-Pau");
		pessoa4.setIdade(13);
		pessoa4.setEndereco("Floresta de Ferro");
		pessoa4.setProfissao("Picar paus");
		pessoa4.setCPF("234.345.456-67");
		pessoa4.setRG("12.123.234.-45");
		
		System.out.println("-------- OBJETO 1 ---------");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getProfissao());
		System.out.println(pessoa1.getCPF());
		System.out.println(pessoa1.getRG());
		
		System.out.println("-------- OBJETO 2 --------");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.getProfissao());
		System.out.println(pessoa2.getCPF());
		System.out.println(pessoa2.getRG());
		
		System.out.println("-------- OBJETO 3 -------");
		System.out.println(pessoa3.getNome());
		System.out.println(pessoa3.getIdade());
		System.out.println(pessoa3.getEndereco());
		System.out.println(pessoa3.getProfissao());
		System.out.println(pessoa3.getCPF());
		System.out.println(pessoa3.getRG());
		
		System.out.println("------- OBJETO 4 -------");
		System.out.println(pessoa4.getNome());
		System.out.println(pessoa4.getIdade());
		System.out.println(pessoa4.getEndereco());
		System.out.println(pessoa4.getProfissao());
		System.out.println(pessoa4.getCPF());
		System.out.println(pessoa4.getRG());
	}

}
