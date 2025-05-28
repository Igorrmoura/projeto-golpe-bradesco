package application;

import java.util.Scanner;
import entities.Usuario;

public class Sistema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Usuario user = new Usuario("lucas", 123, 500);
		
		System.out.print("defina o limite de compra para receber notifição: ");
		
		int limite = sc.nextInt();
		
		System.out.println("seu limite de compra sem confirmação é: " + limite);
		System.out.println();
		
		int compra = 200;
		double result = 0;
		
		if (compra >= limite) {
			System.out.println("compra negada limite atingido!");
		}
		else {
			System.out.println("compra aceita");
			 result = user.getSaldo() - compra;
			
		}
		
		System.out.print("saldo da conta: " + result);
		
	}

}
