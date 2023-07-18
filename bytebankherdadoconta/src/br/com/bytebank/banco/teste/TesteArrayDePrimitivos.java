package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {
		
		int[] idades = new int[5];
		
		idades[0] = 29;
		idades[1] = 39;
		idades[2] = 49;
		idades[3] = 59;
		idades[4] = 69;
		
		int idade4 = idades[3];
		
		System.out.println("A idade na quarta posição é: " + idade4 + " anos.");
		System.out.println("O array idades possui um total de " + idades.length + " posições.");
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
			System.out.println("A multiplicação da posição do array por ele mesmo é: " + idades[i]);
		}
			
	}

}
