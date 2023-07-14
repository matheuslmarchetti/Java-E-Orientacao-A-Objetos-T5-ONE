package bytebankherdado;

public class Gerente extends Funcionario implements Autenticavel {
		
	public double getBonificacao() {
		return getSalario() * 0.1;
	}
		
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
}
