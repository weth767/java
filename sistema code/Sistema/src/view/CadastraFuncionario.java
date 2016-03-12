package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class CadastraFuncionario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField dataNasc;
	private JTextField salarioini;
	private JTextField bairro;
	private JTextField numero;
	private JTextField nome;
	private JTextField cpf;
	private JTextField rg;
	private JTextField dataCont;
	private JTextField numreg;
	private JTextField cep;
	private JTextField rua;
	private JTextField referencia;
	String Nome,Cpf,Rg,Cep,Rua,Referencia,NumReg,Numero,Bairro,DataCont,SalarioIni,DataNasc,Telefone,Celular,Email;
	private JComboBox comboSexo;
	Object sexo,funcao,cidade,estado;
	Telaprincipal t = new Telaprincipal();
	private JTextField telefone;
	private JTextField celular;
	private JTextField email;
	private JComboBox comboFuncao;
	private JComboBox comboEstado;
	private JComboBox comboCidade;

	
	
	public void cadastraFuncionario()
	{
		Nome = nome.getText();
		sexo = comboSexo.getSelectedItem();
		Cpf = cpf.getText();
		Rg = rg.getText();
		DataNasc = dataNasc.getText();
		funcao = comboFuncao.getSelectedItem();
		NumReg = numreg.getText();
		SalarioIni = salarioini.getText();
		DataCont = dataCont.getText();
		Cep = cep.getText();
		Bairro = bairro.getText();
		Rua = rua.getText();
		Numero = numero.getText();
		Referencia = referencia.getText();
		Telefone = telefone.getText();
		Celular = celular.getText();
		Email = email.getText();
		cidade = comboCidade.getSelectedItem();
		estado = comboEstado.getSelectedItem();
		
		
	}
	
	public void mostraCadastro()
	{	
		String msg = "\nNome: " + Nome ;
		msg += "\nSexo: " + sexo.toString();
		msg += "\nCPF: " + Cpf;
		msg += "\nRG: " + Rg;
		msg += "\nData de Nascimento: " + DataNasc;
		msg += "\nFunção: " + funcao.toString();
		msg += "\nNúmero de Registro: " + NumReg;
		msg += "\nSalário Inicial: " + SalarioIni;
		msg += "\nData de Contratação: " + DataCont;
		msg += "\nCEP: " + Cep ;
		msg += "\nBairro: " + Bairro;
		msg += "\nRua: " + Rua;
		msg += "\nNúmero: " + Numero;
		msg += "\nReferência: " + Referencia;
		msg += "\nTelefone: " + Telefone;
		msg += "\nCelular: " + Celular;
		msg += "\nE-mail: " + Email;
		msg += "\nCidade: " + cidade.toString();
		msg += "\nEstado: " + estado.toString();
		
		int resposta = JOptionPane.showConfirmDialog(null, "São esses os dados para serem cadastrados? "+ msg,"Confirmação",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		if(resposta == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso ");
			t.limparTodosCampos(contentPanel);
			
		}	
		
		
	}
	
	public CadastraFuncionario() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Projeto Java\\icones\\Icones Usados\\iconefuncionario.png"));
		setResizable(false);
		setTitle("Funcion\u00E1rios\r\n");
		setBounds(100, 100, 597, 562);
		getContentPane().setLayout(null);
		contentPanel.setBackground(new Color(220, 220, 220));
		contentPanel.setBounds(0, 0, 591, 554);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel lblNomeDoFuncionrio = new JLabel("Nome:");
		lblNomeDoFuncionrio.setToolTipText("Nome ");
		lblNomeDoFuncionrio.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblNomeDoFuncionrio.setBounds(62, 36, 42, 14);
		contentPanel.add(lblNomeDoFuncionrio);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setToolTipText("Cadastro de Pessoa F\u00EDsica");
		lblCpf.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblCpf.setBounds(62, 74, 32, 14);
		contentPanel.add(lblCpf);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setToolTipText("Registro Geral");
		lblRg.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblRg.setBounds(64, 113, 26, 14);
		contentPanel.add(lblRg);
		
		JLabel lblN = new JLabel("N\u00BA Registro:");
		lblN.setToolTipText("N\u00FAmero de Registro");
		lblN.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblN.setBounds(62, 154, 85, 14);
		contentPanel.add(lblN);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setToolTipText("Bairro");
		lblBairro.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblBairro.setBounds(284, 231, 50, 14);
		contentPanel.add(lblBairro);
		
		JLabel lblRua = new JLabel("Rua:");
		lblRua.setToolTipText("Nome da Rua");
		lblRua.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblRua.setBounds(64, 271, 33, 14);
		contentPanel.add(lblRua);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setToolTipText("Cadastro de Endere\u00E7amento Postal");
		lblCep.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblCep.setBounds(62, 231, 35, 14);
		contentPanel.add(lblCep);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setToolTipText("N\u00FAmero");
		lblNmero.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblNmero.setBounds(389, 271, 59, 14);
		contentPanel.add(lblNmero);
		
		JLabel lblRefrencia = new JLabel("Refer\u00EAncia:");
		lblRefrencia.setToolTipText("Refer\u00EAncia");
		lblRefrencia.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblRefrencia.setBounds(62, 310, 85, 14);
		contentPanel.add(lblRefrencia);
		
		JLabel lblDataDeContratao = new JLabel("D.Contrata\u00E7\u00E3o:");
		lblDataDeContratao.setToolTipText("Data de Contrata\u00E7\u00E3o");
		lblDataDeContratao.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblDataDeContratao.setBounds(327, 195, 104, 14);
		contentPanel.add(lblDataDeContratao);
		
		JLabel lblSalrioInicial = new JLabel("Sal\u00E1rio Inicial:");
		lblSalrioInicial.setToolTipText("Sal\u00E1rio Inicial");
		lblSalrioInicial.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblSalrioInicial.setBounds(62, 195, 96, 14);
		contentPanel.add(lblSalrioInicial);
		
		JLabel lblDataDeN = new JLabel("D.Nascimento:");
		lblDataDeN.setToolTipText("Data de Nascimento");
		lblDataDeN.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblDataDeN.setBounds(327, 113, 104, 14);
		contentPanel.add(lblDataDeN);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setToolTipText("Sexo");
		lblSexo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblSexo.setBounds(376, 74, 42, 14);
		contentPanel.add(lblSexo);
		
		comboSexo = new JComboBox();
		comboSexo.setToolTipText("Selecione o sexo");
		comboSexo.setFont(new Font("Arial", Font.PLAIN, 14));
		comboSexo.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino"}));
		comboSexo.setBounds(441, 70, 96, 23);
		contentPanel.add(comboSexo);
		
		JLabel lblFuno = new JLabel("Fun\u00E7\u00E3o:");
		lblFuno.setToolTipText("Fun\u00E7\u00E3o");
		lblFuno.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblFuno.setBounds(343, 154, 59, 14);
		contentPanel.add(lblFuno);
		
		try {
			dataNasc = new JFormattedTextField(new MaskFormatter(" ##/##/#### "));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dataNasc.setToolTipText("Digite a data de nascimento");
		dataNasc.setFont(new Font("Arial", Font.ITALIC, 14));
		dataNasc.setBounds(441, 110, 96, 20);
		contentPanel.add(dataNasc);
		dataNasc.setColumns(10);
		
		try {
			salarioini = new JFormattedTextField(new MaskFormatter(" R$ ##.###,##"));
		} catch (ParseException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		salarioini.setToolTipText("Digite o sal\u00E1rio inicial");
		salarioini.setFont(new Font("Arial", Font.ITALIC, 14));
		salarioini.setBounds(168, 191, 96, 20);
		contentPanel.add(salarioini);
		salarioini.setColumns(10);
		
		bairro = new JTextField();
		bairro.setToolTipText("Digite o nome do bairro");
		bairro.setFont(new Font("Arial", Font.ITALIC, 14));
		bairro.setBounds(335, 228, 202, 20);
		contentPanel.add(bairro);
		bairro.setColumns(10);
		
		numero = new JTextField();
		numero.setToolTipText("Digite o n\u00FAmero");
		numero.setFont(new Font("Arial", Font.ITALIC, 14));
		numero.setColumns(10);
		numero.setBounds(452, 268, 85, 20);
		contentPanel.add(numero);
		
		nome = new JTextField();
		nome.setToolTipText("Digite o nome");
		nome.setFont(new Font("Arial", Font.ITALIC, 14));
		nome.setColumns(10);
		nome.setBounds(106, 33, 431, 20);
		contentPanel.add(nome);
		
		try {
			cpf = new JFormattedTextField(new MaskFormatter(" ###.###.###-## "));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		cpf.setToolTipText("Digite o cpf");
		cpf.setFont(new Font("Arial", Font.ITALIC, 14));
		cpf.setColumns(10);
		cpf.setBounds(104, 71, 134, 20);
		contentPanel.add(cpf);
		
		rg = new JTextField();
		rg.setToolTipText("Digite o rg");
		rg.setFont(new Font("Arial", Font.ITALIC, 14));
		rg.setColumns(10);
		rg.setBounds(104, 109, 134, 21);
		contentPanel.add(rg);
		
		try {
			dataCont = new JFormattedTextField(new MaskFormatter(" ##/##/#### "));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dataCont.setToolTipText("Digite a data de contrata\u00E7\u00E3o");
		dataCont.setFont(new Font("Arial", Font.ITALIC, 14));
		dataCont.setColumns(10);
		dataCont.setBounds(433, 192, 104, 20);
		contentPanel.add(dataCont);
		
		numreg = new JTextField();
		numreg.setToolTipText("Digite o n\u00FAmero de registro");
		numreg.setFont(new Font("Arial", Font.ITALIC, 14));
		numreg.setColumns(10);
		numreg.setBounds(148, 150, 113, 20);
		contentPanel.add(numreg);
		
		try {
			cep = new JFormattedTextField(new MaskFormatter(" #####-### "));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cep.setToolTipText("Digite o cep");
		cep.setFont(new Font("Arial", Font.ITALIC, 14));
		cep.setColumns(10);
		cep.setBounds(107, 228, 111, 20);
		contentPanel.add(cep);
		
		rua = new JTextField();
		rua.setToolTipText("Digite o nome da rua");
		rua.setFont(new Font("Arial", Font.ITALIC, 14));
		rua.setColumns(10);
		rua.setBounds(107, 268, 272, 20);
		contentPanel.add(rua);
		
		referencia = new JTextField();
		referencia.setToolTipText("Digite um local de refer\u00EAncia");
		referencia.setFont(new Font("Arial", Font.ITALIC, 14));
		referencia.setColumns(10);
		referencia.setBounds(153, 307, 384, 20);
		contentPanel.add(referencia);
		
		comboFuncao = new JComboBox();
		comboFuncao.setToolTipText("Selecione a fun\u00E7\u00E3o");
		comboFuncao.setModel(new DefaultComboBoxModel(new String[] {"Vendedor(a)", "Administrativo", "Cont\u00E1bil", "Caixa", "Seguran\u00E7a", "Faxineiro(a)", "Gerente", "Encarregado", "Repositor", ""}));
		comboFuncao.setMaximumRowCount(15);
		comboFuncao.setFont(new Font("Arial", Font.ITALIC, 14));
		comboFuncao.setBounds(410, 151, 127, 20);
		contentPanel.add(comboFuncao);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setToolTipText("Telefone");
		lblTelefone.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblTelefone.setBounds(62, 350, 64, 14);
		contentPanel.add(lblTelefone);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setToolTipText("Celular");
		lblCelular.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblCelular.setBounds(343, 350, 56, 14);
		contentPanel.add(lblCelular);
		
		try {
			telefone = new JFormattedTextField(new MaskFormatter(" (##) ####-#### "));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		telefone.setToolTipText("Digite o n\u00FAmero de telefone");
		telefone.setFont(new Font("Arial", Font.ITALIC, 14));
		telefone.setBounds(136, 347, 108, 20);
		contentPanel.add(telefone);
		telefone.setColumns(10);
		
		try {
			celular = new JFormattedTextField(new MaskFormatter(" (##) #####-#### "));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		celular.setToolTipText("Digite o n\u00FAmero de celular");
		celular.setFont(new Font("Arial", Font.ITALIC, 14));
		celular.setColumns(10);
		celular.setBounds(410, 347, 127, 20);
		contentPanel.add(celular);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setToolTipText("Cidade");
		lblCidade.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblCidade.setBounds(62, 434, 51, 14);
		contentPanel.add(lblCidade);
		
		comboCidade = new JComboBox();
		comboCidade.setToolTipText("Selecione a cidade");
		comboCidade.setModel(new DefaultComboBoxModel(new String[] {"Umuarama", "Maring\u00E1", "Cianorte", "Cascavel", "Cruzeiro do Oeste", "Cafezal do Sul", "Toledo", "Londrina", "Curitiba", "Perobal", "P\u00E9rola", "Paranava\u00ED"}));
		comboCidade.setMaximumRowCount(5000);
		comboCidade.setFont(new Font("Arial", Font.ITALIC, 12));
		comboCidade.setBounds(122, 430, 148, 20);
		contentPanel.add(comboCidade);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setToolTipText("Estado");
		lblEstado.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblEstado.setBounds(315, 434, 51, 14);
		contentPanel.add(lblEstado);
		
		comboEstado = new JComboBox();
		comboEstado.setToolTipText("Selecione o estado");
		comboEstado.setModel(new DefaultComboBoxModel(new String[] {"Paran\u00E1", "Mato Grosso do Sul", "Santa Catarina", "Rio Grande do Sul", "Mato Grosso", "Go\u00EDas", "Minas Gerais", "S\u00E3o Paulo", "Rio de Janeiro", "Esp\u00EDrito Santo", "D\u00EDstrito Federal"}));
		comboEstado.setMaximumRowCount(26);
		comboEstado.setFont(new Font("Arial", Font.ITALIC, 12));
		comboEstado.setBounds(376, 431, 161, 20);
		contentPanel.add(comboEstado);
		
		JButton Cadastrar = new JButton("Cadastrar");
		Cadastrar.setToolTipText("Cadastrar Dados");
		Cadastrar.setBounds(106, 496, 127, 23);
		contentPanel.add(Cadastrar);
		Cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cadastraFuncionario();
				if(!(Nome.equals("") || Cpf.equals("")|| Rg.equals("")|| NumReg.equals("")))
				{		
						mostraCadastro();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Não foi póssivel cadastrar, alguns campos estão vazios, por favor insira dados em todos os campos!");
					
				}	
			}
		});
		Cadastrar.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		
		JButton Limpar = new JButton("Limpar");
		Limpar.setToolTipText("Limpar Campos");
		Limpar.setBounds(379, 496, 127, 23);
		contentPanel.add(Limpar);
		Limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				t.limparTodosCampos(contentPanel);
			}
		});
		Limpar.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setToolTipText("E-mail");
		lblEmail.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblEmail.setBounds(62, 391, 49, 14);
		contentPanel.add(lblEmail);
		
		email = new JTextField();
		email.setToolTipText("Digite o e-mail");
		email.setFont(new Font("Arial", Font.ITALIC, 14));
		email.setColumns(10);
		email.setBounds(122, 388, 415, 20);
		contentPanel.add(email);
	}
}
