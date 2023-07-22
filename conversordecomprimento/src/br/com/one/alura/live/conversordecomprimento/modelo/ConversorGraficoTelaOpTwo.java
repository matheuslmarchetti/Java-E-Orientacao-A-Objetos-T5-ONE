package br.com.one.alura.live.conversordecomprimento.modelo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ConversorGraficoTelaOpTwo extends JFrame{

	private JTextField inputNumber;
	private JLabel textMedida;
	private JLabel textMesagem;
	private JButton buttonCalcular;
	private JButton buttonVoltar;
	private JButton buttonSair;
	
    
    public ConversorGraficoTelaOpTwo() {
    	setVisible(true);
    	setResizable(false);    	
		setSize(600, 600);
		setTitle("Conversor de metros(m) para centímetros(cm)");
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
		
		textMedida = new JLabel("metros(m)");
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
		    	try {
					calcular();
				} catch (ParseException e) {
					JOptionPane.showMessageDialog(null, "Digite um número válido!" , "Erro!", 
							JOptionPane.ERROR_MESSAGE);
				}
		    }
		    
		});
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
		
		voltar();
		add(buttonVoltar);
		
		buttonSair = new JButton("Sair");
		buttonSair.setBounds(225, 350, 150, 30);
		buttonSair.setFont(new Font("Arial", Font.BOLD, 16));
		buttonSair.setFocusPainted(false);
		buttonSair.setForeground(Color.WHITE);
		buttonSair.setBackground(Color.BLACK);
		buttonSair.setBorderPainted(false);
		
		buttonSair.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	buttonSair.setForeground(Color.BLACK);
		    	buttonSair.setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	buttonSair.setForeground(Color.WHITE);
		    	buttonSair.setBackground(Color.BLACK);
		    }
		    
		    public void mouseClicked(java.awt.event.MouseEvent evt) {
		    	sair();
		    }
		});
		add(buttonSair);
	}

	public void calcular() throws ParseException {
		Locale localeBR = new Locale("pt","BR");
		NumberFormat numberFormat = NumberFormat.getNumberInstance(localeBR);
		DecimalFormat decimalFormat= new DecimalFormat("##,##0.00");
		double valor = decimalFormat.parse(inputNumber.getText()).doubleValue();
		double proporcao = 100;
		double valorFinal = valor * proporcao;
		String valorFinalFormatBr = numberFormat.format(valorFinal);
		
			JOptionPane.showMessageDialog(null, "O resultado é: " + valorFinalFormatBr + " centímetro(s)", "Conversão Concluída", 
			JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public void voltar() {
		
		buttonVoltar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				dispose();                //close old frame
				new ConversorGraficoTelaOpcoes();            
			}
		});	
	}
	
	private void sair() {
		JOptionPane.showMessageDialog(null, "Saindo do programa...", "Mensagem", 
		JOptionPane.WARNING_MESSAGE);
		System.exit(0);
		
	}
}