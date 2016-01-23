package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField nome;
	private JTextField cpf;
	private JTextField rg;
	private JTextField cep;
	private JTextField bairro;
	private JTextField rua;
	private JTextField numero;
	private JTextField complemento;
	private JTextField telefone;
	private JTextField referencia;
	private JTextField email;
	private JTextField trabalho;
	private JTextField cidade;
	private JTextField estado;
	String Nome,Rg,Cpf,Cep,Rua,Bairro,Complemento,Numero,Email,Telefone,Referencia,Cidade,Estado,Trabalho;
	
	public static void main(String[] args) {
		try {
			Cliente dialog = new Cliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void cadastraCliente()
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
			Trabalho = trabalho.getText();
			Cidade = cidade.getText();
			Estado = estado.getText();
			
	}
	public void mostraCadastro()
	{
		
		String msg = "\n Nome: "+ Nome;
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
		msg = msg + "\n Local de Trabalho: "+ Trabalho;
		msg = msg + "\n Cidade: "+ Cidade;
		msg = msg + "\n Estado: "+ Estado;
		int resposta = JOptionPane.showConfirmDialog(null, "S�o esses os dados para serem cadastrados? "+ msg,"Confirma��o",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		if(resposta == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso ");
			limpaCadastro();
			
		}	
		
		
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
		trabalho.setText("");
		cidade.setText("");
		estado.setText("");
	}
	

	
	public Cliente() {
		setBounds(100, 100, 761, 544);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel("Cadastro de Clientes");
		label.setFont(new Font("Arial", Font.BOLD, 27));
		label.setBounds(201, 11, 286, 32);
		contentPanel.add(label);
		
		JLabel label_1 = new JLabel("Nome:");
		label_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		label_1.setBounds(10, 60, 89, 16);
		contentPanel.add(label_1);
		
		nome = new JTextField();
		nome.setFont(new Font("Arial", Font.ITALIC, 18));
		nome.setColumns(10);
		nome.setBounds(75, 54, 658, 29);
		contentPanel.add(nome);
		
		JLabel label_2 = new JLabel("CPF/CNPJ:");
		label_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		label_2.setBounds(10, 100, 101, 16);
		contentPanel.add(label_2);
		
		cpf = new JTextField();
		cpf.setFont(new Font("Arial", Font.ITALIC, 18));
		cpf.setColumns(10);
		cpf.setBounds(112, 94, 281, 29);
		contentPanel.add(cpf);
		
		JLabel label_3 = new JLabel("Status:");
		label_3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		label_3.setBounds(514, 29, 67, 14);
		contentPanel.add(label_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ativo", "Inativo"}));
		comboBox.setToolTipText("");
		comboBox.setFont(new Font("Arial", Font.ITALIC, 18));
		comboBox.setBounds(585, 23, 125, 23);
		contentPanel.add(comboBox);
		
		JLabel label_4 = new JLabel("RG:");
		label_4.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		label_4.setBounds(403, 101, 39, 14);
		contentPanel.add(label_4);
		
		rg = new JTextField();
		rg.setFont(new Font("Arial", Font.ITALIC, 18));
		rg.setColumns(10);
		rg.setBounds(440, 94, 293, 29);
		contentPanel.add(rg);
		
		JLabel label_5 = new JLabel("CEP:");
		label_5.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		label_5.setBounds(10, 143, 45, 14);
		contentPanel.add(label_5);
		
		cep = new JTextField();
		cep.setFont(new Font("Arial", Font.ITALIC, 18));
		cep.setColumns(10);
		cep.setBounds(62, 136, 264, 29);
		contentPanel.add(cep);
		
		JLabel label_6 = new JLabel("Bairro:");
		label_6.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		label_6.setBounds(336, 145, 67, 14);
		contentPanel.add(label_6);
		
		bairro = new JTextField();
		bairro.setFont(new Font("Arial", Font.ITALIC, 18));
		bairro.setColumns(10);
		bairro.setBounds(403, 134, 330, 29);
		contentPanel.add(bairro);
		
		JLabel label_7 = new JLabel("Rua:");
		label_7.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		label_7.setBounds(10, 186, 57, 14);
		contentPanel.add(label_7);
		
		rua = new JTextField();
		rua.setFont(new Font("Arial", Font.ITALIC, 18));
		rua.setColumns(10);
		rua.setBounds(62, 176, 476, 29);
		contentPanel.add(rua);
		
		JLabel label_8 = new JLabel("N\u00FAmero:");
		label_8.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		label_8.setBounds(548, 186, 74, 14);
		contentPanel.add(label_8);
		
		numero = new JTextField();
		numero.setFont(new Font("Arial", Font.ITALIC, 18));
		numero.setColumns(10);
		numero.setBounds(632, 174, 101, 29);
		contentPanel.add(numero);
		
		JLabel label_9 = new JLabel("Complemento:");
		label_9.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		label_9.setBounds(10, 228, 133, 14);
		contentPanel.add(label_9);
		
		complemento = new JTextField();
		complemento.setFont(new Font("Arial", Font.ITALIC, 18));
		complemento.setColumns(10);
		complemento.setBounds(144, 216, 286, 29);
		contentPanel.add(complemento);
		
		JLabel label_10 = new JLabel("E-mail:");
		label_10.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		label_10.setBounds(10, 308, 67, 14);
		contentPanel.add(label_10);
		
		JLabel lblTelefone = new JLabel("Telefone:\r\n");
		lblTelefone.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblTelefone.setBounds(440, 228, 89, 14);
		contentPanel.add(lblTelefone);
		
		telefone = new JTextField();
		telefone.setToolTipText("");
		telefone.setFont(new Font("Arial", Font.ITALIC, 18));
		telefone.setColumns(10);
		telefone.setBounds(523, 216, 210, 29);
		contentPanel.add(telefone);
		
		JLabel label_11 = new JLabel("Ref\u00EArencia:");
		label_11.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		label_11.setBounds(10, 268, 107, 14);
		contentPanel.add(label_11);
		
		referencia = new JTextField();
		referencia.setFont(new Font("Arial", Font.ITALIC, 18));
		referencia.setColumns(10);
		referencia.setBounds(111, 261, 622, 29);
		contentPanel.add(referencia);
		
		email = new JTextField();
		email.setFont(new Font("Arial", Font.ITALIC, 18));
		email.setColumns(10);
		email.setBounds(111, 301, 622, 29);
		contentPanel.add(email);
		
		JLabel lblLocalDeTrabalho = new JLabel("Local de Trabalho:");
		lblLocalDeTrabalho.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblLocalDeTrabalho.setBounds(10, 352, 160, 14);
		contentPanel.add(lblLocalDeTrabalho);
		
		trabalho = new JTextField();
		trabalho.setFont(new Font("Arial", Font.ITALIC, 18));
		trabalho.setColumns(10);
		trabalho.setBounds(176, 341, 557, 29);
		contentPanel.add(trabalho);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cadastraCliente();
				mostraCadastro();
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setBounds(144, 450, 160, 23);
		contentPanel.add(btnNewButton);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpaCadastro();
			}
		});
		btnLimpar.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		btnLimpar.setBounds(421, 450, 160, 23);
		contentPanel.add(btnLimpar);
		
		JLabel lblCidade = new JLabel("Cidade:\r\n");
		lblCidade.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblCidade.setBounds(10, 393, 74, 14);
		contentPanel.add(lblCidade);
		
		cidade = new JTextField();
		cidade.setFont(new Font("Arial", Font.ITALIC, 18));
		cidade.setColumns(10);
		cidade.setBounds(94, 378, 309, 29);
		contentPanel.add(cidade);
		
		JLabel lblEstado = new JLabel("Estado:\r\n");
		lblEstado.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblEstado.setBounds(413, 393, 74, 14);
		contentPanel.add(lblEstado);
		
		estado = new JTextField();
		estado.setFont(new Font("Arial", Font.ITALIC, 18));
		estado.setColumns(10);
		estado.setBounds(493, 381, 240, 29);
		contentPanel.add(estado);
	}
}
