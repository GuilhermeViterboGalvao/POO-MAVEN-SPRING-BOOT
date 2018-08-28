package br.curso.poo.json;

public class MainJson {

	public static void main(String[] args) {
		Car uno = new Car();
		uno.setName("Fiat Uno");
		
		Passenger jose = new Passenger();
		jose.setName("Jose dos Santos");
		jose.setAge(45);
		jose.setSex('m');
		uno.getPassengers().add(jose);
		
		Passenger maria = new Passenger();
		maria.setName("Maria dos Santos");
		maria.setAge(40);
		maria.setSex('f');
		uno.getPassengers().add(maria);
		
		Passenger pedrinho = new Passenger();
		pedrinho.setName("Pedro do Santos");
		pedrinho.setAge(10);
		pedrinho.setSex('m');
		uno.getPassengers().add(pedrinho);
		
		Passenger aninha = new Passenger();
		aninha.setName("Ana Maria do Santos");
		aninha.setAge(12);
		aninha.setSex('f');
		uno.getPassengers().add(aninha);

		ConvertTo convertTo = ConvertTo.getInstance();
		try {
			convertTo.json(uno, "/home/guilherme/uno.json");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}