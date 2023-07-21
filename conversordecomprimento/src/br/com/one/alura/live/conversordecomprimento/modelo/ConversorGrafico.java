package br.com.one.alura.live.conversordecomprimento.modelo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ConversorGrafico extends JFrame {

	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem opcao1;
	private JMenuItem opcao2;
	private JMenuItem opcao3;
	
	
	public ConversorGrafico() {
		setVisible(true);
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
	            JFrame painel = new JFrame("Conversor de Comprimentos");    //creat new frame
	            painel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	            painel.add(new JPanel());      //add new panel
	            painel.setVisible(true);       //make it visible
	            painel.setSize(600,600);      //set the size
	            painel.setLocationRelativeTo(null);// center frame
	            painel.setLayout(null);
	            
	            
	            
//				JPanel painel = new JPanel();
//				painel.setVisible(true);
//				
//				
//				exibirMenu();
//				painel.add(menuBar);
//				add(painel);
				
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
	
	public void exibirMenu() {
		menuBar = new JMenuBar();
		menu = new JMenu("Escolha uma opção: ");
		opcao1 = new JMenuItem("Converter centímetros(cm) para metros(m)");
		opcao2 = new JMenuItem("Converter metros(m) para centímetros(cm)");
		opcao3 = new JMenuItem("Sair do programa");
		
		menu.add(opcao1);
		menu.add(opcao2);
		menu.add(opcao3);
		
		menuBar.add(menu);
		
		opcao1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		opcao3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Saindo do programa...");
				System.exit(0);
				
			}
		});
		
	}
	
}
