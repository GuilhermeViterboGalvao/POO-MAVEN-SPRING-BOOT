package br.curso.poo.rh;

import java.util.Date;

public class Employee {
	
	public Employee() { }
	
	public Employee(String name) { 
		this.name = name;
	}
	
	public Employee(String name, Date birthDate) { 
		this.name = name;
		this.birthDate = birthDate;
	}
	
	public Employee(String name, Date birthDate, char sex) { 
		this.name = name;
		this.birthDate = birthDate;
		this.sex = sex;
	}
	
	public Employee(String name, Date birthDate, char sex, float salary) { 
		this.name = name;
		this.birthDate = birthDate;
		this.sex = sex;
		this.salary = salary;
	}

	protected String name;
	
	protected Date birthDate;
	
	protected char sex;
	
	protected float salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		String out = "";
		if (name != null && !name.isEmpty()) {
			out += "Name: " + name;
		}
		if (birthDate != null) {
			out += "\nBirth date: " + birthDate;
		}
		if (sex > 0) {
			out += "\nSex: " + sex;
		}
		if (salary > 0) {
			out += "\nSalary: " + salary;
		}
		return out;
	}
}