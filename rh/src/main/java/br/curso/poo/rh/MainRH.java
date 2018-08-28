package br.curso.poo.rh;

import java.util.Calendar;
import java.util.Date;

public class MainRH {

	public static void main(String[] args) {
		Analyzer analyzer = new Analyzer();
		analyzer.setName("Ana");
		analyzer.setBirthDate(getDate(9, 10, 1990));
		analyzer.setSalary(6780.45f);
		analyzer.setSex('f');
		
		Employee employee = new Employee();
		employee.setName("Jose da Silva");
		employee.setSalary(3560.90f);
		employee.setBirthDate(getDate(23, 6, 1980));
		employee.setSex('m');
		
		//Explicar o porque um employee nao pode sofrer o DownCast nesse caso
		//analyzer.getTeam().add((Programmer)employee);
		
		Programmer programmer = new Programmer();
		programmer.setName("Marcos");
		programmer.setBirthDate(getDate(2, 8, 1992));
		programmer.setSalary(3100);
		programmer.setSex('m');
		programmer.setProgrammingLenguage("Java");
		analyzer.getTeam().add(programmer);
		
		programmer = new Programmer();
		programmer.setName("Paula");
		programmer.setBirthDate(getDate(15, 4, 1989));
		programmer.setSalary(3250);
		programmer.setSex('f');
		programmer.setProgrammingLenguage("Java");
		analyzer.getTeam().add(programmer);
		
		//Exmplicar a logica de criar metodos construtores recebendo objetos
		//e o this() no construtor
		programmer = new Programmer("java", employee);
		analyzer.getTeam().add(programmer);
		
		System.out.println(analyzer);
		
		//Exemplificar o UpCasting e o DownCasting com o Analyser, Programmer e Employee
	}
	
	//Forcar os alunos a pensarem em uma maneira de nao precisar toda hora ficar usando
	//o calendar no metodo main para criar as datas
	private static Date getDate(int day, int month, int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.MILLISECOND, 0);		
		return calendar.getTime();
	}
}