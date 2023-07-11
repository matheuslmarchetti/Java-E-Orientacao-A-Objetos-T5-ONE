package bytebankherdado;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente matheusGerente = new Gerente();
		matheusGerente.setNome("Marchetti");
		matheusGerente.setCpf("0003330007");
		matheusGerente.setSalario(5000.00);
		
		System.out.println(matheusGerente.getNome());
		System.out.println(matheusGerente.getCpf());
		System.out.println(matheusGerente.getSalario());
		
		matheusGerente.setSenha(777);
		boolean autenticou = matheusGerente.autentica(777);
		
		System.out.println(autenticou);
		
		System.out.println(matheusGerente.getBonificacao());
	}

}
