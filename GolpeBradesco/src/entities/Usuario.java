package entities;

public class Usuario {
	
	private String name;
	private double CPF;
	private double saldo = 500;
	

	public Usuario(String name, double cPF, double saldo) {
		this.name = name;
		CPF = cPF;
		this.saldo = saldo;
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


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	


}
