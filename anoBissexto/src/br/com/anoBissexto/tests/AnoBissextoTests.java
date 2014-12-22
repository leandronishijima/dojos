package br.com.anoBissexto.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import br.com.anoBissexto.AnoBissextoUtils;

public class AnoBissextoTests {
	
/**
	A cada 4 anos, a diferen�a de horas entre o ano solar e o do calend�rio convencional completa cerca de 24 horas 
	(mais exatamente: 23 horas, 15 minutos e 864 mil�simos de segundo). Para compensar essa diferen�a e evitar um 
	descompasso em rela��o �s esta��es do ano, insere-se um dia extra no calend�rio e o m�s de fevereiro fica com 29 dias. 
	Essa corre��o � especialmente importante para atividades atreladas �s esta��es, como a agricultura e at� mesmo as festas religiosas.
	Um determinado ano � bissexto se:
	O ano for divis�vel por 4, mas n�o divis�vel por 100, exceto se ele for tamb�m divis�vel por 400.
*/

	@Test
	public void validaAnoBissexto1600() {
		assertTrue("Ano 1600 deveria ser bissexto", AnoBissextoUtils.isAnoBissexto(1600));
	}
	
	@Test
	public void validaAnoBissexto1888() {
		assertTrue("Ano 1888 deveria ser bissexto", AnoBissextoUtils.isAnoBissexto(1888));
	}
	
	@Test
	public void validaAnoBissexto1944() {
		assertTrue("Ano 1944 deveria ser bissexto", AnoBissextoUtils.isAnoBissexto(1944));
	}
	
	@Test
	public void naoValidaAnoBissexto1742() {
		assertFalse("Ano 1742 deveria ser bissexto", AnoBissextoUtils.isAnoBissexto(1742));
	}
	
	@Test
	public void naoValidaAnoBissexto1889() {
		assertFalse("Ano 1889 deveria ser bissexto", AnoBissextoUtils.isAnoBissexto(1889));
	}

}
