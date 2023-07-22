package br.com.one.alura.live.conversordecomprimento.modelo;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class ConversorGraficoTelaOpOne extends JFrame{

	private JTextField inputNumber;
	
    
    public ConversorGraficoTelaOpOne() {
    	setVisible(true);
    	setResizable(false);    	
		setSize(600, 600);
		setTitle("Conversor de centímetros(cm) para metros(m)");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		exibirConversor();
    }
    
	private void exibirConversor() {
		//public static void conversor(String unidadeOrigem, String unidadeDestino, double proporcao, Scanner entrada) {
		//System.out.println("Ok, você escolheu: " + unidadeOrigem + " para " + unidadeDestino);
		//System.out.print("Digite o valor a ser convertido: ");
		//double valor = entrada.nextDouble();
		//double valorFinal = valor * proporcao;
		//System.out.println("O resultado é: " + valorFinal + " " + unidadeDestino);
	//}
	
		inputNumber = new JTextField();
		inputNumber.setBounds(200, 200, 300, 50);
		inputNumber.setFont(new Font("Arial", Font.BOLD, 20));
		add(inputNumber);
		
	}
}
