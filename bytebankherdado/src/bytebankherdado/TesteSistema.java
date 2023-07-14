package bytebankherdado;

public class TesteSistema {

	public static void main(String[] args) {
				
		Autenticavel gerenteDoSistema = new Gerente();
		gerenteDoSistema.setSenha(2222);
		
		Autenticavel administradorDoSistema = new Administrador();
		administradorDoSistema.setSenha(2222);
		
		Autenticavel clienteDoSistema = new Cliente();
		clienteDoSistema.setSenha(222);
		
		SistemaInterno sistemaInternoAutentica = new SistemaInterno();
		sistemaInternoAutentica.autentica(gerenteDoSistema);
		sistemaInternoAutentica.autentica(administradorDoSistema);
		sistemaInternoAutentica.autentica(clienteDoSistema);
		
	}

}
