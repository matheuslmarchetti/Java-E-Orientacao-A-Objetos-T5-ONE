package br.com.one.alura.live.conversordecomprimento.teste;

import java.util.Scanner;

import br.com.one.alura.live.conversordecomprimento.modelo.Conversor;

public class TesteConversorTerminal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int input = 0;
		
		while (input != 9) { //input é diferente de 9
			Conversor.exibirMenu();
			input = entrada.nextInt();
			
			switch (input) {
			case 1:
				Conversor.conversor("centímetros(cm)", "metros(m)", 0.01, entrada);
				break;
			case 2:
				Conversor.conversor("metros(m)", "centímetros(cm)", 100, entrada);
				break;
			case 9:
				System.out.println("Saindo do programa....");
				break;
			default:
				System.out.println("------------------------------------------");
				System.out.println("Digite uma opção válida!");
				break;
			}
		}
		System.out.println();
		entrada.close();
	}

}
