package application;

import java.util.Scanner;

import entities.Cartao;
import entities.Usuario;

public class Sistema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Usuario user = new Usuario("lucas", 123);
		
		Cartao cart = new Cartao("lucas", 123, 200, 500, 100);
		
		System.out.print("defina o limite de compra para receber notifição: ");
		
		 
		
		System.out.println("seu limite de compra sem confirmação é: " + cart.getLimite());
		System.out.println();
		
		
		
		if ( cart.getCompra() >= cart.getLimite()) {
			System.out.println("compra negada limite atingido!");
		}
		else {
			System.out.println("compra aceita");
			 cart.result();
			
		}
		
		System.out.print("saldo da conta: " + cart.result() );
		
	}

}
