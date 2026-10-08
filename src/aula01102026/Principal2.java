package aula01102026;

public class Principal2 {

	public static void main(String[] args) {
		
		Onibus mercedes = new Onibus("1234", "XB2", "AZUL", 2020);
		
		mercedes.ligar();
		mercedes.acelerar();
		mercedes.virar();
		mercedes.frear();
		
		System.out.print("\n");
		
		Carro byd = new Carro("2345", "F7", "ROSA", 2026);
		byd.ligar();
		byd.acelerar();
		byd.virar();
		byd.frear();
		

	}

}
