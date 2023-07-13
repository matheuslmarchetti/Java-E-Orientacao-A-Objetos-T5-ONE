package bytebankherdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario matheus = new Gerente();
		matheus.setNome("Matheus Marchetti");
		matheus.setCpf("555555555-8");
		matheus.setSalario(2700.00);
		
		System.out.println(matheus.getNome());
		System.out.println(matheus.getBonificacao());

	}

}
