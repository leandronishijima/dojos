package br.com.jogada;

public class Tesoura extends Jogada {

	@Override
	public boolean vence(Jogada jogada) {
		return jogada.isPapel();
	}

	@Override
	public boolean empata(Jogada jogada) {
		return jogada.isTesoura();
	}
	
	@Override
	public boolean isTesoura() {
		return true;
	}

}
