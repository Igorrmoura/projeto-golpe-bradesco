package entities;

public class Cartao extends Usuario {
	
	private int limite;
	private double saldo;
	private double compra;



	
	public int getLimite() {
		return limite;
	}


	public void setLimite(int limite) {
		this.limite = limite;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public double getCompra() {
		return compra;
	}



	public void setCompra(double compra) {
		this.compra = compra;
	}



	public double result() {
		return saldo - compra;
	}
	
}
