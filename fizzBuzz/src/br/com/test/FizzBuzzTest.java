package br.com.test;

import static br.com.utils.FizzBuzzCalculator.calcula;
import static br.com.utils.FizzBuzzCalculator.calculaListaNumeros;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FizzBuzzTest {
	
	/**
	 * 	FizzBuzz
		Neste problema, voc� dever� exibir uma lista de 1 a 100, um em cada linha, com as seguintes exce��es:
		N�meros divis�veis por 3 deve aparecer como 'Fizz' ao inv�s do n�mero;
		N�meros divis�veis por 5 devem aparecer como 'Buzz' ao inv�s do n�mero;
		N�meros divis�veis por 3 e 5 devem aparecer como 'FizzBuzz' ao inv�s do n�mero'.
	 */

	@Test
	public void retornaFizzParaMultiploDeTres() {
		
		assertEquals("Multiplo de 3 deve-se retornar 'Fizz'", "Fizz", calcula(3));
		
	}
	
	@Test
	public void retornaBuzzParaMultiploDeCinco() {
		
		assertEquals("Multiplo de 5 deve-se retornar 'Buzz'", "Buzz", calcula(5));
		
	}
	
	@Test
	public void retornaProprioNumeroParaCasoDeNaoMultiploDeTresOuCinco() {
		
		assertEquals("N�mero n�o m�ltiplo de 3 e 5, retorna-se o pr�prio n�mero", "2", calcula(2));
		
	}
	
	@Test
	public void retornaUmParaCasoNumero1() {
		
		assertEquals("N�mero n�o m�ltiplo de 3 e 5, retorna-se o pr�prio n�mero", "1", calcula(1));
		
	}
	
	@Test
	public void retornaFizzBuzzParaNumeroMultiploDeTresECinco() {
		
		assertEquals("N�mero m�ltiplo de 3 e 5, retorna-se FizzBuzz", "FizzBuzz", calcula(15));
		
	}
	
	@Test
	public void retornaFizzBuzzParaSequenciaTresCinco() {
		
		List<Integer> listaNumeros = Arrays.asList(3, 5);
		
		assertEquals("Sequ�ncia 3 e 5, deve-se retornar Fizz e Buzz", "Fizz\nBuzz", calculaListaNumeros(listaNumeros));
		
	}
	
	@Test
	public void retornaNumeroFizzBuzzParaSequenciaUmTresCinco() {
		
		List<Integer> listaNumeros = Arrays.asList(1, 3, 5);
		
		assertEquals("Sequ�ncia 1, 3 e 5, deve-se retornar 1, Fizz e Buzz", "1\nFizz\nBuzz", calculaListaNumeros(listaNumeros));
		
	}
	
}
