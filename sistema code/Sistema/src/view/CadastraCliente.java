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
import javax.swing.text.MaskFormatter;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.ImageIcon;
public class CadastraCliente extends JDialog {

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
	String Nome,Rg,Cpf,Cep,Rua,Bairro,Complemento,Numero,Email,Telefone,Referencia,Celular,Trabalho,Cnpj,Insc,Nascimento;
	Object Cidade,Estado,TipoPessoa;
	private JComboBox comboCidade;
	private JComboBox comboEstado;
	Telaprincipal t = new Telaprincipal();
	private JTextField cnpj;
	private JTextField insc;
	private JTextField celular;
	private JComboBox comboTipoPessoa;
	private JFormattedTextField datanascimento;
	
	
		
	
	public void limitaLetras(KeyEvent e)
	{
		char codigoTecla = e.getKeyChar();
		if(!(codigoTecla >= 'a' && codigoTecla <='z' || codigoTecla >= 'A' && codigoTecla <= 'Z' || codigoTecla == 'ç' || codigoTecla == 'ã' || codigoTecla == 'é' || codigoTecla == ' ' || codigoTecla == 'ô' || codigoTecla == 'â'))
			e.consume();
		
	}
	
	public void cadastraCliente()
	{	
			TipoPessoa = comboTipoPessoa.getSelectedItem();
			if(TipoPessoa.equals("Física"))
			{	
				Nome = nome.getText();
				Cpf = cpf.getText();
				Rg = rg.getText();
				Nascimento = datanascimento.getText();
				Cep = cep.getText();
				Rua = rua.getText();
				Bairro = bairro.getText();
				Complemento = complemento.getText();
				Numero = numero.getText();
				Email = email.getText();
				Telefone = telefone.getText();
				Celular = celular.getText();
				Referencia = referencia.getText();
				Trabalho = trabalho.getText();
				Cidade = comboCidade.getSelectedItem();
				Estado = comboEstado.getSelectedItem();
			}
			
			else if(TipoPessoa.equals("Jurídica"))
			{
				Nome = nome.getText();
				Cnpj = cnpj.getText();
				Insc = insc.getText();
				Nascimento = datanascimento.getText();
				Cep = cep.getText();
				Rua = rua.getText();
				Bairro = bairro.getText();
				Complemento = complemento.getText();
				Numero = numero.getText();
				Email = email.getText();
				Telefone = telefone.getText();
				Celular = celular.getText();
				Referencia = referencia.getText();
				Cidade = comboCidade.getSelectedItem();
				Estado = comboEstado.getSelectedItem();
				
			}	
			
	}
	public void mostraCadastro()
	{	
		String msg = "";
		TipoPessoa = comboTipoPessoa.getSelectedItem();
		if(TipoPessoa.equals("Física"))
		{	
			msg = msg + "\n Nome: "+ Nome;
			msg = msg + "\n CPF: "+ Cpf;
			msg = msg + "\n RG: "+ Rg;
			msg = msg + "\n Data de Nascimento:" + Nascimento;
			msg = msg + "\n CEP: "+ Cep;
			msg = msg + "\n Rua: "+ Rua;
			msg = msg + "\n Bairro: "+ Bairro;
			msg = msg + "\n Complemento: "+ Complemento;
			msg = msg + "\n Número: "+ Numero;
			msg = msg + "\n Email: "+ Email;
			msg = msg + "\n Telefone: "+ Telefone;
			msg = msg + "\n Celular: " + Celular;
			msg = msg + "\n Referência: "+ Referencia;
			msg = msg + "\n Local de Trabalho: "+ Trabalho;
			msg = msg + "\n Cidade: "+ Cidade.toString();
			msg = msg + "\n Estado: "+ Estado.toString();
		}
		else if(TipoPessoa.equals("Jurídica"))
		{
			msg = msg + "\n Nome: "+ Nome;
			msg = msg + "\n CNPJ: "+ Cnpj;
			msg = msg + "\n Inscrição Estadual: "+ Insc;
			msg = msg + "\n Data de Nascimento: " + Nascimento;
			msg = msg + "\n CEP: "+ Cep;
			msg = msg + "\n Rua: "+ Rua;
			msg = msg + "\n Bairro: "+ Bairro;
			msg = msg + "\n Complemento: "+ Complemento;
			msg = msg + "\n Número: "+ Numero;
			msg = msg + "\n Email: "+ Email;
			msg = msg + "\n Telefone: "+ Telefone;
			msg = msg + "\n Celular: " + Celular;
			msg = msg + "\n Referência: "+ Referencia;
			msg = msg + "\n Cidade: "+ Cidade.toString();
			msg = msg + "\n Estado: "+ Estado.toString();
		}
			
			
		int resposta = JOptionPane.showConfirmDialog(null, "São esses os dados para serem cadastrados? "+ msg,"Confirmação",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		if(resposta == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso ");
			t.limparTodosCampos(contentPanel);
			
		}	
		
		
	}
	
	
	public void verificaPessoa()
	{
		TipoPessoa = comboTipoPessoa.getSelectedItem();
		if(TipoPessoa.equals("Física"))
		{
			cpf.setEditable(true);
			rg.setEditable(true);
			trabalho.setEditable(true);
			cnpj.setEditable(false);
			insc.setEditable(false);
			
		}	
		else if(TipoPessoa.equals("Jurídica"))
		{
			cpf.setEditable(false);
			rg.setEditable(false);
			trabalho.setEditable(false);
			cnpj.setEditable(true);
			insc.setEditable(true);
			
		}
		else if(TipoPessoa.equals("..."))
		{
			
			cpf.setEditable(false);
			rg.setEditable(false);
			trabalho.setEditable(false);
			cnpj.setEditable(false);
			insc.setEditable(false);
		}	
	}
	

	
	public CadastraCliente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Projeto Java\\icones\\Icones Usados\\businessman_woman.png"));
		setResizable(false);
		setTitle("Clientes\r\n");
		setBounds(100, 100, 684, 512);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(220, 220, 220));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel label_1 = new JLabel("Nome:");
		label_1.setToolTipText("Nome");
		label_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		label_1.setBounds(50, 41, 89, 14);
		contentPanel.add(label_1);
		
