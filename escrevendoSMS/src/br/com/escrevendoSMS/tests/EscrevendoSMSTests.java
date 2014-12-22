package br.com.escrevendoSMS.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.escrevendoSMS.SMSController;

public class EscrevendoSMSTests {
	
	/**
	 * Um dos serviços mais utilizados pelos usuários de aparelhos celulares são
	 * os SMS (Short Message Service), que permite o envio de mensagens curtas
	 * (até 255 caracteres em redes GSM e 160 caracteres em redes CDMA). Para
	 * digitar uma mensagem em um aparelho que não possui um teclado QWERTY
	 * embutido é necessário fazer algumas combinações das 10 teclas numéricas
	 * do aparelho para conseguir digitar. Cada número é associado a um conjunto
	 * de letras como a seguir: 
	 * 
	 * Letras -> Número 
	 * ABC -> 2 
	 * DEF -> 3 
	 * GHI -> 4 
	 * JKL -> 5 
	 * MNO -> 6 
	 * PQRS -> 7 
	 * TUV -> 8 
	 * WXYZ -> 9 
	 * Espaço -> 0 
	 * 
	 * Desenvolva um programa que, dada uma mensagem de texto limitada a 255 caracteres,
	 * retorne a seqüência de números que precisa ser digitada. Uma pausa, para
	 * ser possível obter duas letras referenciadas pelo mesmo número, deve ser
	 * indicada como _.
	 */
	
	SMSController sms;
	
	@Before
	public void inicializa() {
		sms = new SMSController();
	}
	
	@Test
	public void testSimplesApenasUmCaractere() {
		assertEquals("A", sms.type("2"));
	}
	
	@Test
	public void testDigitaLetraB() {
		assertEquals("B", sms.type("22"));
	}
	
	@Test
	public void testDigitaLetraC() {
		assertEquals("C", sms.type("222"));
	}
	
	@Test
	public void testDigitaLetraAComQuatroComandos() {
		assertEquals("A", sms.type("2222"));
	}
	
	@Test
	public void testDuasLetrasDistintas() {
		assertEquals("AD", sms.type("23"));
	}
	
	@Test
	public void testMesmaLetraComEspacoDeTempo() {
		assertEquals("AA", sms.type("2_2"));
	}

	@Test
	public void testFraseCompleta() {
		String codigoEntrada = "77773367_7773302_222337777_777766606660366656667889999_9999555337777";
		assertEquals("SEMPRE ACESSO O DOJOPUZZLES", sms.type(codigoEntrada));
	}

}
