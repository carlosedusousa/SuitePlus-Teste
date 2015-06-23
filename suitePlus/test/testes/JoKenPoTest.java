package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import prova.JoKenPo;

public class JoKenPoTest {
	@Test
	public void pedra() throws Exception {
		assertEquals("empate", JoKenPo.jogar("pedra", "pedra"));
		assertEquals("vitória do jogador", JoKenPo.jogar("pedra", "tesoura"));
		assertEquals("vitória do computador", JoKenPo.jogar("pedra", "papel"));
	}

	@Test
	public void tesoura() throws Exception {
		assertEquals("empate", JoKenPo.jogar("tesoura", "tesoura"));
		assertEquals("vitória do jogador", JoKenPo.jogar("tesoura", "papel"));
		assertEquals("vitória do computador", JoKenPo.jogar("tesoura", "pedra"));
	}

	@Test
	public void papel() throws Exception {
		assertEquals("empate", JoKenPo.jogar("papel", "papel"));
		assertEquals("vitória do jogador", JoKenPo.jogar("papel", "pedra"));
		assertEquals("vitória do computador", JoKenPo.jogar("papel", "tesoura"));
	}

	@Test(expected = Exception.class)
	public void erroTodos() throws Exception {
		JoKenPo.jogar("garfo", "faca");
	}

	@Test(expected = Exception.class)
	public void erroVc() throws Exception {
		JoKenPo.jogar("tesoura", "vaca");
	}

	@Test(expected = Exception.class)
	public void erroEu() throws Exception {
		JoKenPo.jogar("aviao", "papel");
	}
		
}
