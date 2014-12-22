package br.com.jogada;

public abstract class Jogada {
	
	public abstract boolean vence(Jogada jogada);
	public abstract boolean empata(Jogada jogada);
	
	public static Pedra jogadaPedra() {
		return new Pedra();
	}
	
	public static Tesoura jogadaTesoura() {
		return new Tesoura();
	}
	
	public static Papel jogadaPapel() {
		return new Papel();
	}
	
	public boolean isPedra() {
		return false;
	}
	
	public boolean isTesoura() {
		return false;
	}
	
	public boolean isPapel() {
		return false;
	}
	
}
