package bytebank;

public class TestaMetodos {
	public static void main(String[] args) {
		Conta contaDoMatheus = new Conta();
		contaDoMatheus.deposita(100);
		System.out.println(contaDoMatheus.saldo);
		contaDoMatheus.saca(10);
		System.out.println(contaDoMatheus.saldo);
		
		Conta contaMarcela = new Conta();
		
		boolean sucessoTransferencia = contaDoMatheus.transfere(100, contaMarcela);
		
		if(sucessoTransferencia) {
			System.out.println("Transferência realizada com sucesso!");
		} else {
			System.out.println("Transferência não realizada: Saldo insuficiente!");
		}
		
		System.out.println(contaDoMatheus.saldo);
		System.out.println(contaMarcela.saldo);
	}
}
