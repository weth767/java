package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class Funcionario extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Funcionario dialog = new Funcionario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Funcionario() {
		setBounds(100, 100, 749, 513);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 733, 475);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel lblCadastroDeFuncionrios = new JLabel("Cadastro de Funcion\u00E1rios");
		lblCadastroDeFuncionrios.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 27));
		lblCadastroDeFuncionrios.setBounds(169, 11, 338, 21);
		contentPanel.add(lblCadastroDeFuncionrios);
		
		JLabel lblNomeDoFuncionrio = new JLabel("Nome do Funcion\u00E1rio:");
		lblNomeDoFuncionrio.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblNomeDoFuncionrio.setBounds(10, 92, 199, 14);
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
		lblN.setBounds(10, 214, 178, 14);
		contentPanel.add(lblN);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblBairro.setBounds(397, 260, 59, 14);
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
		lblNmero.setBounds(397, 301, 74, 14);
		contentPanel.add(lblNmero);
		
		JLabel lblRefrencia = new JLabel("Ref\u00EArencia:");
		lblRefrencia.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblRefrencia.setBounds(10, 340, 104, 14);
		contentPanel.add(lblRefrencia);
		
		JLabel lblDataDeContratao = new JLabel("Data de Contrata\u00E7\u00E3o:");
		lblDataDeContratao.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblDataDeContratao.setBounds(10, 383, 191, 14);
		contentPanel.add(lblDataDeContratao);
		
		JLabel lblSalrioInicial = new JLabel("Sal\u00E1rio Inicial:");
		lblSalrioInicial.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblSalrioInicial.setBounds(380, 214, 127, 14);
		contentPanel.add(lblSalrioInicial);
		
		JLabel lblDataDeN = new JLabel("Data de Nascimento:");
		lblDataDeN.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblDataDeN.setBounds(407, 94, 185, 14);
		contentPanel.add(lblDataDeN);
	}
}
