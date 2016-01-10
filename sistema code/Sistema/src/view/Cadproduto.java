package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class Cadproduto extends JFrame {

	private JPanel contentPane;
	private JTextField fornecedor;
	private JTextField tipoproduto;
	private JTextField nomeproduto;
	private JTextField validade;
	private JTextField marca;
	private JTextField valorcompra;
	private JTextField valorvenda;
	private JTextField quantidade;
	String Nomeproduto,Tipoproduto,Fornecedor,Validade,Marca,Valorcompra,Valorvenda,Quantidade;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadproduto frame = new Cadproduto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void mostraCadastro()
	{
	
	   String msg = "\nNome Produto: "+ Nomeproduto;
		msg += "\nTipo Produto: "+ Tipoproduto;
		msg += "\nFornecedor: "+ Fornecedor;
		msg += "\nMarca: "+ Marca;
		msg += "\nQuantidade: "+ Quantidade;
		msg += "\nValidade: "+ Validade;
		msg += "\nValor Compra: "+ Valorcompra;
		msg += "\nValor Venda: "+ Valorvenda;
		int resposta = JOptionPane.showConfirmDialog(null, "São esses os dados para serem cadastrados? "+ msg,"Confirmação",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		if(resposta == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso ");
			limpaCadastro();
			
		}	
		

	}
	public void cadastraProduto()
	{
		Nomeproduto = nomeproduto.getText();
		Tipoproduto = tipoproduto.getText();
		Fornecedor = fornecedor.getText();
		Validade = validade.getText();
		Marca = marca.getText();
		Valorcompra = valorcompra.getText();
		Valorvenda = valorvenda.getText();
		Quantidade = quantidade.getText();
		
	}
	public void limpaCadastro()
	{
		nomeproduto.setText("");
		tipoproduto.setText("");
		fornecedor.setText("");
		quantidade.setText("");
		validade.setText("");
		valorcompra.setText("");
		valorvenda.setText("");
		marca.setText("");
		
	}
	public Cadproduto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeFornecedores = new JLabel("Cadastro de Produtos");
		lblCadastroDeFornecedores.setFont(new Font("Arial", Font.PLAIN, 27));
		lblCadastroDeFornecedores.setBounds(131, 11, 355, 24);
		contentPane.add(lblCadastroDeFornecedores);
		
		JLabel lblNome = new JLabel("Nome Produto:");
		lblNome.setFont(new Font("Arial", Font.BOLD, 18));
		lblNome.setBounds(10, 61, 141, 14);
		contentPane.add(lblNome);
		
		JLabel lblNomeFantasia = new JLabel("Tipo de Produto:");
		lblNomeFantasia.setFont(new Font("Arial", Font.BOLD, 18));
		lblNomeFantasia.setBounds(10, 109, 152, 14);
		contentPane.add(lblNomeFantasia);
		
		JLabel lblCnpj = new JLabel("Fornecedor:");
		lblCnpj.setFont(new Font("Arial", Font.BOLD, 18));
		lblCnpj.setBounds(10, 166, 108, 14);
		contentPane.add(lblCnpj);
		
		JLabel lblInscrioEstudual = new JLabel("Validade:");
		lblInscrioEstudual.setFont(new Font("Arial", Font.BOLD, 18));
		lblInscrioEstudual.setBounds(10, 219, 86, 14);
		contentPane.add(lblInscrioEstudual);
		
		JLabel lblRua = new JLabel("Quantidade:");
		lblRua.setFont(new Font("Arial", Font.BOLD, 18));
		lblRua.setBounds(10, 331, 108, 14);
		contentPane.add(lblRua);
		
		JLabel lblCidade = new JLabel("Marca:");
		lblCidade.setFont(new Font("Arial", Font.BOLD, 18));
		lblCidade.setBounds(10, 273, 59, 14);
		contentPane.add(lblCidade);
		
		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setFont(new Font("Arial", Font.BOLD, 18));
		lblStatus.setBounds(429, 166, 75, 14);
		contentPane.add(lblStatus);
		
		JLabel lblValorDeCompra = new JLabel("Valor de Compra:");
		lblValorDeCompra.setFont(new Font("Arial", Font.BOLD, 18));
		lblValorDeCompra.setBounds(339, 219, 162, 14);
		contentPane.add(lblValorDeCompra);
		
		JLabel lblValorDeVenda = new JLabel("Valor de Venda:");
		lblValorDeVenda.setFont(new Font("Arial", Font.BOLD, 18));
		lblValorDeVenda.setBounds(334, 273, 152, 14);
		contentPane.add(lblValorDeVenda);
		
		fornecedor = new JTextField();
		fornecedor.setFont(new Font("Arial", Font.PLAIN, 16));
		fornecedor.setBounds(131, 163, 274, 20);
		contentPane.add(fornecedor);
		fornecedor.setColumns(10);
		
		tipoproduto = new JTextField();
		tipoproduto.setFont(new Font("Arial", Font.PLAIN, 16));
		tipoproduto.setColumns(10);
		tipoproduto.setBounds(159, 106, 342, 20);
		contentPane.add(tipoproduto);
		
		nomeproduto = new JTextField();
		nomeproduto.setFont(new Font("Arial", Font.PLAIN, 16));
		nomeproduto.setColumns(10);
		nomeproduto.setBounds(146, 60, 355, 20);
		contentPane.add(nomeproduto);
		
		validade = new JTextField();
		validade.setFont(new Font("Arial", Font.PLAIN, 16));
		validade.setColumns(10);
		validade.setBounds(101, 216, 180, 20);
		contentPane.add(validade);
		
		marca = new JTextField();
		marca.setFont(new Font("Arial", Font.PLAIN, 16));
		marca.setColumns(10);
		marca.setBounds(79, 270, 235, 20);
		contentPane.add(marca);
		
		valorcompra = new JTextField();
		valorcompra.setFont(new Font("Arial", Font.PLAIN, 16));
		valorcompra.setColumns(10);
		valorcompra.setBounds(504, 216, 147, 20);
		contentPane.add(valorcompra);
		
		valorvenda = new JTextField();
		valorvenda.setFont(new Font("Arial", Font.PLAIN, 16));
		valorvenda.setColumns(10);
		valorvenda.setBounds(496, 270, 157, 20);
		contentPane.add(valorvenda);
		
		quantidade = new JTextField();
		quantidade.setFont(new Font("Arial", Font.PLAIN, 16));
		quantidade.setColumns(10);
		quantidade.setBounds(119, 330, 95, 20);
		contentPane.add(quantidade);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ativo", "Inativo"}));
		comboBox.setBounds(499, 165, 95, 20);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastraProduto();
				mostraCadastro();
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton.setBounds(145, 384, 125, 23);
		contentPane.add(btnNewButton);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpaCadastro();
			}
		});
		btnLimpar.setFont(new Font("Arial", Font.BOLD, 16));
		btnLimpar.setBounds(379, 386, 125, 23);
		contentPane.add(btnLimpar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 86, 674, 14);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 134, 674, 14);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 191, 674, 14);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 244, 674, 14);
		contentPane.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(10, 298, 674, 14);
		contentPane.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(10, 359, 674, 14);
		contentPane.add(separator_5);
	}
}
