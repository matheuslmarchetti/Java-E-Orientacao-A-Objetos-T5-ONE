package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorDeReferencias {

	public static void main(String[] args) {
		
		GuardadorDeReferencias guardadorDeReferencias = new GuardadorDeReferencias();
		
		Conta cc = new ContaCorrente(44, 55);
		guardadorDeReferencias.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(44, 66);
		guardadorDeReferencias.adiciona(cc2);
		
		int tamanho = guardadorDeReferencias.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = (Conta) guardadorDeReferencias.getReferencia(1);
		System.out.println(ref.getNumero());
		
	}

}
