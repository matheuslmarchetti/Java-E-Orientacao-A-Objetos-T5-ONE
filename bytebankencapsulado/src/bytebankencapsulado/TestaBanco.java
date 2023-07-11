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
		
		Conta contaDoMatheus = new Conta(123,4567);
		System.out.println(Conta.getTotal());

	}
}
