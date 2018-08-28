package br.curso.poo.rh;

public class Programmer extends Employee {

	public Programmer() { }
	
	public Programmer(Employee employee) { 
		if (employee != null) {
			name = employee.getName();
			birthDate = employee.getBirthDate();
			salary = employee.getSalary();
			sex = employee.getSex();
		}
	}
	
	public Programmer(String programmingLenguage) { 
		this.programmingLenguage = programmingLenguage;
	}
	
	public Programmer(String programmingLenguage, Employee employee) {
		this(employee);
		this.programmingLenguage = programmingLenguage;
	}	
	
	private String programmingLenguage;

	public String getProgrammingLenguage() {
		return programmingLenguage;
	}

	public void setProgrammingLenguage(String programmingLenguage) {
		this.programmingLenguage = programmingLenguage;
	}
	
	@Override
	public String toString() {
		String out = super.toString();
		if (programmingLenguage != null && !programmingLenguage.isEmpty()) {
			out += "\nProgramming Lenguage: " + programmingLenguage;
		}
		return out;
	}
}