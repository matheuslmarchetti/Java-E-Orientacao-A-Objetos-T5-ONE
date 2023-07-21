package br.com.one.alura.live.conversordecomprimento.modelo;

import java.util.Scanner;

public class Conversor {
	
	public static void exibirMenu() {
		System.out.println("------------------------------------------");
		System.out.println("Bem-vindo(a) ao Conversor de Comprimento");
		System.out.println("Opção 1: Converte centímetros(cm) para metros(m)");
		System.out.println("Opção 2: Converte metros(m) para centímetros(cm)");
		System.out.println("Opção 9: Sair do Conversor de Comprimento");
		System.out.println("------------------------------------------");
		System.out.print("Digite uma opção válida: ");
	}
	
	public static void conversor(String unidadeOrigem, String unidadeDestino, double proporcao, Scanner entrada) {
		System.out.println("Ok, você escolheu: " + unidadeOrigem + " para " + unidadeDestino);
		System.out.print("Digite o valor a ser convertido: ");
		double valor = entrada.nextDouble();
		double valorFinal = valor * proporcao;
		System.out.println("O resultado é: " + valorFinal + " " + unidadeDestino);
	}
	
}
