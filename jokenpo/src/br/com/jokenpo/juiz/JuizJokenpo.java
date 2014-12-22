package br.com.jokenpo.juiz;

import static br.com.jokenpo.juiz.JuizJokenpo.Resultado.DERROTA;
import static br.com.jokenpo.juiz.JuizJokenpo.Resultado.EMPATE;
import static br.com.jokenpo.juiz.JuizJokenpo.Resultado.VITORIA;
import br.com.jogada.Jogada;

public class JuizJokenpo {
	
	private Jogada jogada;
	
	public enum Resultado {
		VITORIA,
		DERROTA,
		EMPATE
	}
	
	private JuizJokenpo(Jogada jogada) {
		this.jogada = jogada;
	}
	
	public static JuizJokenpo julga(Jogada jogada) {
		return new JuizJokenpo(jogada);
	}
	
	public Resultado vs(Jogada jogadaContra) {
		
		if(jogada.vence(jogadaContra))
			return VITORIA;
		else if(jogada.empata(jogadaContra))
			return EMPATE;
		
		return DERROTA;
	}
	
}
