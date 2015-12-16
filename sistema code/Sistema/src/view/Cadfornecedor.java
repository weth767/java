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

public class Cadfornecedor extends JFrame {

	private JPanel contentPane;
	private JTextField nome;
	private JTextField nomefantasia;
	private JTextField cnpj;
	private JTextField insc;
	private JTextField cidade;
	private JTextField rua;
	private JTextField bairro;
	private JTextField contato;
	private JTextField estado;
	private JTextField cep;
	private JTextField numero;
	private JTextField telefone;
	String Nome,Nomefantasia,Cnpj,Insc,Cidade,Rua,Bairro,Contato,Estado,Cep,Numero,Telefone;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadfornecedor frame = new Cadfornecedor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void limpaCadastro()
	{
		nome.setText("");
		nomefantasia.setText("");
		cnpj.setText("");
		insc.setText("");
		rua.setText("");
		contato.setText("");
		bairro.setText("");
		cidade.setText("");
		estado.setText("");
		cep.setText("");
		numero.setText("");
		telefone.setText("");
			
	}
	public void cadastraFornecedor()
	{
		Nome = nome.getText();
		Nomefantasia = nomefantasia.getText();
		Cnpj = cnpj.getText();
		Insc = insc.getText();
		Rua = rua.getText();
		Contato = contato.getText();
		Bairro = bairro.getText();
		Cidade = cidade.getText();
		Estado = estado.getText();
		Cep = cep.getText();
		Numero = numero.getText();
		Telefone = telefone.getText();
		
	}
	public void mostraCadastro()
	{
		
		String msg =  "\nNome: " + Nome;
		msg += "\nNome Fantasia: " + Nomefantasia;
		msg += "\nCNPJ: " + Cnpj;
		msg += "\nInscrição Estadual: " + Insc;
		msg += "\nCidade: " + Cidade;
		msg += "\nEstado: " + Estado;
		msg += "\nCep: " + Cep;
		msg += "\nBairro: " + Bairro;
		msg += "\nRua: " + Rua;
		msg += "\nNúmero: " + Numero;
		msg += "\nContato Web: " + Contato;
		msg += "\nTelefone: " + Telefone;
		int resposta = JOptionPane.showConfirmDialog(null, "São esses os dados para serem cadastrados? "+ msg,"Confirmação",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		if(resposta == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso ");
			limpaCadastro();
			
		}	
		
		
	}
	public Cadfornecedor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Fornecedores");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 27));
		lblNewLabel.setBounds(123, 11, 325, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Arial", Font.BOLD, 16));
		lblNome.setBounds(10, 57, 51, 14);
		contentPane.add(lblNome);
		
		JLabel lblNomeFantasia = new JLabel("Nome Fantasia:");
		lblNomeFantasia.setFont(new Font("Arial", Font.BOLD, 16));
		lblNomeFantasia.setBounds(10, 98, 120, 14);
		contentPane.add(lblNomeFantasia);
		
		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setFont(new Font("Arial", Font.BOLD, 16));
		lblCnpj.setBounds(10, 142, 51, 14);
		contentPane.add(lblCnpj);
		
		JLabel lblInscrioEstadual = new JLabel("Inscri\u00E7\u00E3o Estadual:");
		lblInscrioEstadual.setFont(new Font("Arial", Font.BOLD, 16));
		lblInscrioEstadual.setBounds(10, 183, 147, 14);
		contentPane.add(lblInscrioEstadual);
		
		JLabel lblRua_1 = new JLabel("Rua:");
		lblRua_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblRua_1.setBounds(10, 272, 43, 14);
		contentPane.add(lblRua_1);
		
		JLabel lblContatoWeb = new JLabel("Contato Web:");
		lblContatoWeb.setFont(new Font("Arial", Font.BOLD, 16));
		lblContatoWeb.setBounds(10, 367, 112, 14);
		contentPane.add(lblContatoWeb);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Arial", Font.BOLD, 16));
		lblBairro.setBounds(10, 320, 61, 14);
		contentPane.add(lblBairro);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Arial", Font.BOLD, 16));
		lblTelefone.setBounds(422, 367, 72, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setFont(new Font("Arial", Font.BOLD, 16));
		lblNmero.setBounds(422, 320, 72, 14);
		contentPane.add(lblNmero);
		
		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setFont(new Font("Arial", Font.BOLD, 16));
		lblStatus.setBounds(422, 142, 61, 14);
		contentPane.add(lblStatus);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Arial", Font.BOLD, 16));
		lblCidade.setBounds(10, 227, 61, 14);
		contentPane.add(lblCidade);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Arial", Font.BOLD, 16));
		lblCep.setBounds(422, 272, 43, 14);
		contentPane.add(lblCep);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Arial", Font.BOLD, 16));
		lblEstado.setBounds(422, 227, 61, 14);
		contentPane.add(lblEstado);
		
		nome = new JTextField();
		nome.setFont(new Font("Arial", Font.PLAIN, 16));
		nome.setBounds(71, 56, 423, 20);
		contentPane.add(nome);
		nome.setColumns(10);
		
		nomefantasia = new JTextField();
		nomefantasia.setFont(new Font("Arial", Font.PLAIN, 16));
		nomefantasia.setColumns(10);
		nomefantasia.setBounds(135, 97, 359, 20);
		contentPane.add(nomefantasia);
		
		cnpj = new JTextField();
		cnpj.setFont(new Font("Arial", Font.PLAIN, 16));
		cnpj.setColumns(10);
		cnpj.setBounds(71, 141, 173, 20);
		contentPane.add(cnpj);
		
		insc = new JTextField();
		insc.setFont(new Font("Arial", Font.PLAIN, 16));
		insc.setColumns(10);
		insc.setBounds(167, 182, 173, 20);
		contentPane.add(insc);
		
		cidade = new JTextField();
		cidade.setFont(new Font("Arial", Font.PLAIN, 16));
		cidade.setColumns(10);
		cidade.setBounds(81, 226, 259, 20);
		contentPane.add(cidade);
		
		rua = new JTextField();
		rua.setFont(new Font("Arial", Font.PLAIN, 16));
		rua.setColumns(10);
		rua.setBounds(56, 271, 356, 20);
		contentPane.add(rua);
		
		bairro = new JTextField();
		bairro.setFont(new Font("Arial", Font.PLAIN, 16));
		bairro.setColumns(10);
		bairro.setBounds(71, 319, 259, 20);
		contentPane.add(bairro);
		
		contato = new JTextField();
		contato.setFont(new Font("Arial", Font.PLAIN, 16));
		contato.setColumns(10);
		contato.setBounds(123, 366, 289, 20);
		contentPane.add(contato);
		
		estado = new JTextField();
		estado.setFont(new Font("Arial", Font.PLAIN, 16));
		estado.setColumns(10);
		estado.setBounds(494, 224, 173, 20);
		contentPane.add(estado);
		
		cep = new JTextField();
		cep.setFont(new Font("Arial", Font.PLAIN, 16));
		cep.setColumns(10);
		cep.setBounds(475, 271, 173, 20);
		contentPane.add(cep);
		
		numero = new JTextField();
		numero.setFont(new Font("Arial", Font.PLAIN, 16));
		numero.setColumns(10);
		numero.setBounds(494, 319, 87, 20);
		contentPane.add(numero);
		
		telefone = new JTextField();
		telefone.setFont(new Font("Arial", Font.PLAIN, 16));
		telefone.setColumns(10);
		telefone.setBounds(504, 366, 173, 20);
		contentPane.add(telefone);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ativo", "Inativo"}));
		comboBox.setBounds(489, 141, 104, 20);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastraFornecedor();
				mostraCadastro();
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton.setBounds(193, 417, 137, 23);
		contentPane.add(btnNewButton);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpaCadastro();
			}
		});
		btnLimpar.setFont(new Font("Arial", Font.BOLD, 16));
		btnLimpar.setBounds(422, 419, 137, 23);
		contentPane.add(btnLimpar);
	}
}
