package br.com.utils;

import java.util.List;

public class FizzBuzzCalculator {

	public static String calcula(int numero) {
		
		String resultado = "";
		
		if((numero % 3) == 0)
			resultado += "Fizz";
		
		if((numero % 5) == 0)
			resultado += "Buzz";

		return resultado.equals("") ? String.valueOf(numero) : resultado;
	}
	
	public static String calculaListaNumeros(List<Integer> listaNumeros) {
		
		StringBuilder resultado = new StringBuilder();
		
		for (Integer numero : listaNumeros) {
			if(listaNumeros.indexOf(numero) != 0)
				resultado.append("\n");
			
			resultado.append(calcula(numero));
		}
		
		return resultado.toString();
	}

}
