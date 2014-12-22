package br.com.produtoEscalarVetores;

import java.util.List;

public class ProdutoEscalarVetores {

	public static int calculaProdutoEscalar(List<Integer> vetor1, List<Integer> vetor2) {
		if(vetor1.size() != vetor2.size())
			throw new IllegalArgumentException();
		
		int produtoEscalar = 0;
		
		for (int i = 0; i < vetor1.size(); i++)
			produtoEscalar += vetor1.get(i) * vetor2.get(i);
		
		return produtoEscalar;
	}

}
