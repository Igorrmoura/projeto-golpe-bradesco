package entities;

public class Usuario {
	
	private String name;
	private double CPF;
	
	

	public Usuario(String name, double cPF) {
		this.name = name;
		CPF = cPF;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getCPF() {
		return CPF;
	}


	public void setCPF(int cPF) {
		CPF = cPF;
	}


}
