package br.com.anoBissexto;

public class AnoBissextoUtils {

	public static boolean isAnoBissexto(int ano) {
		boolean isDivisivelPorQuatro = (ano % 4) == 0;
		boolean isDivisivelPorCem = (ano % 100) == 0;
		boolean isDivisivelPorQuatrocentos = (ano % 400) == 0;
		
		if(isDivisivelPorQuatro)
			return (isDivisivelPorCem && isDivisivelPorQuatrocentos) || (!isDivisivelPorCem && !isDivisivelPorQuatrocentos);
			
		return false;
	}

}
