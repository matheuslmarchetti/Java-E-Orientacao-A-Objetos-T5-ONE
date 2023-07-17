package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {
	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaEspecial ce = new ContaEspecial(333, 333);
		ce.deposita(300.00);
		
		ContaCorrente cc = new ContaCorrente(111,222);
		cc.deposita(100.00);
		
		ContaPoupanca cp = new ContaPoupanca(222,222);
		cp.deposita(200.00);
		
		cc.transfere(10.00,cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		System.out.println("CE: " + ce.getSaldo());
	}
}