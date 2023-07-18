package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
//	    String outro = new String("Alura"); //má prática, sempre prefira a sintaxe literal
		
		String novo = "Alura";
		
	    String novoReplace = novo.replace("A", "a");

	    System.out.println(novoReplace);
	    
	    String novoLowerCase = novo.toLowerCase();
	    String novoUpperCase = novo.toUpperCase();
	    
	    System.out.println(novoLowerCase);
	    System.out.println(novoUpperCase);
	    
	    String nome = "Mario"; //object literal
		
		System.out.println(nome);
	    
	    char c = nome.charAt(3); //char i
	    System.out.println(c);

	    int pos = nome.indexOf("rio");
	    System.out.println(pos);

	    String sub = nome.substring(1);
	    System.out.println(sub);
	    
	    for(int i = 0; i < nome.length(); i++) {
	        System.out.println(nome.charAt(i));
	    } 

	}

}
