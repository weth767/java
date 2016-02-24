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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastraFuncionario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField funcao;
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
	String Nome,Cpf,Rg,Cep,Rua,Referencia,NumReg,Numero,Bairro,DataCont,SalarioIni,Funcao,DataNasc;
	private JComboBox comboBox;
	Object sexo;
	Telaprincipal t = new Telaprincipal();
	/**
	 * Launch the application.
	 */
	
	
	public void cadastraFuncionario()
	{
		Nome = nome.getText();
		Funcao = funcao.getText();
		DataNasc = dataNasc.getText();
		SalarioIni = salarioini.getText();
		Bairro = bairro.getText();
		Numero = numero.getText();
		Cpf = cpf.getText();
		Rg = rg.getText();
		DataCont = dataCont.getText();
		NumReg = numreg.getText();
		Cep = cep.getText();
		Rua = rua.getText();
		Referencia = referencia.getText();
		sexo = comboBox.getSelectedItem();
		
	}
	
	public void mostraCadastro()
	{	
		String msg = "\nNome: " + Nome ;
		msg += "\nCPF: " + Cpf;
		msg += "\nRG: " + Rg;
		msg += "\nData de Nascimento: " + DataNasc;
		msg += "\nSexo: " + sexo.toString();
		msg += "\nData de Contratação: " + DataCont;
		msg += "\nFunção: " + Funcao; 
		msg += "\nNúmero de Registro: " + NumReg;
		msg += "\nSalário Inicial: " + SalarioIni;
		msg += "\nCEP: " + Cep ;
		msg += "\nBairro: " + Bairro;
		msg += "\nRua: " + Rua;
		msg += "\nNúmero: " + Numero;
		msg += "\nReferência: " + Referencia;
		
		int resposta = JOptionPane.showConfirmDialog(null, "São esses os dados para serem cadastrados? "+ msg,"Confirmação",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		if(resposta == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso ");
			t.limparTodosCampos(contentPanel);
			
		}	
		
		
	}
	
	public CadastraFuncionario() {
		setBounds(100, 100, 749, 513);
		getContentPane().setLayout(null);
		contentPanel.setBackground(new Color(220, 220, 220));
		contentPanel.setBounds(0, 0, 733, 475);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel lblCadastroDeFuncionrios = new JLabel("Cadastro de Funcion\u00E1rios");
		lblCadastroDeFuncionrios.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 27));
		lblCadastroDeFuncionrios.setBounds(169, 27, 338, 23);
		contentPanel.add(lblCadastroDeFuncionrios);
		
		JLabel lblNomeDoFuncionrio = new JLabel("Nome:");
		lblNomeDoFuncionrio.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblNomeDoFuncionrio.setBounds(10, 92, 59, 14);
		contentPanel.add(lblNomeDoFuncionrio);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblCpf.setBounds(10, 134, 50, 14);
		contentPanel.add(lblCpf);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblRg.setBounds(10, 175, 40, 14);
		contentPanel.add(lblRg);
		
		JLabel lblN = new JLabel("N\u00FAmero de Registro:");
		lblN.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblN.setBounds(10, 214, 178, 21);
		contentPanel.add(lblN);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblBairro.setBounds(380, 260, 59, 14);
		contentPanel.add(lblBairro);
		
		JLabel lblRua = new JLabel("Rua:");
		lblRua.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblRua.setBounds(10, 301, 40, 14);
		contentPanel.add(lblRua);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblCep.setBounds(10, 260, 50, 14);
		contentPanel.add(lblCep);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblNmero.setBounds(380, 301, 74, 14);
		contentPanel.add(lblNmero);
		
		JLabel lblRefrencia = new JLabel("Ref\u00EArencia:");
		lblRefrencia.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblRefrencia.setBounds(10, 340, 104, 14);
		contentPanel.add(lblRefrencia);
		
		JLabel lblDataDeContratao = new JLabel("Data de Contrata\u00E7\u00E3o:");
		lblDataDeContratao.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblDataDeContratao.setBounds(374, 340, 191, 14);
		contentPanel.add(lblDataDeContratao);
		
		JLabel lblSalrioInicial = new JLabel("Sal\u00E1rio Inicial:");
		lblSalrioInicial.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblSalrioInicial.setBounds(380, 214, 127, 14);
		contentPanel.add(lblSalrioInicial);
		
		JLabel lblDataDeN = new JLabel("Data de Nascimento:");
		lblDataDeN.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblDataDeN.setBounds(380, 134, 185, 14);
		contentPanel.add(lblDataDeN);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblSexo.setBounds(515, 92, 50, 14);
		contentPanel.add(lblSexo);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino"}));
		comboBox.setBounds(575, 86, 114, 23);
		contentPanel.add(comboBox);
		
		JLabel lblFuno = new JLabel("Fun\u00E7\u00E3o:");
		lblFuno.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblFuno.setBounds(380, 177, 85, 14);
		contentPanel.add(lblFuno);
		
		funcao = new JTextField();
		funcao.setFont(new Font("Arial", Font.ITALIC, 18));
		funcao.setBounds(460, 174, 203, 20);
		contentPanel.add(funcao);
		funcao.setColumns(10);
		
		dataNasc = new JTextField();
		dataNasc.setFont(new Font("Arial", Font.ITALIC, 18));
		dataNasc.setBounds(559, 133, 104, 20);
		contentPanel.add(dataNasc);
		dataNasc.setColumns(10);
		
		salarioini = new JTextField();
		salarioini.setFont(new Font("Arial", Font.ITALIC, 18));
		salarioini.setBounds(508, 214, 155, 20);
		contentPanel.add(salarioini);
		salarioini.setColumns(10);
		
		bairro = new JTextField();
		bairro.setFont(new Font("Arial", Font.ITALIC, 18));
		bairro.setBounds(449, 259, 214, 20);
		contentPanel.add(bairro);
		bairro.setColumns(10);
		
		numero = new JTextField();
		numero.setFont(new Font("Arial", Font.ITALIC, 18));
		numero.setColumns(10);
		numero.setBounds(464, 300, 104, 20);
		contentPanel.add(numero);
		
		nome = new JTextField();
		nome.setFont(new Font("Arial", Font.ITALIC, 18));
		nome.setColumns(10);
		nome.setBounds(70, 91, 433, 20);
		contentPanel.add(nome);
		
		cpf = new JTextField();
		cpf.setFont(new Font("Arial", Font.ITALIC, 18));
		cpf.setColumns(10);
		cpf.setBounds(70, 133, 258, 20);
		contentPanel.add(cpf);
		
		rg = new JTextField();
		rg.setFont(new Font("Arial", Font.ITALIC, 18));
		rg.setColumns(10);
		rg.setBounds(70, 174, 258, 21);
		contentPanel.add(rg);
		
		dataCont = new JTextField();
		dataCont.setFont(new Font("Arial", Font.ITALIC, 18));
		dataCont.setColumns(10);
		dataCont.setBounds(559, 339, 104, 20);
		contentPanel.add(dataCont);
		
		numreg = new JTextField();
		numreg.setFont(new Font("Arial", Font.ITALIC, 18));
		numreg.setColumns(10);
		numreg.setBounds(198, 216, 155, 20);
		contentPanel.add(numreg);
		
		cep = new JTextField();
		cep.setFont(new Font("Arial", Font.ITALIC, 18));
		cep.setColumns(10);
		cep.setBounds(70, 259, 155, 20);
		contentPanel.add(cep);
		
		rua = new JTextField();
		rua.setFont(new Font("Arial", Font.ITALIC, 18));
		rua.setColumns(10);
		rua.setBounds(70, 300, 283, 20);
		contentPanel.add(rua);
		
		referencia = new JTextField();
		referencia.setFont(new Font("Arial", Font.ITALIC, 18));
		referencia.setColumns(10);
		referencia.setBounds(116, 339, 237, 20);
		contentPanel.add(referencia);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cadastraFuncionario();
				mostraCadastro();
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setBounds(169, 425, 127, 23);
		contentPanel.add(btnNewButton);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				t.limparTodosCampos(contentPanel);
			}
		});
		btnLimpar.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		btnLimpar.setBounds(398, 427, 127, 23);
		contentPanel.add(btnLimpar);
	}
}
