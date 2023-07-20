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
				
				break;
			case 2:
				
				break;
			case 3:
	
				break;

			default:
				System.out.println("Digite uma opção válida!");
				break;
			}
		}

	}

}
