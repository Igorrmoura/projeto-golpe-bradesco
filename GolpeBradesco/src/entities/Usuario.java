package entities;

public class Usuario {
	
	private String login;
	private int senha;
	protected double saldo = 1000;
	


	public Usuario() {
		
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public int getSenha() {
		return senha;
	}


	public void setSenha(int senha) {
		this.senha = senha;
	}


	public double getSaldo() {
		return saldo;
	}

		
}



