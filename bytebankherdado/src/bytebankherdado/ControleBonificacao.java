package bytebankherdado;

public class ControleBonificacao {
	private double soma;
	
	public double getSoma() {
		return this.soma;
	}
	
	public void registra(Funcionario funcionarioParaRegistro) {
		double bonificacao = funcionarioParaRegistro.getBonificacao();
		this.soma = this.soma + bonificacao;
	}
}
