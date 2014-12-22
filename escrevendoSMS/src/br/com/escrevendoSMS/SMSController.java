package br.com.escrevendoSMS;

import static java.util.Arrays.asList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SMSController {
	
	private static Map<Character, List<String>> dicionarioLetras = new HashMap<Character, List<String>>();
	
	public SMSController() {
		dicionarioLetras.put('0', asList(" "));
		dicionarioLetras.put('2', asList("A", "B", "C"));
		dicionarioLetras.put('3', asList("D", "E", "F"));
		dicionarioLetras.put('4', asList("G", "H", "I"));
		dicionarioLetras.put('5', asList("J", "K", "L"));
		dicionarioLetras.put('6', asList("M", "N", "O"));
		dicionarioLetras.put('7', asList("P", "Q", "R", "S"));
		dicionarioLetras.put('8', asList("T", "U", "V"));
		dicionarioLetras.put('9', asList("W", "X", "Y", "Z"));
	}
	
	public String type(String codigoNumericoEntrada) {
		
		StringBuilder saida = new StringBuilder();
		
		Character charAtual = new Character(' ');
		Character charAnterior = new Character(' ');
		int contador = 0;
		
		for (int i = 0; i < codigoNumericoEntrada.length(); i++) {
			charAtual = codigoNumericoEntrada.charAt(i);
			
			if(charAnterior.equals(' ') || charAtual.equals(charAnterior)) {
				contador++;
			} else if(charAtual.equals(new Character('_')) || !charAtual.equals(charAnterior)) {
				saida.append(getLetraDicionario(charAnterior, contador));
				contador = 0;
			}
			
			charAnterior = charAtual;
		}
		
		saida.append(getLetraDicionario(charAtual, contador));
		
		return saida.toString();
	}
	
	private String getLetraDicionario(Character key, int index) {
		if(key.equals('_'))
			return "";
		
		List<String> possiveisLetras = dicionarioLetras.get(key);
		
		if(index > possiveisLetras.size())
			return possiveisLetras.get((index % possiveisLetras.size()) - 1);
		
		if(index == 0)
			return possiveisLetras.get(index);
		else 
			return possiveisLetras.get(index - 1);
	}
	
}
