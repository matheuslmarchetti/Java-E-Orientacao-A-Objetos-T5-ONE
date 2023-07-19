package br.com.bytebank.banco.teste.util;

import java.util.LinkedList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteLinkedList {

	public static void main(String[] args) {
		LinkedList<Conta> lista = new LinkedList<Conta>();
		
		Cliente marchetti = new Cliente();
		marchetti.setNome("Marchetti");
		
		Conta cc1 = new ContaCorrente(11, 11);
		cc1.setTitular(marchetti);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(11, 11);
		
		boolean existe = lista.contains(cc2);

	    System.out.println("Já existe? " + existe);
		
		for(Conta conta : lista){
	        System.out.println(conta);
	    }

	}

}
