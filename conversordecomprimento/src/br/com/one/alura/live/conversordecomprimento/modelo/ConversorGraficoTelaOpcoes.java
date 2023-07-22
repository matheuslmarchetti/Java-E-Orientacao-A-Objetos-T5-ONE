package br.com.one.alura.live.conversordecomprimento.modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ConversorGraficoTelaOpcoes extends JFrame {
	
	private JFrame telaDeOpcoes;
	private JPanel painel;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem opcao1;
	private JMenuItem opcao2;
	private JMenuItem opcao3;
	
    
    public ConversorGraficoTelaOpcoes() {
    	telaDeOpcoes = new JFrame("Conversor de Comprimentos");    //creat new frame
        painel = new JPanel();
    	painel.setVisible(true);
    	telaDeOpcoes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	telaDeOpcoes.add(painel);      //add new panel
    	telaDeOpcoes.setVisible(true);       //make it visible
    	telaDeOpcoes.setResizable(false);
    	telaDeOpcoes.setSize(600,600);      //set the size
    	telaDeOpcoes.setLocationRelativeTo(null);// center frame
    	exibirMenu();
    	painel.add(menuBar);
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
				telaDeOpcoes.dispose();
				new ConversorGraficoTelaOpOne();				
			}
		});
		
		opcao2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				telaDeOpcoes.dispose();
				new ConversorGraficoTelaOpTwo();				
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
