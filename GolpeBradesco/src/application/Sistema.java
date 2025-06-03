package application;

import java.util.Scanner;

import entities.Cartao;
import entities.Usuario;
import entities.Maquininha;

public class Sistema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Usuario user = new Usuario();
		Cartao cart = new Cartao();
		Maquininha maq = new Maquininha();

		System.out.print("insira seu login: ");
		user.setLogin(sc.next());
		System.out.println();
		System.out.print("insira sua senha: ");
		user.setSenha(sc.nextInt());

		if (user.getLogin().equals("joao@gmail") && user.getSenha() == 123) {
			System.out.println("acesso permitido");
			System.out.println();
			System.out.print("defina seu limite para compras pela maquininha: ");
			cart.setLimite(sc.nextInt());

			System.out.print("valor da compra: ");
			maq.setCompra(sc.nextDouble());

			if (maq.getCompra() >= cart.getLimite()) {
				System.out.println("compra atingiu valor superior ao limite definido");
				System.out.println();
				System.out.print("deseja confirmar a compra no valor de " + maq.getCompra() + " (y/n) ");
				char response = sc.next().charAt(0);

				if (response == 'y') {
					System.out.println("compra aceita, saldo da conta atual = " + maq.saldoConta());
				}

				else {
					System.out.println("compra negada, saldo atual da conta " + user.getSaldo());
				}

			} else {
				System.out.println("compra aceita");
			}

		} else {
			System.out.println("acesso negado");
		}

		sc.close();

	}

}
