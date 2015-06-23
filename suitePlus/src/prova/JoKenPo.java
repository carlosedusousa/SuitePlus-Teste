package prova;

import java.util.Random;
import java.util.Scanner;

public class JoKenPo {

	private static Scanner scanner = new Scanner(System.in);
	private static String escolhaDoJogador;

	public static String escolhaDoJogador() {
		System.out
				.println("Informe a sua escolha: : Papel/papel, Pedra/pedra, Tesoura/tesoura:");
		escolhaDoJogador = scanner.next();

		while (!escolhaDoJogador.equalsIgnoreCase("papel")
				&& !escolhaDoJogador.equalsIgnoreCase("tesoura")
				&& !escolhaDoJogador.equalsIgnoreCase("pedra")) {
			System.out
					.println("Opção Inválida: Escreva Novamente: Papel/papel, Pedra/pedra, Tesoura/tesoura:");
			escolhaDoJogador = scanner.next();
		}

		switch (escolhaDoJogador.toLowerCase()) {
		case "papel":
			System.out.println("Sua escolha foi - Papel");
			break;
		case "pedra":
			System.out.println("Sua escolha foi - Pedra");
			break;
		case "tesoura":
			System.out.println("Sua escolha foi - Tesoura");
			break;
		}

		return escolhaDoJogador.toLowerCase();

	}

	public static String escolhaDoComputador() {
		Random gerador = new Random();
		int numeroAleatorio = gerador.nextInt(3) + 1;
		String escolha = null;

		switch (numeroAleatorio) {
		case 1:
			System.out.println("A escolha do computador foi - Papel");
			escolha = "papel";
			break;
		case 2:
			System.out.println("A escolha do computador foi - Pedra");
			escolha = "pedra";
			break;
		case 3:
			System.out.println("A escolha do computador foi - Tesoura");
			escolha = "tesoura";
			break;
		}
		return escolha;
	}

	public static String jogar(String eu, String vc) throws Exception {
		if (!(eu.equals("pedra") || eu.equals("papel") || eu.equals("tesoura"))
				|| !(vc.equals("pedra") || vc.equals("papel") || vc
						.equals("tesoura"))) {
			throw new Exception("Erro nas alternativas");
		}

		if (eu.equals("pedra")) {
			if (vc.equals("tesoura")) {
				return imprime("jogador");
			}

			if (vc.equals("papel")) {
				return imprime("computador");
			}
		}

		if (eu.equals("tesoura")) {
			if (vc.equals("papel")) {
				return imprime("jogador");
			}

			if (vc.equals("pedra")) {
				return imprime("computador");
			}
		}

		if (eu.equals("papel")) {
			if (vc.equals("pedra")) {
				return imprime("jogador");
			}

			if (vc.equals("tesoura")) {
				return imprime("computador");
			}
		}

		return "empate";
	}

	public static String imprime(String r) {
		return (r.equalsIgnoreCase("jogador") ? "vitória do jogador"
				: "vitória do computador");
	}
}