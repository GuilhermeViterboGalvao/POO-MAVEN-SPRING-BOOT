package br.curso.poo.json;

import java.util.ArrayList;
import java.util.List;

public class Car {

	public Car() {
		passengers = new ArrayList<Passenger>();
	}
	
	private String name;
	
	private List<Passenger> passengers;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}
}