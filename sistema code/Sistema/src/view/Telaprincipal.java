package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFormattedTextField;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.MenuKeyListener;
import javax.swing.event.MenuKeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import java.awt.Canvas;
import javax.swing.JToolBar;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import java.awt.Toolkit;

public class Telaprincipal {

	private JFrame frmSistemaLojaDe;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Telaprincipal window = new Telaprincipal();
					window.frmSistemaLojaDe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

    public void limparTodosCampos(Container container) 
    {  
    	Component components[] = container.getComponents();  
    	for (Component component : components) 
    	{  
    		if (component instanceof JFormattedTextField) 
    		{  
    			JFormattedTextField field = (JFormattedTextField) component;  
    			field.setValue(null);  
    		} 
    		else if (component instanceof JTextField) 
    		{  
    			JTextField field = (JTextField) component;  
    			field.setText("");  
    		} 
    		else if (component instanceof Container)
    		{  
    			limparTodosCampos((Container) component);  
    		}  
    	}	
    }
	
	public Telaprincipal() {
		initialize();
	}

	
	private void initialize() {
		frmSistemaLojaDe = new JFrame();
		frmSistemaLojaDe.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Projeto Java\\icones\\Icones Usados\\Add Network Place.png"));
		frmSistemaLojaDe.setResizable(false);
		frmSistemaLojaDe.setTitle("Sistema Loja de Cal\u00E7ados");
		frmSistemaLojaDe.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
			
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair? ","Confirmação",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
					
				if(resposta == JOptionPane.YES_OPTION)
				{
					System.exit(resposta);
					
				}
				
				
			}
		});
		frmSistemaLojaDe.getContentPane().setBackground(new Color(220, 220, 220));
		frmSistemaLojaDe.setBounds(150, 20, 1050, 700);
		frmSistemaLojaDe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frmSistemaLojaDe.getContentPane().setLayout(null);
		
		JMenuBar menuBarCliente = new JMenuBar();
		menuBarCliente.setBounds(92, 80, 70, 70);
		frmSistemaLojaDe.getContentPane().add(menuBarCliente);
		
		JMenu menuCliente = new JMenu("Clientes");
		menuBarCliente.add(menuCliente);
		menuCliente.setToolTipText("Clientes");
		menuCliente.setHorizontalAlignment(SwingConstants.CENTER);
		menuCliente.setIcon(new ImageIcon("C:\\Users\\Weth\\Desktop\\icones\\businessman_woman.png"));
		
		JMenuItem menuItemIncluir = new JMenuItem("Incluir");
		menuItemIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastraCliente c = new CadastraCliente();
				c.setVisible(true);
			}
		});
		menuItemIncluir.setFont(new Font("Georgia", Font.PLAIN, 12));
		menuItemIncluir.setBackground(new Color(220, 220, 220));
		menuItemIncluir.setHorizontalAlignment(SwingConstants.CENTER);
		menuCliente.add(menuItemIncluir);
		
		JMenuItem mntmAlterar = new JMenuItem("Alterar");
		mntmAlterar.setHorizontalAlignment(SwingConstants.CENTER);
		mntmAlterar.setFont(new Font("Georgia", Font.PLAIN, 12));
		mntmAlterar.setBackground(new Color(220, 220, 220));
		menuCliente.add(mntmAlterar);
		
		JMenuItem mntmConsultar = new JMenuItem("Consultar");
		mntmConsultar.setFont(new Font("Georgia", Font.PLAIN, 12));
		mntmConsultar.setHorizontalAlignment(SwingConstants.CENTER);
		mntmConsultar.setBackground(new Color(220, 220, 220));
		menuCliente.add(mntmConsultar);
		
		JMenuItem mntmExcluir = new JMenuItem("Excluir");
		mntmExcluir.setFont(new Font("Georgia", Font.PLAIN, 12));
		mntmExcluir.setHorizontalAlignment(SwingConstants.CENTER);
		mntmExcluir.setBackground(new Color(220, 220, 220));
		menuCliente.add(mntmExcluir);
		
		JMenuBar menuBarFuncionario = new JMenuBar();
		menuBarFuncionario.setBounds(220, 80, 70, 70);
		frmSistemaLojaDe.getContentPane().add(menuBarFuncionario);
		
		JMenu menuFuncionario = new JMenu("");
		menuBarFuncionario.add(menuFuncionario);
		menuFuncionario.setToolTipText("Funcionários");
		menuFuncionario.setIcon(new ImageIcon("C:\\Users\\Weth\\Desktop\\icones\\Funcionario.png"));
		
		JMenuItem mntmIncluir = new JMenuItem("Incluir");
		mntmIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastraFuncionario cf = new CadastraFuncionario();
				cf.setVisible(true);
			}
		});
		mntmIncluir.setFont(new Font("Georgia", Font.PLAIN, 12));
		mntmIncluir.setBackground(new Color(220, 220, 220));
		menuFuncionario.add(mntmIncluir);
		
		JMenuItem mntmAlterar_1 = new JMenuItem("Alterar");
		mntmAlterar_1.setFont(new Font("Georgia", Font.PLAIN, 12));
		mntmAlterar_1.setBackground(new Color(220, 220, 220));
		menuFuncionario.add(mntmAlterar_1);
		
		JMenuItem mntmConsultar_1 = new JMenuItem("Consultar");
		mntmConsultar_1.setFont(new Font("Georgia", Font.PLAIN, 12));
		mntmConsultar_1.setBackground(new Color(220, 220, 220));
		menuFuncionario.add(mntmConsultar_1);
		
		JMenuItem mntmExcluir_1 = new JMenuItem("Excluir");
		mntmExcluir_1.setFont(new Font("Georgia", Font.PLAIN, 12));
		mntmExcluir_1.setBackground(new Color(220, 220, 220));
		menuFuncionario.add(mntmExcluir_1);
		
		JMenuBar menuBarFornecedor = new JMenuBar();
		menuBarFornecedor.setBounds(353, 80, 70, 70);
		frmSistemaLojaDe.getContentPane().add(menuBarFornecedor);
		
		JMenu menuFornecedor = new JMenu("");
		menuFornecedor.setToolTipText("Fornecedores");
		menuBarFornecedor.add(menuFornecedor);
		menuFornecedor.setIcon(new ImageIcon("C:\\Users\\Weth\\Desktop\\icones\\Fornecedor.png"));
		
		JMenuItem mntmIncluir_1 = new JMenuItem("Incluir");
		mntmIncluir_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastraFornecedor cfn = new CadastraFornecedor();
				cfn.setVisible(true);
			}
		});
		mntmIncluir_1.setBackground(new Color(220, 220, 220));
		mntmIncluir_1.setFont(new Font("Georgia", Font.PLAIN, 12));
		menuFornecedor.add(mntmIncluir_1);
		
		JMenuItem mntmAlterar_2 = new JMenuItem("Alterar");
		mntmAlterar_2.setBackground(new Color(220, 220, 220));
		mntmAlterar_2.setFont(new Font("Georgia", Font.PLAIN, 12));
		menuFornecedor.add(mntmAlterar_2);
		
		JMenuItem mntmConsultar_2 = new JMenuItem("Consultar");
		mntmConsultar_2.setBackground(new Color(220, 220, 220));
		mntmConsultar_2.setFont(new Font("Georgia", Font.PLAIN, 12));
		menuFornecedor.add(mntmConsultar_2);
		
		JMenuItem mntmExcluir_2 = new JMenuItem("Excluir");
		mntmExcluir_2.setBackground(new Color(220, 220, 220));
		mntmExcluir_2.setFont(new Font("Georgia", Font.PLAIN, 12));
		menuFornecedor.add(mntmExcluir_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("F:\\Projeto Java\\icones\\Super Collection\\iTools.png"));
		lblNewLabel.setBounds(463, 270, 128, 128);
		frmSistemaLojaDe.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sistema Commerce");
		lblNewLabel_1.setFont(new Font("Arial", Font.ITALIC, 18));
		lblNewLabel_1.setBounds(449, 409, 159, 21);
		frmSistemaLojaDe.getContentPane().add(lblNewLabel_1);
		
		JLabel lblLojaDeCalados = new JLabel("Loja de Cal\u00E7ados");
		lblLojaDeCalados.setFont(new Font("Arial", Font.ITALIC, 18));
		lblLojaDeCalados.setBounds(459, 432, 140, 21);
		frmSistemaLojaDe.getContentPane().add(lblLojaDeCalados);
		
		JLabel lblNewLabel_2 = new JLabel("Desenvolvido por Jo\u00E3o Paulo de Souza. Todos os direitos reservados. All directs reserved \u00AE 2016");
		lblNewLabel_2.setFont(new Font("Arial", Font.ITALIC, 14));
		lblNewLabel_2.setBounds(233, 612, 616, 21);
		frmSistemaLojaDe.getContentPane().add(lblNewLabel_2);
	}
}
