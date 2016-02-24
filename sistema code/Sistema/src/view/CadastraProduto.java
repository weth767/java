package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastraProduto extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField nome;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_1;
	Telaprincipal t = new Telaprincipal();
	
	public void cadastraProduto()
	{
		

		
	}
	
	public void mostraCadastro()
	{
		
		
	}
	
	public CadastraProduto() {
		setBounds(100, 100, 742, 503);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(135, 206, 250));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel label = new JLabel("Nome Produto:");
			label.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
			label.setBounds(10, 74, 141, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("Cadastro de Produtos");
			label.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 27));
			label.setBounds(215, 11, 355, 24);
			contentPanel.add(label);
		}
		{
			JLabel lblCategoria = new JLabel("Categoria:");
			lblCategoria.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
			lblCategoria.setBounds(10, 128, 99, 20);
			contentPanel.add(lblCategoria);
		}
		{
			JLabel lblUnidadeMdida = new JLabel("Unidade M\u00E9dida:");
			lblUnidadeMdida.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
			lblUnidadeMdida.setBounds(388, 128, 152, 14);
			contentPanel.add(lblUnidadeMdida);
		}
		{
			JLabel label = new JLabel("Marca:");
			label.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
			label.setBounds(10, 181, 59, 14);
			contentPanel.add(label);
		}
		{
			JLabel lblQuantidadeComprada = new JLabel("Quantidade:");
			lblQuantidadeComprada.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
			lblQuantidadeComprada.setBounds(387, 181, 106, 14);
			contentPanel.add(lblQuantidadeComprada);
		}
		{
			JLabel label = new JLabel("Valor de Compra:");
			label.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
			label.setBounds(10, 239, 162, 20);
			contentPanel.add(label);
		}
		{
			nome = new JTextField();
			nome.setFont(new Font("Arial", Font.PLAIN, 16));
			nome.setColumns(10);
			nome.setBounds(151, 68, 565, 25);
			contentPanel.add(nome);
		}
		{
			textField = new JTextField();
			textField.setFont(new Font("Arial", Font.PLAIN, 16));
			textField.setColumns(10);
			textField.setBounds(109, 123, 269, 25);
			contentPanel.add(textField);
		}
		{
			textField_2 = new JTextField();
			textField_2.setFont(new Font("Arial", Font.PLAIN, 16));
			textField_2.setColumns(10);
			textField_2.setBounds(79, 176, 277, 25);
			contentPanel.add(textField_2);
		}
		{
			textField_4 = new JTextField();
			textField_4.setFont(new Font("Arial", Font.PLAIN, 16));
			textField_4.setColumns(10);
			textField_4.setBounds(166, 234, 198, 25);
			contentPanel.add(textField_4);
		}
		{
			JLabel label = new JLabel("Valor de Venda:");
			label.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
			label.setBounds(10, 308, 152, 14);
			contentPanel.add(label);
		}
		{
			textField_5 = new JTextField();
			textField_5.setFont(new Font("Arial", Font.PLAIN, 16));
			textField_5.setColumns(10);
			textField_5.setBounds(586, 237, 119, 25);
			contentPanel.add(textField_5);
		}
		{
			textField_7 = new JTextField();
			textField_7.setFont(new Font("Arial", Font.PLAIN, 16));
			textField_7.setColumns(10);
			textField_7.setBounds(503, 176, 215, 25);
			contentPanel.add(textField_7);
		}
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastraProduto();
				mostraCadastro();
			}
		});
		btnCadastrar.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		btnCadastrar.setBounds(173, 431, 125, 23);
		contentPanel.add(btnCadastrar);
		
		JButton button = new JButton("Limpar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.limparTodosCampos(contentPanel);
			}
		});
		button.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		button.setBounds(445, 431, 125, 23);
		contentPanel.add(button);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("DejaVu Sans", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Litros", "Kilos", "Miligramas", "Gramas", "Unidade"}));
		comboBox.setBounds(535, 127, 162, 20);
		contentPanel.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(151, 303, 198, 25);
		contentPanel.add(textField_1);
		
		JLabel lblPorcentagemDeLucro = new JLabel("Porcentagem de lucro:");
		lblPorcentagemDeLucro.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblPorcentagemDeLucro.setBounds(378, 239, 198, 20);
		contentPanel.add(lblPorcentagemDeLucro);
	}
}
