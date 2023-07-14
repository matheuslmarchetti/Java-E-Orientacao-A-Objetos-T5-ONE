package bytebankherdado;

public class Administrador extends Funcionario implements Autenticavel {
		
	@Override
	public double getBonificacao() {
		return 500;
	}
		
	private AutenticacaoUtil autenticador;
	
	public Administrador() {
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
