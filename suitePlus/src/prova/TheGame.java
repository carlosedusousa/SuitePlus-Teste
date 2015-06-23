/*
Tesouras de papel da rocha é um clássico jogo de 2 jogadores. 
Cada jogador escolhe pedra, papel ou tesoura. Os resultados possíveis:
Rocha destrói tesoura.
Tesouras cortou o papel.
Papel abrange rock.
O nosso código vai quebrar o jogo em 3 fases:
um. Usuário faz uma escolha
b. Computador faz uma escolha
c. A função de comparação vai determinar quem ganha
 */

package prova;

public class TheGame {

	public static void main(String[] args) throws Exception {

		System.out.println(JoKenPo.jogar(JoKenPo.escolhaDoJogador(),
				JoKenPo.escolhaDoComputador()));

	}
}
