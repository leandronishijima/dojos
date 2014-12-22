package br.com.jokenpo.test;

import static br.com.jogada.Jogada.jogadaPapel;
import static br.com.jogada.Jogada.jogadaPedra;
import static br.com.jogada.Jogada.jogadaTesoura;
import static br.com.jokenpo.juiz.JuizJokenpo.julga;
import static br.com.jokenpo.juiz.JuizJokenpo.Resultado.EMPATE;
import static br.com.jokenpo.juiz.JuizJokenpo.Resultado.VITORIA;
import static br.com.jokenpo.juiz.JuizJokenpo.Resultado.DERROTA;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JokenpoTest {
	
	/**
	 *
		Jokenpo é uma brincadeira japonesa, onde dois jogadores escolhem um dentre três possíveis itens: Pedra, Papel ou Tesoura.
		O objetivo é fazer um juiz de Jokenpo que dada a jogada dos dois jogadores informa o resultado da partida.
		As regras são as seguintes:
		Pedra empata com Pedra e ganha de Tesoura
		Tesoura empata com Tesoura e ganha de Papel
		Papel empata com Papel e ganha de Pedra
		
	 */
	
	@Test
	public void testPedraGanhaTesoura() {
		assertEquals("Pedra ganha de tesoura", VITORIA, julga(jogadaPedra()).vs(jogadaTesoura()));
	}
	
	@Test
	public void testPedraEmpataPedra() {
		assertEquals("Pedra empata com pedra", EMPATE, julga(jogadaPedra()).vs(jogadaPedra()));
	}
	
	@Test
	public void testPedraPerdePapel() {
		assertEquals("Pedra perde papel", DERROTA, julga(jogadaPedra()).vs(jogadaPapel()));
	}
	
	@Test
	public void testTesouraGanhaPapel() {
		assertEquals("Tesoura ganha de papel", VITORIA, julga(jogadaTesoura()).vs(jogadaPapel()));
	}

}
