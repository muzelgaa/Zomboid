package aula_29_10_26;

public class Principal {

	public static void main(String[] args) {
	
		Pessoa pessoa = new Pessoa("Joao da Silva", "(11) 99999-9999");
		System.out.println("Pessoa: ");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Telefone: " + pessoa.getTelefone());
		
		
		PessoaFisica pessoaFisica = new PessoaFisica("Joao da Silva", "(11) 99999-9999", "123.456.789-00", "30.456.789-2");
		System.out.println("\nPessoa Fisica:");
		System.out.println("Nome: " + pessoaFisica.getNome());
		System.out.println("Telefone: " + pessoaFisica.getTelefone());
		System.out.println("CPF: " + pessoaFisica.getCpf());
		System.out.println("RG: " + pessoaFisica.getRg());
		
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", "(11) 99999-9999", "12.345.678/0001-10");
		System.out.println("\nPessoa Juridica:");
		System.out.println("Nome: " + pessoaJuridica.getNome());
		System.out.println("Telefone: " + pessoaJuridica.getTelefone());
		System.out.println("CNPJ: " + pessoaJuridica.getCnpj());

	}

}
