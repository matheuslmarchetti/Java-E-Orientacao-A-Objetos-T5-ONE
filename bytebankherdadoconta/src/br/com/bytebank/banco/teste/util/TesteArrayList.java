package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Cliente marchetti = new Cliente();
		marchetti.setNome("Marchetti");
		
		Conta cc1 = new ContaCorrente(11, 11);
		cc1.setTitular(marchetti);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(11, 22);
		cc2.setTitular(marchetti);
		lista.add(cc2);
		
		System.out.println("Tamanho da lista de contas: " + lista.size());
		System.out.println("-----------------------------------");
		
		//Conta ref = (Conta) lista.get(0);
		Conta ref = lista.get(0);
		System.out.println("O número da conta é: " + ref.getNumero());
		System.out.println("-----------------------------------");
		
		lista.remove(0);
		System.out.println("Tamanho da lista de contas: " + lista.size());
		System.out.println("-----------------------------------");
		
		Conta cc3 = new ContaCorrente(11, 33);
		cc3.setTitular(marchetti);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(11, 44);
		cc4.setTitular(marchetti);
		lista.add(cc4);
		
		System.out.println("Tamanho da lista de contas: " + lista.size());
		System.out.println("-----------------------------------");
		
		
		for(int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("-----------------------------------");
		
		//for(Object oRef : lista) {
			//System.out.println(oRef);
		//}
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
	}

}
