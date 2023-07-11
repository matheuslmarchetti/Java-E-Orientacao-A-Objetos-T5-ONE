package bytebankencapsulado;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		paulo.setCpf("222.222.222.-22");
		paulo.setProfissao("programador");

		Conta contaDoPaulo = new Conta(123,456);
		System.out.println(Conta.getTotal());
		contaDoPaulo.deposita(100);

		contaDoPaulo.setTitular(paulo);
		System.out.println(contaDoPaulo.getTitular().getNome());
		System.out.println(contaDoPaulo.getTitular());
		
		Cliente matheus = new Cliente();
		matheus.setNome("Matheus Marchetti");
		matheus.setCpf("244.244.555.-22");
		matheus.setProfissao("desenvolvedor");
		
		Conta contaDoMatheus = new Conta(123,4567);
		System.out.println(Conta.getTotal());
		contaDoMatheus.deposita(100);

		contaDoMatheus.setTitular(matheus);
		System.out.println(contaDoMatheus.getTitular().getNome());
		System.out.println(contaDoMatheus.getTitular());

	}
}
