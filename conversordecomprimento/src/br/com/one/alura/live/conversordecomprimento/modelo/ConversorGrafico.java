package br.com.one.alura.live.conversordecomprimento.modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
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
		setSize(600, 600);
		setTitle("Conversor de Comprimentos");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel painel = new JPanel();
		
		exibirMenu();
		painel.add(menuBar);
		add(painel);
		
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
		
		opcao3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Saindo do programa...");
				System.exit(0);
				
			}
		});
		
	}
	
}
