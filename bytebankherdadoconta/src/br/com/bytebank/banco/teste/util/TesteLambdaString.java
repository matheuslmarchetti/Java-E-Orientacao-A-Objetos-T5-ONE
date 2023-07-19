package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteLambdaString {

	public static void main(String[] args) {
		
		Cliente cc1Cliente = new Cliente();
		cc1Cliente.setNome("Marchetti");
		Conta cc1 = new ContaCorrente(22, 33);
		cc1.setTitular(cc1Cliente);
		cc1.deposita(333.0);
		
		Cliente cc2Cliente = new Cliente();
		cc2Cliente.setNome("Matheus");
		Conta cc2 = new ContaPoupanca(22, 44);
		cc2.setTitular(cc2Cliente);
		cc2.deposita(444.0);
		
		Cliente cc3Cliente = new Cliente();
		cc3Cliente.setNome("Nico");
		Conta cc3 = new ContaCorrente(22, 11);
		cc3.setTitular(cc3Cliente);
		cc3.deposita(111.0);
		
		Cliente cc4Cliente = new Cliente();
		cc4Cliente.setNome("José");
		Conta cc4 = new ContaPoupanca(22, 22);
		cc4.setTitular(cc4Cliente);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		System.out.println("----------------------------------------------------------------------");
		
		Comparator<Conta> comparator = (Conta c1, Conta c2) -> {
			String nomeC1 = c1.getTitular().getNome();
			String nomeC2 = c2.getTitular().getNome();
			return nomeC1.compareTo(nomeC2);
		};
		
		lista.sort(comparator);
		
		lista.forEach( (conta) -> System.out.println(conta) );
		
	}

}
