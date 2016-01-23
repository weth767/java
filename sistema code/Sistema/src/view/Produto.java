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

public class Produto extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField nome;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Produto dialog = new Produto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Produto() {
		setBounds(100, 100, 742, 503);
		getContentPane().setLayout(new BorderLayout());
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
			label.setBounds(151, 11, 355, 24);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("Tipo de Produto:");
			label.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
			label.setBounds(10, 128, 152, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("Validade:");
			label.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
			label.setBounds(10, 295, 86, 14);
			contentPanel.add(label);
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
			JLabel lblQuantidadeComprada = new JLabel("Quantidade comprada:");
			lblQuantidadeComprada.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
			lblQuantidadeComprada.setBounds(290, 295, 197, 14);
			contentPanel.add(lblQuantidadeComprada);
		}
		{
			JLabel label = new JLabel("Valor de Compra:");
			label.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
			label.setBounds(10, 239, 162, 14);
			contentPanel.add(label);
		}
		{
			JLabel lblCdigoProduto = new JLabel("C\u00F3digo Produto:");
			lblCdigoProduto.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
			lblCdigoProduto.setBounds(366, 181, 142, 20);
			contentPanel.add(lblCdigoProduto);
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
			textField.setBounds(162, 123, 216, 25);
			contentPanel.add(textField);
		}
		{
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Arial", Font.PLAIN, 16));
			textField_1.setColumns(10);
			textField_1.setBounds(539, 123, 177, 25);
			contentPanel.add(textField_1);
		}
		{
			textField_2 = new JTextField();
			textField_2.setFont(new Font("Arial", Font.PLAIN, 16));
			textField_2.setColumns(10);
			textField_2.setBounds(79, 176, 277, 25);
			contentPanel.add(textField_2);
		}
		{
			textField_3 = new JTextField();
			textField_3.setFont(new Font("Arial", Font.PLAIN, 16));
			textField_3.setColumns(10);
			textField_3.setBounds(518, 176, 198, 25);
			contentPanel.add(textField_3);
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
			label.setBounds(376, 239, 152, 14);
			contentPanel.add(label);
		}
		{
			textField_5 = new JTextField();
			textField_5.setFont(new Font("Arial", Font.PLAIN, 16));
			textField_5.setColumns(10);
			textField_5.setBounds(518, 234, 198, 25);
			contentPanel.add(textField_5);
		}
		{
			textField_6 = new JTextField();
			textField_6.setFont(new Font("Arial", Font.PLAIN, 16));
			textField_6.setColumns(10);
			textField_6.setBounds(99, 290, 125, 25);
			contentPanel.add(textField_6);
		}
		{
			textField_7 = new JTextField();
			textField_7.setFont(new Font("Arial", Font.PLAIN, 16));
			textField_7.setColumns(10);
			textField_7.setBounds(497, 290, 219, 25);
			contentPanel.add(textField_7);
		}
		{
			JLabel lblDias = new JLabel("dias\r\n");
			lblDias.setFont(new Font("Arial", Font.ITALIC, 18));
			lblDias.setBounds(234, 295, 46, 14);
			contentPanel.add(lblDias);
		}
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		btnCadastrar.setBounds(173, 431, 125, 23);
		contentPanel.add(btnCadastrar);
		
		JButton button = new JButton("Limpar");
		button.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		button.setBounds(445, 431, 125, 23);
		contentPanel.add(button);
	}
}
