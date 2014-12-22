package br.com.produtoEscalarVetores.tests;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import br.com.produtoEscalarVetores.ProdutoEscalarVetores;

public class ProdutoEscalarVetoresTest {
	
	/**
	Definimos dois vetores A e B de dimensão n em termos de componentes como:
	A = (a1, a2, a3, ..., an) e B = (b1, b2, b3, ..., bn)
	O produto escalar entre esses vetores é descrito como:
	A . B = a1 * b1 + a2 * b2 + a3 * b3 + ... + an * bn
	Desenvolva um programa que, dado dois vetores de dimensão n, retorne o produto escalar entre eles.
	 */
	
	@Test(expected = IllegalArgumentException.class)
	public void testaVetoresComNumeroDeElementosDiferente() {
		List<Integer> v1 = asList(1);
		List<Integer> v2 = asList(1, 2);
		
		ProdutoEscalarVetores.calculaProdutoEscalar(v1, v2);
	}

	@Test
	public void testaVetorComUmElemento() {
		List<Integer> v1 = asList(1);
		List<Integer> v2 = asList(1);
		
		assertEquals("Resultado deveria ser", 1, ProdutoEscalarVetores.calculaProdutoEscalar(v1, v2));
	}
	
	@Test
	public void testaVetorComVariosElementos() {
		// (1 * 1) + (2 * 2) + (3 * 3) + (4 * 4) + (5 * 5) + (6 * 6 ) + (7 * 7) + (8 * 8)
		
		List<Integer> v1 = asList(1, 2, 3, 4, 5, 6, 7, 8);
		List<Integer> v2 = asList(1, 2, 3, 4, 5, 6, 7, 8);
		
		assertEquals("Resultado deveria ser", 204, ProdutoEscalarVetores.calculaProdutoEscalar(v1, v2));
	}

}
