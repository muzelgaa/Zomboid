package aula05_11_26;

public class PrincipalCarro {

	public static void main(String[] args) {
		Motor motor = new Motor("W16");
		Carro carro = new Carro("Astray", motor);
		
		System.out.println("Carro é: " + carro.getModelo()+ "\nMotor: " + motor.getTipo());

	}

}
