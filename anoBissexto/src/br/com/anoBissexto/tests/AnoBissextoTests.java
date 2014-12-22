package br.com.anoBissexto.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import br.com.anoBissexto.AnoBissextoUtils;

public class AnoBissextoTests {
	
/**
	A cada 4 anos, a diferença de horas entre o ano solar e o do calendário convencional completa cerca de 24 horas 
	(mais exatamente: 23 horas, 15 minutos e 864 milésimos de segundo). Para compensar essa diferença e evitar um 
	descompasso em relação às estações do ano, insere-se um dia extra no calendário e o mês de fevereiro fica com 29 dias. 
	Essa correção é especialmente importante para atividades atreladas às estações, como a agricultura e até mesmo as festas religiosas.
	Um determinado ano é bissexto se:
	O ano for divisível por 4, mas não divisível por 100, exceto se ele for também divisível por 400.
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
