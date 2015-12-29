package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.event.MenuKeyListener;
import javax.swing.event.MenuKeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Telaprincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Telaprincipal window = new Telaprincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Telaprincipal() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 951, 842);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 943, 93);
		frame.getContentPane().add(menuBar);
		
		JMenu mnCadastros = new JMenu("Cadastros");
		menuBar.add(mnCadastros);
		mnCadastros.setFont(new Font("Arial", Font.BOLD, 25));
		
		JMenuItem menuItemCadastroDeClientes = new JMenuItem("Cadastro de Clientes");
		menuItemCadastroDeClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cadcliente Cliente = new Cadcliente();
				Cliente.show();
			}
		});
		mnCadastros.add(menuItemCadastroDeClientes);
		
		JMenuItem mntmCadastroDeFornecedores = new JMenuItem("Cadastro de Fornecedores");
		mnCadastros.add(mntmCadastroDeFornecedores);
		
		JMenuItem mntmCadastroDeProdutos = new JMenuItem("Cadastro de Produtos");
		mnCadastros.add(mntmCadastroDeProdutos);
		
		JMenuItem mntmCadastroDeTipos = new JMenuItem("Cadastro de Tipos de Produtos");
		mnCadastros.add(mntmCadastroDeTipos);
		
		JMenu mnMovimentaes = new JMenu("Movimenta\u00E7\u00F5es");
		mnMovimentaes.setFont(new Font("Arial", Font.BOLD, 25));
		menuBar.add(mnMovimentaes);
		
		JMenuItem mntmCompras = new JMenuItem("Compras");
		mnMovimentaes.add(mntmCompras);
		
		JMenuItem mntmVendas = new JMenuItem("Vendas");
		mnMovimentaes.add(mntmVendas);
		
		JMenu mnNewMenu = new JMenu("Relat\u00F3rios");
		mnNewMenu.setFont(new Font("Arial", Font.BOLD, 25));
		menuBar.add(mnNewMenu);
		
		JMenu mnSair = new JMenu("Sair");
		
			
			
		mnSair.setFont(new Font("Arial", Font.BOLD, 25));
		menuBar.add(mnSair);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Sair");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair? ","Confirmação",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				
				if(resposta == JOptionPane.YES_OPTION)
				{
					System.exit(resposta);
					
				}
				
			}
		});
		mnSair.add(mntmNewMenuItem);
	}
}
