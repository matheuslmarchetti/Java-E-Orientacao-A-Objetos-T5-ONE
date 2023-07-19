package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {

	private Object[] referenciasObject;
	private int posicaoLivreObject;
	
	public GuardadorDeReferencias() {
		this.referenciasObject = new Object[10];
		this.posicaoLivreObject = 0;
	}
		
	public void adiciona(Object ref) {
		this.referenciasObject[this.posicaoLivreObject] = ref;
		this.posicaoLivreObject++;
	}
	
	public int getQuantidadeDeElementos() {
		return this.posicaoLivreObject;
	}
	
	public Object getReferencia(int pos) {
		return this.referenciasObject[pos];
	}
	
}
