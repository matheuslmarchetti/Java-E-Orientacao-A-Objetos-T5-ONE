package br.com.one.alura.live.conversordecomprimento.modelo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ConversorGraficoTelaInicial extends JFrame {
	
	public ConversorGraficoTelaInicial() {
		setVisible(true);
		setResizable(false);
		setSize(600, 600);
		setTitle("Conversor de Comprimentos");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		JLabel labelBemVindo = new JLabel("Bem-vindo(a) ao Conversor de Comprimentos");
		labelBemVindo.setBounds(100, 100, 500, 70);
		labelBemVindo.setFont(new Font("Arial", Font.BOLD, 16));
		add(labelBemVindo);
		
		final JButton buttonIniciar = new JButton("Iniciar");
		buttonIniciar.setBounds(240, 300, 120, 30);
		buttonIniciar.setFont(new Font("Arial", Font.BOLD, 20));
		buttonIniciar.setFocusPainted(false);
		buttonIniciar.setForeground(Color.WHITE);
		buttonIniciar.setBackground(Color.BLACK);
		buttonIniciar.setBorderPainted(false);

		buttonIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	buttonIniciar.setForeground(Color.BLACK);
		    	buttonIniciar.setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	buttonIniciar.setForeground(Color.WHITE);
		    	buttonIniciar.setBackground(Color.BLACK);
		    }
		});
		
		buttonIniciar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				dispose();                //close old frame
				new ConversorGraficoTelaOpcoes();            
			}
		});
		
		final JButton buttonSair = new JButton("Sair");
		buttonSair.setBounds(240, 350, 120, 30);
		buttonSair.setFont(new Font("Arial", Font.BOLD, 20));
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
		});
		
		buttonSair.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Saindo do programa...", "Mensagem", 
				JOptionPane.WARNING_MESSAGE);
				System.exit(0);
				
			}
		});
		
		add(buttonIniciar);
		add(buttonSair);
		
	}
	
}
