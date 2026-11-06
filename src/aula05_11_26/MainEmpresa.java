package aula05_11_26;

public class MainEmpresa {

	public static void main(String[] args) {
		Departamento departamento = new Departamento("RH");
		Empresa empresa = new Empresa("Lux", departamento);
		
		System.out.println("Nome da empresa: " + empresa.getNome() + "\nDepartamento: " + departamento.getNome());
				

	}

}
