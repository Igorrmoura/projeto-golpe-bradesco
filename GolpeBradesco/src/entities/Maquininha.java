package entities;


public class Maquininha extends Cartao {

	private double compra;
	
	public double getCompra() {
		return compra;
	}


	public void setCompra(double compra) {
		this.compra = compra;
	}
	
	
	public double saldoConta () {
		return saldo - compra;
  }
}
