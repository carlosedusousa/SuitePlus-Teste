package prova;

import java.util.Scanner;

// Classe
public class Frog {
	/*
	 * NOTA 
	 * Tentei entender o problema e no primeiro momento entendi como
	 * solucao aplicar combinacoes simples e o código foi escrito abaixo com os
	 * resultados testados. Para calcular as combinacoes de fatoriais das
	 * combinacoes possiveis de passos de 1 polegada e de saltos de 2 polegadas
	 * foi feito a divisao da distancia a percorrer por 2 e consequentemente
	 * teremos como calcular o fatorial das combinacoes com permutacoes dos
	 * valores
	 * 
	 * Ex Se a distancia a percorrer eh 3 polegadas, as combinacoes de passos e
	 * saltos sao:
	 * 
	 * passo + passo + passo ou 1 + 1 + 1 (polegadas), poré cada salto deve ser
	 * alternado(permutação) para ver isso só trocar por A + B + C que pode ser
	 * trocado por B + A + C por exemplo
	 * 
	 * salto + passo é outra possibilidade assim como passo + salto assim com
	 * para A+B e B+A e assim por diante
	 * 
	 * Porém para os resultados reais que o problema requer, vi que
	 * Para fazer permutacao composta de elementos iguais teremos que validar
	 * duas formulas Como exemplo de 3 polegadas teremos então 3 TRES
	 * combinacoes e não 8 OITO pela permutacao simples
	 * 
	 * Porém para distancia como 6 ou 9 por exemplo, teremos que relizar a
	 * permutacao de dois elementos repetidos e em quantidades iguais de número
	 * 
	 * ex: passo a passo 
	 * 1+1+1+1+1+1 = 6 > 1 possibilidade 1 P(6,6) =1
	 * 
	 * 2+1+1+1+1 = 6 > 1 possibilidade 2 .......... 
	 * 1+2+1+1+1 = 6 > 1 possibilidade 3 .......... 
	 * 1+1+2+1+1 = 6 > 1 possibilidade 4 ..........
	 * 1+1+1+2+1 = 6 > 1 possibilidade 5 .......... 
	 * 1+1+1+1+2 = 6 > 1 possibilidade 6 .......... 
	 * nesse caso a permutação de 4 elementos iguais
	 * fica P(5posicoes,4elementos iguais)=5
	 * 
	 * porém aqui começa a combinacao de elementos duplicados e deve-se aplicar
	 * outra fórmula
	 * 
	 * temos dois elementos saltos e dois passos como exemplo 2 e 1 polegadas totalizando 6 ao final
	 * segue:
	 * 2+2+1+1 = 6 > 1 possibilidade 7 
	 * 2+1+2+1 = 6 > 1 possibilidade 8 
	 * 2+1+1+2 = 6 > 1 possibilidade 9 
	 * 1+2+1+2 = 6 > 1 possibilidade 10 
	 * 1+1+2+2 = 6 > 1 possibilidade 11
	 * 
	 * E finalizando 2+2+2 = 6 > 1 possibilidade 12 P(3,3)=1
	 * 
	 * Eis a questão.. após tentar pensar na solução sem exito pesquisei possível 
	 * lógicas para a solução, e uma delas seria permutação com elementos repetidos 
	 * porém aqui aplicando a o calculo para o mesmo exemplo descrito acima os resultados seriam:
	 * 
	 *1: 111111  P(6,6) = 1 possibilidade OK
	 * 
	 *2: 21111   p(5,4) = 5 possibilidades OK 
	 *3: 12111
	 *4: 11211
	 *5: 11121
	 *6: 11112
	 * 
	 * PARA (2+2+1+1 = 6) NÃO SE APLICA POIS HÁ APENAS 5 RESULTADOS POSSÍVEIS
	 *7:  2211   p (4!,2!) (4*3)/(2*1) = 12/2 = 6 o fatorial devolve 6 
	 *8:  2121   mas no "teste de mesa" ao lado temos 5 possibilidades....
	 *9:  2112
	 *10: 1212
	 *11: 1122 
	 * 
	 * e 
	 *12: 222
	 * exatamente 12 possibilidades
	 *  
	 * o mesmo problema seria que distancia de 7 polegadas 
	 * 
	 * Não resolvendo com Permutação e combinações ainda encontrei 
	 * solucoes tentando com série Fibonacci
	 * 
	 * f[0] = 0;
	 * f[1] = 1;
	 * f[2] = 1;
	 * f[3] = 2;
	 * f[4] = 3 
	 * f[5] = 5;
	 * f[6] = 8;
	 * f[7] = 13 

	 AQUI PARA O EXERCICIO ONDE O FROG TEM QUE TER X COMBINACOES PARA 7 POLEGADAS 
	 NA VERDADE HÁ 12 COMO EXPLICADO ACIMA...OU SEJA, NÃO SE APLICA FIBONACCI POIS 
	 HÁ APENAS 12 POSSIBILIDADES COMO COMPROVADO NO TESTE DE MESA E NÃO 13 COMO 
	 SERIA COM FIBONACCI.

 
SE ESSE PROBLEMA UTILIZARIA COMBINAÇÕES E PERMUTAÇÕES 
OU ATÉ MESMO FIBONACCI NÃO ENCONTREI NENHUMA SOLUÇÃO EFETIVA NA INTERNET
MESMO DEPOIS DE TENTAR RESOLVER SEM PESQUISAR 
 
 Resumo, tentei e não resolvei, pesquisei e não encontrei ninguém que soluciona-se. 
 achei fonts que não resolvem com exatidão 
 não encontrei nenhuma resposta plausivel também no stackoverflow. 
 
 QUAL A RESPOSTA????  
 
	 *  
	 * 
	 */
	public static void main(String[] args) {

		/* 
		 		 * */
		int dividendo = 0;
		int cociente = 0;
		int somaFatorialTotal = 0;
		int somaFatorialSemCombinacao = 0;

		Scanner s = new Scanner(System.in);

		System.out.print("Digite a distancia a ser percorrida: ");// 3
		dividendo = s.nextInt();

		System.out.println("Dividendo " + dividendo);

		cociente = dividendo / 2;
		System.out.println("Cociente " + cociente);

		if (dividendo % 2 == 0) {
			cociente = cociente - 1;
		}

		//
		for (int x = dividendo; x > cociente; x--) {

			somaFatorialTotal += fatorial(x);
			somaFatorialSemCombinacao += fatorial(x - 1);

		}

		System.out.println("Soma dos Fatoriais " + somaFatorialTotal);
		System.out.println("Soma SEM dos Fatoriais "
				+ somaFatorialSemCombinacao);

		s.close();
	}

	// Valida fatorial
	private static int fatorial(int valor) {

		// resultado recebe o maior valor e a cada iteracao calcula o fatorial
		// seguinte Ex: 4! 3! 2! ...
		int resultado = valor;
		for (int x = valor - 1; x > 0; x--) {
			// resultado recebe a soma dos fatoriais.
			resultado *= x;
		}
		return resultado;
	}

}
