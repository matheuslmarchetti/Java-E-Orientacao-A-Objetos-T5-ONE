package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteToString {

	public static void main(String[] args) {
		
		Object marchetti = new Cliente();
		((Cliente) marchetti).setNome("Marchetti");
		
		Object cc = new ContaCorrente(22, 33);
		((Conta) cc).setTitular((Cliente) marchetti);
		
		Object cp = new ContaPoupanca(33, 22);
		((Conta) cp).setTitular((Cliente) marchetti);
		
		
		System.out.println(cc);
		System.out.println(cp);

	}

}
