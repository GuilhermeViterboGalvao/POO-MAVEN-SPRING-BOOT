package br.curso.poo.rh;

import java.util.ArrayList;
import java.util.List;

public class Analyzer extends Programmer {
	
	public Analyzer() {
		team = new ArrayList<Programmer>();
	}

	private List<Programmer> team;

	public List<Programmer> getTeam() {
		return team;
	}

	public void setTeam(List<Programmer> team) {
		this.team = team;
	}
	
	@Override
	public String toString() {
		String out = "My informations:\n";
		out += super.toString();
		if (team != null && !team.isEmpty()) {
			out += "\n\n\n";
			out += "My team informations:\n";			
			for (Programmer programmer : team) {
				out += programmer + "\n\n\n";
			}	
		}
		return out;
	}
}