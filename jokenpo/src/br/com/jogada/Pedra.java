package br.com.jogada;

public class Pedra extends Jogada {

	@Override
	public boolean vence(Jogada jogada) {
		return jogada.isTesoura();
	}

	@Override
	public boolean empata(Jogada jogada) {
		return jogada.isPedra();
	}
	
	@Override
	public boolean isPedra() {
		return true;
	}

}