		nome = new JTextField();
		nome.setToolTipText("Digite o nome");
		nome.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				limitaLetras(arg0);
			}
		});
		nome.setFont(new Font("Arial", Font.ITALIC, 14));
		nome.setColumns(10);
		nome.setBounds(99, 36, 529, 20);
		contentPanel.add(nome);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setToolTipText("Cadastro de Pessoa F\u00EDsica");
		lblCpf.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblCpf.setBounds(50, 75, 36, 14);
		contentPanel.add(lblCpf);
		
		try {
			cpf = new JFormattedTextField(new MaskFormatter(" ###.###.###-## "));
			cpf.setToolTipText("Digite o cpf");
		} catch (ParseException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		cpf.setEditable(false);
		cpf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char codigoTecla = e.getKeyChar();
				if(!(codigoTecla >= '0' && codigoTecla<= '9'))
					e.consume();
				if(cpf.getText().length() == 11)
					e.consume();
			}
		});
		cpf.setFont(new Font("Arial", Font.ITALIC, 14));
		cpf.setColumns(10);
		cpf.setBounds(86, 71, 106, 20);
		contentPanel.add(cpf);
		
		JLabel label_4 = new JLabel("RG:");
		label_4.setToolTipText("Registro Geral");
		label_4.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		label_4.setBounds(50, 109, 31, 14);
		contentPanel.add(label_4);
		
		rg = new JTextField();
		rg.setToolTipText("Digite o rg");
		rg.setEditable(false);
		rg.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(rg.getText().length() == 9)
					e.consume();
			}	
		});
		rg.setFont(new Font("Arial", Font.ITALIC, 14));
		rg.setColumns(10);
		rg.setBounds(86, 106, 106, 20);
		contentPanel.add(rg);
		
		JLabel label_5 = new JLabel("CEP:");
		label_5.setToolTipText("Cadastro de Endere\u00E7amento Postal");
		label_5.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		label_5.setBounds(50, 146, 36, 14);
		contentPanel.add(label_5);
		
		cep = new JTextField();
		cep.setToolTipText("Digite o cep");
		cep.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char codigo = e.getKeyChar();
				if(cep.getText().length() == 8)
					e.consume();
			}
		});
		cep.setFont(new Font("Arial", Font.ITALIC, 14));
		cep.setColumns(10);
		cep.setBounds(86, 143, 101, 20);
		contentPanel.add(cep);
		
		JLabel label_6 = new JLabel("Bairro:");
		label_6.setToolTipText("Bairro");
		label_6.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		label_6.setBounds(276, 146, 47, 14);
		contentPanel.add(label_6);
		
		bairro = new JTextField();
		bairro.setToolTipText("Digite o nome do bairro");
		bairro.setFont(new Font("Arial", Font.ITALIC, 14));
		bairro.setColumns(10);
		bairro.setBounds(333, 143, 295, 20);
		contentPanel.add(bairro);
		
		JLabel label_7 = new JLabel("Rua:");
		label_7.setToolTipText("Rua");
		label_7.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		label_7.setBounds(50, 181, 36, 14);
		contentPanel.add(label_7);
		
		rua = new JTextField();
		rua.setToolTipText("Digite o nome da rua");
		rua.setFont(new Font("Arial", Font.ITALIC, 14));
		rua.setColumns(10);
		rua.setBounds(86, 178, 353, 20);
		contentPanel.add(rua);
		
		JLabel label_8 = new JLabel("N\u00FAmero:");
		label_8.setToolTipText("N\u00FAmero");
		label_8.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		label_8.setBounds(479, 181, 57, 14);
		contentPanel.add(label_8);
		
		numero = new JTextField();
		numero.setToolTipText("Digite o n\u00FAmero do local");
		numero.setFont(new Font("Arial", Font.ITALIC, 14));
		numero.setColumns(10);
		numero.setBounds(546, 178, 82, 20);
		contentPanel.add(numero);
		
		JLabel label_9 = new JLabel("Complemento:");
		label_9.setToolTipText("Complemento");
		label_9.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		label_9.setBounds(50, 218, 101, 14);
		contentPanel.add(label_9);
		
		complemento = new JTextField();
		complemento.setToolTipText("Digite o complemento");
		complemento.setFont(new Font("Arial", Font.ITALIC, 14));
		complemento.setColumns(10);
		complemento.setBounds(161, 215, 373, 20);
		contentPanel.add(complemento);
		
		JLabel label_10 = new JLabel("E-mail:");
		label_10.setToolTipText("E-mail");
		label_10.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		label_10.setBounds(50, 330, 47, 14);
		contentPanel.add(label_10);
		
		JLabel lblTelefone = new JLabel("Telefone:\r\n");
		lblTelefone.setToolTipText("Telefone");
		lblTelefone.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblTelefone.setBounds(326, 293, 67, 14);
		contentPanel.add(lblTelefone);
		
		try {
			telefone = new JFormattedTextField(new MaskFormatter(" (##) ####-#### "));
		} catch (ParseException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		telefone.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(telefone.getText().length() == 9)
					e.consume();
			}
		});
		telefone.setToolTipText("Digite o n\u00FAmero de telefone");
		telefone.setFont(new Font("Arial", Font.ITALIC, 14));
		telefone.setColumns(10);
		telefone.setBounds(403, 290, 124, 20);
		contentPanel.add(telefone);
		
		JLabel lblReferncia = new JLabel("Refer\u00EAncia:");
		lblReferncia.setToolTipText("Refer\u00EAncia");
		lblReferncia.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblReferncia.setBounds(50, 255, 79, 14);
		contentPanel.add(lblReferncia);
		
		referencia = new JTextField();
		referencia.setToolTipText("Digite o nome de um local de refer\u00EAncia");
		referencia.setFont(new Font("Arial", Font.ITALIC, 14));
		referencia.setColumns(10);
		referencia.setBounds(140, 252, 488, 20);
		contentPanel.add(referencia);
		
		email = new JTextField();
		email.setToolTipText("Digite o e-mail");
		email.setFont(new Font("Arial", Font.ITALIC, 14));
		email.setColumns(10);
		email.setBounds(117, 325, 511, 20);
		contentPanel.add(email);
		
		JLabel lblLocalDeTrabalho = new JLabel("Local de Trabalho:");
		lblLocalDeTrabalho.setToolTipText("Local de Trabalho");
		lblLocalDeTrabalho.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblLocalDeTrabalho.setBounds(50, 364, 133, 14);
		contentPanel.add(lblLocalDeTrabalho);
		
		trabalho = new JTextField();
		trabalho.setToolTipText("Digite o local de trabalho");
		trabalho.setEditable(false);
		trabalho.setFont(new Font("Arial", Font.ITALIC, 14));
		trabalho.setColumns(10);
		trabalho.setBounds(191, 361, 437, 20);
		contentPanel.add(trabalho);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setToolTipText("Cadastrar Dados");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TipoPessoa = comboTipoPessoa.getSelectedItem();
				if(!(TipoPessoa.equals("...")))
				{	cadastraCliente();
					mostraCadastro();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Não foi selecionado um tipo de pessoa. Por favor selecione um tipo de pessoa!");
					
				}	
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBounds(117, 450, 140, 23);
		contentPanel.add(btnNewButton);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setToolTipText("Limpar Campos");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.limparTodosCampos(contentPanel);
			}
		});
		btnLimpar.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		btnLimpar.setBounds(419, 450, 140, 23);
		contentPanel.add(btnLimpar);
		
		JLabel lblCidade = new JLabel("Cidade:\r\n");
		lblCidade.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblCidade.setBounds(50, 401, 57, 14);
		contentPanel.add(lblCidade);
		
		JLabel lblEstado = new JLabel("Estado:\r\n");
		lblEstado.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblEstado.setBounds(386, 401, 57, 14);
		contentPanel.add(lblEstado);
		
		comboCidade = new JComboBox();
		comboCidade.setToolTipText("Selecione a cidade");
		comboCidade.setFont(new Font("Arial", Font.PLAIN, 14));
		comboCidade.setModel(new DefaultComboBoxModel(new String[] {"Umuarama","Londrina","Maringá","Serra dos Dourados","Cafezal do Sul","Paranavaí","Cidade Gaúcha","Toledo"}));
		comboCidade.setBounds(107, 398, 177, 20);
		contentPanel.add(comboCidade);
		
		comboEstado = new JComboBox();
		comboEstado.setToolTipText("Selecione o estado");
		comboEstado.setModel(new DefaultComboBoxModel(new String[] {"Paran\u00E1"}));
		comboEstado.setFont(new Font("Arial", Font.PLAIN, 14));
		comboEstado.setBounds(453, 398, 175, 20);
		contentPanel.add(comboEstado);
		
		JLabel lblTipoDePessoa = new JLabel("Tipo de Pessoa:");
		lblTipoDePessoa.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblTipoDePessoa.setToolTipText("Tipo de Pessoa");
		lblTipoDePessoa.setBounds(410, 11, 105, 14);
		contentPanel.add(lblTipoDePessoa);
		
		comboTipoPessoa = new JComboBox();
		comboTipoPessoa.setToolTipText("Selecione o tipo de pessoa");
		comboTipoPessoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				verificaPessoa();
			}
		});
		comboTipoPessoa.setFont(new Font("Arial", Font.ITALIC, 12));
		comboTipoPessoa.setModel(new DefaultComboBoxModel(new String[] {"...", "F\u00EDsica", "Jur\u00EDdica"}));
		comboTipoPessoa.setBounds(525, 8, 94, 20);
		contentPanel.add(comboTipoPessoa);
		
		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setToolTipText("Cadastro Nacional de Pessoa Jur\u00EDdica");
		lblCnpj.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblCnpj.setBounds(289, 75, 45, 14);
		contentPanel.add(lblCnpj);
		
		JLabel lblInsce = new JLabel("Insc.E:");
		lblInsce.setToolTipText("Inscri\u00E7\u00E3o Estadual");
		lblInsce.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblInsce.setBounds(289, 109, 48, 14);
		contentPanel.add(lblInsce);
		
		try {
			cnpj = new JFormattedTextField(new MaskFormatter(" ##.###.###/####-## "));
			cnpj.setToolTipText("Digite o cnpj");
		} catch (ParseException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		cnpj.setEditable(false);
		cnpj.setFont(new Font("Arial", Font.ITALIC, 14));
		cnpj.setColumns(10);
		cnpj.setBounds(344, 72, 138, 20);
		contentPanel.add(cnpj);
		
		insc = new JTextField();
		insc.setToolTipText("Digite a inscri\u00E7\u00E3o estadual");
		insc.setEditable(false);
		insc.setFont(new Font("Arial", Font.ITALIC, 14));
		insc.setColumns(10);
		insc.setBounds(344, 106, 138, 20);
		contentPanel.add(insc);
		
		try {
			celular = new JFormattedTextField(new MaskFormatter(" (##) #####-####"));
		} catch (ParseException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		celular.setToolTipText("Digite o n\u00FAmero de celular");
		celular.setFont(new Font("Arial", Font.ITALIC, 14));
		celular.setColumns(10);
		celular.setBounds(117, 290, 124, 20);
		contentPanel.add(celular);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setToolTipText("Celular");
		lblCelular.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblCelular.setBounds(50, 293, 57, 14);
		contentPanel.add(lblCelular);
		
		JLabel lblNewLabel = new JLabel("D.Nascimento:");
		lblNewLabel.setToolTipText("Data de Nascimento");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(527, 76, 101, 13);
		contentPanel.add(lblNewLabel);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		try {
			datanascimento = new JFormattedTextField(new MaskFormatter(" ##/##/#### "));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		datanascimento.setToolTipText("Digite a Data de Nascimento\r\n");
		datanascimento.setFont(new Font("Arial", Font.ITALIC, 14));
		datanascimento.setBounds(525, 106, 94, 20);
		contentPanel.add(datanascimento);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("F:\\Projeto Java\\icones\\Icones Usados\\iconecelular.png"));
		lblNewLabel_1.setBounds(15, 290, 20, 20);
		contentPanel.add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("F:\\Projeto Java\\icones\\Icones Usados\\iconetelefone.png"));
		label.setBounds(300, 290, 20, 20);
		contentPanel.add(label);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("F:\\Projeto Java\\icones\\Icones Usados\\iconetrabalho.png"));
		label_2.setBounds(15, 362, 20, 20);
		contentPanel.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("F:\\Projeto Java\\icones\\Icones Usados\\iconecidade.png"));
		label_3.setBounds(15, 399, 20, 20);
		contentPanel.add(label_3);
		
		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon("F:\\Projeto Java\\icones\\Icones Usados\\iconeestados.png"));
		label_11.setBounds(356, 399, 20, 20);
		contentPanel.add(label_11);
		
		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon("F:\\Projeto Java\\icones\\Icones Usados\\iconeemail.png"));
		label_12.setBounds(15, 330, 24, 20);
		contentPanel.add(label_12);
		
		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon("F:\\Projeto Java\\icones\\Icones Usados\\iconereferencia.png"));
		label_13.setBounds(15, 251, 20, 20);
		contentPanel.add(label_13);
		
		JLabel label_14 = new JLabel("");
		label_14.setIcon(new ImageIcon("F:\\Projeto Java\\icones\\Icones Usados\\iconeruas.png"));
		label_14.setBounds(10, 180, 32, 20);
		contentPanel.add(label_14);
		
		JLabel label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon("F:\\Projeto Java\\icones\\Icones Usados\\iconecpf.png"));
		label_15.setBounds(9, 73, 32, 20);
		contentPanel.add(label_15);
		
		JLabel label_16 = new JLabel("");
		label_16.setIcon(new ImageIcon("F:\\Projeto Java\\icones\\Icones Usados\\iconecep.png"));
		label_16.setBounds(15, 145, 20, 20);
		contentPanel.add(label_16);
		
		JLabel label_17 = new JLabel("");
		label_17.setIcon(new ImageIcon("F:\\Projeto Java\\icones\\Icones Usados\\iconerg.png"));
		label_17.setBounds(15, 107, 20, 20);
		contentPanel.add(label_17);
		
		JLabel label_18 = new JLabel("");
		label_18.setIcon(new ImageIcon("F:\\Projeto Java\\icones\\Icones Usados\\iconenome.png"));
		label_18.setBounds(15, 36, 20, 20);
		contentPanel.add(label_18);
		
		JLabel label_19 = new JLabel("");
		label_19.setIcon(new ImageIcon("F:\\Projeto Java\\icones\\Icones Usados\\iconecnpj.gif"));
		label_19.setBounds(255, 71, 20, 20);
		contentPanel.add(label_19);
		
		JLabel label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon("F:\\Projeto Java\\icones\\Icones Usados\\iconeinscricaoestadual.png"));
		label_20.setBounds(255, 106, 20, 20);
		contentPanel.add(label_20);
		
		JLabel label_21 = new JLabel("");
		label_21.setIcon(new ImageIcon("F:\\Projeto Java\\icones\\Icones Usados\\iconebairro.png"));
		label_21.setBounds(237, 144, 28, 20);
		contentPanel.add(label_21);
		
		JLabel label_22 = new JLabel("");
		label_22.setIcon(new ImageIcon("F:\\Projeto Java\\icones\\Icones Usados\\iconecomplemento.png"));
		label_22.setBounds(15, 215, 20, 20);
		contentPanel.add(label_22);
		
		JLabel label_23 = new JLabel("");
		label_23.setIcon(new ImageIcon("F:\\Projeto Java\\icones\\Icones Usados\\iconedatanascimento.png"));
		label_23.setBounds(497, 73, 20, 20);
		contentPanel.add(label_23);
		
		JLabel label_24 = new JLabel("");
		label_24.setIcon(new ImageIcon("F:\\Projeto Java\\icones\\Icones Usados\\iconetipopessoa.png"));
		label_24.setBounds(377, 9, 20, 20);
		contentPanel.add(label_24);
	}
}
