package application;

import java.util.Scanner;

import entities.Cartao;
import entities.Usuario;

public class Sistema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Usuario user = new Usuario();
		Cartao cart = new Cartao();
		
		System.out.print("insira seu login: ");
		user.setLogin(sc.next());
		System.out.println();
		System.out.print("insira sua senha: ");
		user.setSenha(sc.nextInt());
				
		
		System.out.println("seu login: " + user.getLogin() + ", " + "senha: " + user.getSenha());
		
	}

}
