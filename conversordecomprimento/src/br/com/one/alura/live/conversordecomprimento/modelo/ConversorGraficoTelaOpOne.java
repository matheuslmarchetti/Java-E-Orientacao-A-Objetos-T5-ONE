package br.com.one.alura.live.conversordecomprimento.modelo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ConversorGraficoTelaOpOne extends JFrame{

	private JTextField inputNumber;
	private JLabel textMedida;
	private JLabel textMesagem;
	private JButton buttonCalcular;
	private JButton buttonVoltar;
	
    
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

		textMesagem = new JLabel("Digite o valor a ser convertido");
		textMesagem.setBounds(225, 100, 200, 30);
		textMesagem.setFont(new Font("Arial", Font.BOLD, 10));
		add(textMesagem);
		
		inputNumber = new JTextField();
		inputNumber.setBounds(220, 150, 100, 30);
		inputNumber.setFont(new Font("Arial", Font.BOLD, 20));
		add(inputNumber);
		
		textMedida = new JLabel("centímetros(cm)");
		textMedida.setBounds(320, 150, 150, 30);
		textMedida.setFont(new Font("Arial", Font.BOLD, 10));
		add(textMedida);
		
		buttonCalcular = new JButton("Calcular");
		buttonCalcular.setBounds(225, 250, 150, 30);
		buttonCalcular.setFont(new Font("Arial", Font.BOLD, 16));
		buttonCalcular.setFocusPainted(false);
		buttonCalcular.setForeground(Color.WHITE);
		buttonCalcular.setBackground(Color.BLACK);
		buttonCalcular.setBorderPainted(false);
		
		buttonCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	buttonCalcular.setForeground(Color.BLACK);
		    	buttonCalcular.setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	buttonCalcular.setForeground(Color.WHITE);
		    	buttonCalcular.setBackground(Color.BLACK);
		    }

		    
		    public void mouseClicked(java.awt.event.MouseEvent evt) {
		    	calcular();
		    }
		    
		});
		//calcular();
		//buttonAcaoCalcular();
		add(buttonCalcular);
		
		buttonVoltar = new JButton("Voltar");
		buttonVoltar.setBounds(225, 300, 150, 30);
		buttonVoltar.setFont(new Font("Arial", Font.BOLD, 16));
		buttonVoltar.setFocusPainted(false);
		buttonVoltar.setForeground(Color.WHITE);
		buttonVoltar.setBackground(Color.BLACK);
		buttonVoltar.setBorderPainted(false);
		
		buttonVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	buttonVoltar.setForeground(Color.BLACK);
		    	buttonVoltar.setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	buttonVoltar.setForeground(Color.WHITE);
		    	buttonVoltar.setBackground(Color.BLACK);
		    }		    
		});
		
		buttonAcaoVoltar();
		add(buttonVoltar);
	}
	
	public void buttonAcaoVoltar() {
		
		buttonVoltar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				dispose();                //close old frame
				new ConversorGraficoTelaOpcoes();            
			}
		});
		
	}
	
	public void buttonAcaoCalcular() {
		
		//public static void conversor(String unidadeOrigem, String unidadeDestino, double proporcao, Scanner entrada) {
		//System.out.println("Ok, você escolheu: " + unidadeOrigem + " para " + unidadeDestino);
		//System.out.print("Digite o valor a ser convertido: ");
		//double valor = entrada.nextDouble();
		//double valorFinal = valor * proporcao;
		//System.out.println("O resultado é: " + valorFinal + " " + unidadeDestino);
	//}
		
		buttonCalcular.addActionListener(new ActionListener() {
			
			double valor = Double.parseDouble(inputNumber.getText());
			double proporcao = 0.01;
			double valorFinal = valor * proporcao;
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "O resultado é: " + valorFinal, "Conversão Concluída", 
				JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		
	}

	public void calcular() {
		Locale localeBR = new Locale("pt","BR");
		NumberFormat numberFormat = NumberFormat.getNumberInstance(localeBR);
		//String inputF = numberFormat.format(inputNumber.getText());
		double valor = Double.parseDouble(inputNumber.getText());
		//double valor = Double.parseDouble(inputF);
		double proporcao = 0.01;
		//numberFormat.format(proporcao);
		double valorFinal = valor * proporcao;
		String ValorFinalF = numberFormat.format(valorFinal);
		
			JOptionPane.showMessageDialog(null, "O resultado é: " + ValorFinalF + " metro(s)", "Conversão Concluída", 
			JOptionPane.INFORMATION_MESSAGE);
		
	}
}
