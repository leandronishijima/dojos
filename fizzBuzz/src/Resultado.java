import java.util.ArrayList;
import java.util.List;

import br.com.utils.FizzBuzzCalculator;


public class Resultado {
	
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>();
		
		for (int i = 1; i <= 100; i++)
			numeros.add(i);
		
		System.out.println(FizzBuzzCalculator.calculaListaNumeros(numeros));
	}

}
