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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Cadcliente extends JFrame {

	private JPanel contentPane;
	private JTextField rg;
	private JTextField cpf;
	private JTextField nome;
	private JTextField cep;
	private JTextField rua;
	private JTextField bairro;
	private JTextField complemento;
	private JTextField numero;
	private JTextField email;
	private JTextField telefone;
	private JTextField referencia;
	String Nome,Rg,Cpf,Cep,Rua,Bairro,Complemento,Numero,Email,Telefone,Referencia;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadcliente frame = new Cadcliente();
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
		cpf.setText("");
		rg.setText("");
		cep.setText("");
		rua.setText("");
		bairro.setText("");
		complemento.setText("");
		numero.setText("");
		email.setText("");
		telefone.setText("");
		referencia.setText("");
		
		
	}
	public void cadastraClienteteste()
	{	
			
			Nome = nome.getText();
			Cpf = cpf.getText();
			Rg = rg.getText();
			Cep = cep.getText();
			Rua = rua.getText();
			Bairro = bairro.getText();
			Complemento = complemento.getText();
			Numero = numero.getText();
			Email = email.getText();
			Telefone = telefone.getText();
			Referencia = referencia.getText();
			
	}
	public void mostraCadastro()
	{
		String msg = "Dados Cadastrados:";
		msg = msg + "\n Nome: "+ Nome;
		msg = msg + "\n CPF: "+ Cpf;
		msg = msg + "\n RG: "+ Rg;
		msg = msg + "\n CEP: "+ Cep;
		msg = msg + "\n Rua: "+ Rua;
		msg = msg + "\n Bairro: "+ Bairro;
		msg = msg + "\n Complemento: "+ Complemento;
		msg = msg + "\n N�mero: "+ Numero;
		msg = msg + "\n Email: "+ Email;
		msg = msg + "\n Telefone: "+ Telefone;
		msg = msg + "\n Refer�ncia: "+ Referencia;
		String resposta = JOptionPane.showInputDialog(null,"Confirma��o\n S�o estes os dados que ser�o cadastrados? " );
		if(resposta.equals("sim")||resposta.equals("Sim")||resposta.equals("SIM"))
		{
			JOptionPane.showMessageDialog(null, msg);
		}
		else if(resposta.equals("N�o")|| resposta.equals("n�o")|| resposta.equals("N�O") )
		{
			limpaCadastro();
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Voc� n�o digitou uma palavra chave v�lida, por favor digite Sim ou N�o ");
			
		}
		
		
	}
		
		
	
	public Cadcliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 594);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Arial", Font.BOLD, 16));
		lblNome.setBounds(10, 65, 57, 14);
		contentPane.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF/CNPJ:");
		lblCpf.setFont(new Font("Arial", Font.BOLD, 16));
		lblCpf.setBounds(10, 115, 96, 14);
		contentPane.add(lblCpf);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setFont(new Font("Arial", Font.BOLD, 16));
		lblRg.setBounds(10, 167, 39, 14);
		contentPane.add(lblRg);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Arial", Font.BOLD, 16));
		lblCep.setBounds(10, 220, 45, 14);
		contentPane.add(lblCep);
		
		JLabel lblRua = new JLabel("Rua:");
		lblRua.setFont(new Font("Arial", Font.BOLD, 16));
		lblRua.setBounds(10, 280, 57, 14);
		contentPane.add(lblRua);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Arial", Font.BOLD, 16));
		lblBairro.setBounds(307, 220, 57, 14);
		contentPane.add(lblBairro);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setFont(new Font("Arial", Font.BOLD, 16));
		lblNmero.setBounds(382, 281, 67, 14);
		contentPane.add(lblNmero);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setFont(new Font("Arial", Font.BOLD, 16));
		lblComplemento.setBounds(10, 335, 113, 14);
		contentPane.add(lblComplemento);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Arial", Font.BOLD, 16));
		lblEmail.setBounds(10, 392, 57, 14);
		contentPane.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Arial", Font.BOLD, 16));
		lblTelefone.setBounds(356, 392, 77, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblRefrencia = new JLabel("Ref\u00EArencia:");
		lblRefrencia.setFont(new Font("Arial", Font.BOLD, 16));
		lblRefrencia.setBounds(10, 453, 96, 14);
		contentPane.add(lblRefrencia);
		
		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setFont(new Font("Arial", Font.BOLD, 18));
		lblStatus.setBounds(382, 117, 67, 14);
		contentPane.add(lblStatus);
		
		rg = new JTextField();
		rg.setFont(new Font("Arial", Font.PLAIN, 16));
		rg.setBounds(65, 162, 222, 29);
		contentPane.add(rg);
		rg.setColumns(10);
		
		cpf = new JTextField();
		cpf.setFont(new Font("Arial", Font.PLAIN, 16));
		cpf.setColumns(10);
		cpf.setBounds(106, 109, 248, 29);
		contentPane.add(cpf);
		
		nome = new JTextField();
		nome.setFont(new Font("Arial", Font.PLAIN, 16));
		nome.setColumns(10);
		nome.setBounds(65, 60, 515, 29);
		contentPane.add(nome);
		
		cep = new JTextField();
		cep.setFont(new Font("Arial", Font.PLAIN, 16));
		cep.setColumns(10);
		cep.setBounds(65, 215, 222, 29);
		contentPane.add(cep);
		
		rua = new JTextField();
		rua.setFont(new Font("Arial", Font.PLAIN, 16));
		rua.setColumns(10);
		rua.setBounds(65, 275, 307, 29);
		contentPane.add(rua);
		
		bairro = new JTextField();
		bairro.setFont(new Font("Arial", Font.PLAIN, 16));
		bairro.setColumns(10);
		bairro.setBounds(374, 215, 230, 29);
		contentPane.add(bairro);
		
		complemento = new JTextField();
		complemento.setFont(new Font("Arial", Font.PLAIN, 16));
		complemento.setColumns(10);
		complemento.setBounds(133, 330, 371, 29);
		contentPane.add(complemento);
		
		numero = new JTextField();
		numero.setFont(new Font("Arial", Font.PLAIN, 16));
		numero.setColumns(10);
		numero.setBounds(460, 274, 101, 29);
		contentPane.add(numero);
		
		email = new JTextField();
		email.setFont(new Font("Arial", Font.PLAIN, 16));
		email.setColumns(10);
		email.setBounds(65, 387, 281, 29);
		contentPane.add(email);
		
		telefone = new JTextField();
		telefone.setFont(new Font("Arial", Font.PLAIN, 16));
		telefone.setColumns(10);
		telefone.setBounds(429, 387, 188, 29);
		contentPane.add(telefone);
		
		referencia = new JTextField();
		referencia.setFont(new Font("Arial", Font.PLAIN, 16));
		referencia.setColumns(10);
		referencia.setBounds(104, 447, 356, 29);
		contentPane.add(referencia);
		

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ativo", "Inativo"}));
		comboBox.setFont(new Font("Arial", Font.PLAIN, 16));
		comboBox.setToolTipText("");
		comboBox.setBounds(448, 114, 98, 20);
		contentPane.add(comboBox);
		
		JLabel lblCadastroDeClientes = new JLabel("Cadastro de Clientes");
		lblCadastroDeClientes.setFont(new Font("Arial", Font.BOLD, 27));
		lblCadastroDeClientes.setBounds(163, 11, 286, 32);
		contentPane.add(lblCadastroDeClientes);
		
		JButton btncadastrar = new JButton("Cadastrar");
		btncadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastraClienteteste();
				mostraCadastro();
				limpaCadastro();
				
			}
		});
		btncadastrar.setFont(new Font("Arial", Font.BOLD, 16));
		btncadastrar.setBounds(106, 512, 159, 23);
		contentPane.add(btncadastrar);
		
		JButton btnlimpar = new JButton("Limpar");
		btnlimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limpaCadastro();
				
			}
		});
		btnlimpar.setFont(new Font("Arial", Font.BOLD, 16));
		btnlimpar.setBounds(387, 512, 159, 23);
		contentPane.add(btnlimpar);
		
		
		
		
		
		
		
	}
}
