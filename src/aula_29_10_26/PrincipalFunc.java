package aula_29_10_26;

public class PrincipalFunc {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("Joao", "432.233.234-33", 2900, "Repositor", "Mercadoria");
		System.out.println("Pessoa: ");
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("CPF: " + funcionario.getCpf());
		System.out.println("Salario: " + funcionario.getSalario());
		System.out.println("Cargo: " + funcionario.getCargo());
		System.out.println("Departamento: " + funcionario.getDepartamento());
		
		
		Atendente atendente = new Atendente("Joao", "209.920.298-22", 1900, "", "Vendas", 500);
		System.out.println("\nAtendente:");
		System.out.println("Nome: " + atendente.getNome());
		System.out.println("CPF: " + atendente.getCpf());
		System.out.println("Salario: " + atendente.getSalario());
		System.out.println("Cargo: " + atendente.getCargo());
		System.out.println("Departamento: " + atendente.getDepartamento());
		System.out.println("Ajuda de Custo: " + atendente.getAjudadeCusto());
		
		
		
		
		

	}

}
