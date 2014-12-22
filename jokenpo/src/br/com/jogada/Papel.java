package br.com.jogada;

public class Papel extends Jogada {

	@Override
	public boolean vence(Jogada jogada) {
		return jogada.isPedra();
	}

	@Override
	public boolean empata(Jogada jogada) {
		return jogada.isPapel();
	}
	
	@Override
	public boolean isPapel() {
		return true;
	}

}
