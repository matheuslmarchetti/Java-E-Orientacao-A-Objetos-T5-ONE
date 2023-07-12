package bytebankherdado;

public class TesteReferencias {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("Matheus");
		gerente.setSalario(5000);
		
		EditorVideo editorVideo = new EditorVideo();
		editorVideo.setNome("Marcos");
		editorVideo.setSalario(2500);
		
		Designer designer = new Designer();
		designer.setNome("Marcelo");
		designer.setSalario(2000);
		
		ControleBonificacao controleBonificacao = new ControleBonificacao();
		controleBonificacao.registra(gerente);
		System.out.println("A bonificação de " + gerente.getNome() + ", gerente é: " + gerente.getBonificacao());
		controleBonificacao.registra(editorVideo);
		System.out.println("A bonificação de " + editorVideo.getNome() + ", editor de vídeo é: " + editorVideo.getBonificacao());
		controleBonificacao.registra(designer);
		System.out.println("A bonificação de " + designer.getNome() + ", designer é: " + designer.getBonificacao());
		
		System.out.println("A soma das bonificações é: " + controleBonificacao.getSoma());
	}

}
