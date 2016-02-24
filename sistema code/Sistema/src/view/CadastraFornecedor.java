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
import javax.swing.JDialog;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CadastraFornecedor extends JDialog {

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
	String Nome,Nomefantasia,Cnpj,Insc,Cidade,Rua,Bairro,Contato,Estado,Cep,Numero,Telefone,Celular,NomeContato;
	private JTextField celular;
	private JTextField nomeContato;
	Telaprincipal t = new Telaprincipal();
	

	
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
		Celular = celular.getText();
		NomeContato = nomeContato.getText();
		
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
		msg += "\nCelular: " + Celular;
		msg += "\nNome do Contato: " + NomeContato;
		int resposta = JOptionPane.showConfirmDialog(null, "São esses os dados para serem cadastrados? "+ msg,"Confirmação",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		if(resposta == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso ");
			t.limparTodosCampos(contentPane);
			
		}	
		
		
	}
	public CadastraFornecedor() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 798, 508);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(220, 220, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Fornecedores");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel.setBounds(151, 11, 343, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblNome.setBounds(10, 57, 61, 14);
		contentPane.add(lblNome);
		
		JLabel lblNomeFantasia = new JLabel("Nome Fantasia:");
		lblNomeFantasia.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblNomeFantasia.setBounds(10, 98, 137, 14);
		contentPane.add(lblNomeFantasia);
		
		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblCnpj.setBounds(10, 142, 61, 14);
		contentPane.add(lblCnpj);
		
		JLabel lblInscrioEstadual = new JLabel("Inscri\u00E7\u00E3o Estadual:");
		lblInscrioEstadual.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblInscrioEstadual.setBounds(359, 142, 166, 14);
		contentPane.add(lblInscrioEstadual);
		
		JLabel lblRua_1 = new JLabel("Rua:");
		lblRua_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblRua_1.setBounds(10, 225, 49, 14);
		contentPane.add(lblRua_1);
		
		JLabel lblContatoWeb = new JLabel("Contato Web:");
		lblContatoWeb.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblContatoWeb.setBounds(10, 320, 120, 14);
		contentPane.add(lblContatoWeb);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblBairro.setBounds(10, 271, 61, 14);
		contentPane.add(lblBairro);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblTelefone.setBounds(491, 320, 80, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblNmero.setBounds(516, 271, 80, 14);
		contentPane.add(lblNmero);
		
		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblStatus.setBounds(535, 30, 61, 14);
		contentPane.add(lblStatus);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblCidade.setBounds(10, 183, 72, 14);
		contentPane.add(lblCidade);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblCep.setBounds(423, 225, 43, 14);
		contentPane.add(lblCep);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblEstado.setBounds(422, 183, 72, 14);
		contentPane.add(lblEstado);
		
		nome = new JTextField();
		nome.setFont(new Font("Arial", Font.PLAIN, 16));
		nome.setBounds(71, 56, 683, 20);
		contentPane.add(nome);
		nome.setColumns(10);
		
		nomefantasia = new JTextField();
		nomefantasia.setFont(new Font("Arial", Font.PLAIN, 16));
		nomefantasia.setColumns(10);
		nomefantasia.setBounds(151, 97, 603, 20);
		contentPane.add(nomefantasia);
		
		cnpj = new JTextField();
		cnpj.setFont(new Font("Arial", Font.PLAIN, 16));
		cnpj.setColumns(10);
		cnpj.setBounds(71, 141, 228, 20);
		contentPane.add(cnpj);
		
		insc = new JTextField();
		insc.setFont(new Font("Arial", Font.PLAIN, 16));
		insc.setColumns(10);
		insc.setBounds(526, 139, 228, 20);
		contentPane.add(insc);
		
		cidade = new JTextField();
		cidade.setFont(new Font("Arial", Font.PLAIN, 16));
		cidade.setColumns(10);
		cidade.setBounds(81, 180, 259, 20);
		contentPane.add(cidade);
		
		rua = new JTextField();
		rua.setFont(new Font("Arial", Font.PLAIN, 16));
		rua.setColumns(10);
		rua.setBounds(67, 222, 345, 20);
		contentPane.add(rua);
		
		bairro = new JTextField();
		bairro.setFont(new Font("Arial", Font.PLAIN, 16));
		bairro.setColumns(10);
		bairro.setBounds(81, 268, 385, 20);
		contentPane.add(bairro);
		
		contato = new JTextField();
		contato.setFont(new Font("Arial", Font.PLAIN, 16));
		contato.setColumns(10);
		contato.setBounds(135, 317, 277, 20);
		contentPane.add(contato);
		
		estado = new JTextField();
		estado.setFont(new Font("Arial", Font.PLAIN, 16));
		estado.setColumns(10);
		estado.setBounds(504, 180, 250, 20);
		contentPane.add(estado);
		
		cep = new JTextField();
		cep.setFont(new Font("Arial", Font.PLAIN, 16));
		cep.setColumns(10);
		cep.setBounds(477, 222, 277, 20);
		contentPane.add(cep);
		
		numero = new JTextField();
		numero.setFont(new Font("Arial", Font.PLAIN, 16));
		numero.setColumns(10);
		numero.setBounds(598, 268, 156, 20);
		contentPane.add(numero);
		
		telefone = new JTextField();
		telefone.setFont(new Font("Arial", Font.PLAIN, 16));
		telefone.setColumns(10);
		telefone.setBounds(581, 317, 173, 20);
		contentPane.add(telefone);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ativo", "Inativo"}));
		comboBox.setBounds(606, 27, 104, 20);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastraFornecedor();
				mostraCadastro();
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setBounds(193, 417, 137, 23);
		contentPane.add(btnNewButton);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.limparTodosCampos(contentPane);
			}
		});
		btnLimpar.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		btnLimpar.setBounds(422, 419, 137, 23);
		contentPane.add(btnLimpar);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblCelular.setBounds(491, 362, 72, 14);
		contentPane.add(lblCelular);
		
		celular = new JTextField();
		celular.setFont(new Font("Arial", Font.PLAIN, 16));
		celular.setColumns(10);
		celular.setBounds(581, 359, 173, 20);
		contentPane.add(celular);
		
		JLabel lblNomeContato = new JLabel("Nome Contato:");
		lblNomeContato.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblNomeContato.setBounds(10, 364, 120, 14);
		contentPane.add(lblNomeContato);
		
		nomeContato = new JTextField();
		nomeContato.setFont(new Font("Arial", Font.PLAIN, 16));
		nomeContato.setColumns(10);
		nomeContato.setBounds(135, 359, 277, 20);
		contentPane.add(nomeContato);
	}
}
