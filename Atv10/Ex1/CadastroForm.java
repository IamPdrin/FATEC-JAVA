package projeto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroForm extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtCpf;
	private JTextField txtDataNasc;
	private ButtonGroup grupoBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroForm frame = new CadastroForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public class Answers {
		protected String nome;
		protected long idade;
		protected String email;
		protected long telefone;
		protected long cpf;
		protected String dataNasc;
		protected String sexo;
		
		public Answers(String nome, long idade, String email, long telefone, long cpf, String dataNasc, String sexo) {
			this.nome = nome;
			this.idade = idade;
			this.email = email;
			this.telefone = telefone;
			this.cpf = cpf;
			this.dataNasc = dataNasc;
			this.sexo = sexo;
		}
		
		public String getNome() {
			return nome;
		}
		
		public long getIdade() {
			return idade;
		}
		
		public String getEmail() {
			return email;
		}
		
		public long getTelefone() {
			return telefone;
		}
		
		public long getCpf() {
			return cpf;
		}
		
		public String getDataNasc() {
			return dataNasc;
		}
		
		public String getSexo() {
			return sexo;
		}
		
		
	}
	/**
	 * Create the frame.
	 */
	public CadastroForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);		
		
		JLabel lblNewLabel = new JLabel("Formulario de Cadastro");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(121, 0, 183, 33);
		contentPane.add(lblNewLabel);
		
		
		//Name:
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(10, 39, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 55, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		
		//Age:
		JLabel lblNewLabel_2 = new JLabel("Idade");
		lblNewLabel_2.setBounds(10, 84, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(10, 99, 86, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
		
		
		//Sex:
		JLabel lblNewLabel_3 = new JLabel("Sexo");
		lblNewLabel_3.setBounds(121, 143, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JRadioButton btnFeminino = new JRadioButton("Feminino");
		btnFeminino.setBounds(121, 164, 99, 23);
		contentPane.add(btnFeminino);
		
		JRadioButton btnMasculino = new JRadioButton("Masculino");
		btnMasculino.setBounds(232, 164, 96, 23);
		contentPane.add(btnMasculino);
		
		grupoBtn = new ButtonGroup();
		grupoBtn.add(btnFeminino);
		grupoBtn.add(btnMasculino);
		
		
		//Email:
		JLabel lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setBounds(165, 39, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(165, 55, 86, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		
		//Number:
		JLabel lblNewLabel_5 = new JLabel("Telefone");
		lblNewLabel_5.setBounds(165, 84, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(165, 99, 86, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		
		//CPF:
		JLabel lblNewLabel_6 = new JLabel("CPF");
		lblNewLabel_6.setBounds(315, 39, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(315, 55, 86, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		
		
		//Birth:
		JLabel lblNewLabel_7 = new JLabel("Data de Nascimento");
		lblNewLabel_7.setBounds(315, 84, 96, 14);
		contentPane.add(lblNewLabel_7);
		
		txtDataNasc = new JTextField();
		txtDataNasc.setBounds(315, 99, 86, 20);
		contentPane.add(txtDataNasc);
		txtDataNasc.setColumns(10);
		
		
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtNome.getText();
				long idade = Long.parseLong(txtIdade.getText()); 
				String email = txtEmail.getText();
				long telefone = Long.parseLong(txtTelefone.getText());
				long cpf = Long.parseLong(txtCpf.getText());
				String dataNasc = txtDataNasc.getText();
				String sexo = "";
				
				if(btnFeminino.isSelected()){
					sexo = "Feminino";
				}
				else if (btnMasculino.isSelected()){
					sexo = "Masculino";				
				}
				
				Answers an1 = new Answers(nome, idade, email, telefone, cpf, dataNasc, sexo);
				
				JLabel labelRespNome = new JLabel("Nome: " + an1.getNome());
				JLabel labelRespIdade = new JLabel("Idade: " + an1.getIdade());
				JLabel labelRespEmail = new JLabel("E-mail: " + an1.getEmail());
				JLabel labelRespTelefone = new JLabel("Telefone: " + an1.getTelefone());
				JLabel labelRespCpf = new JLabel("CPF: " + an1.getCpf());
				JLabel labelRespDataNasc = new JLabel("Data de Nascimento: " + an1.getDataNasc());
				JLabel labelRespSexo = new JLabel("Sexo: " + an1.getSexo());
				JLabel labelResp = new JLabel("");
				
				JFrame novaJanela = new JFrame("Usuario Cadastrado com sucesso!");
				novaJanela.setSize(350,300);
				
				labelRespNome.setBounds(10, 10, 300, 14);
				novaJanela.getContentPane().add(labelRespNome);
				
				labelRespIdade.setBounds(10, 40, 300, 14);
				novaJanela.getContentPane().add(labelRespIdade);
				
				labelRespEmail.setBounds(10, 70, 300, 14);
				novaJanela.getContentPane().add(labelRespEmail);
				
				labelRespTelefone.setBounds(10, 100, 300, 14);
				novaJanela.getContentPane().add(labelRespTelefone);
				
				labelRespCpf.setBounds(10, 130, 300, 14);
				novaJanela.getContentPane().add(labelRespCpf);
				
				labelRespDataNasc.setBounds(10, 160, 300, 14);
				novaJanela.getContentPane().add(labelRespDataNasc);
				
				labelRespSexo.setBounds(10, 190, 300, 14);
				novaJanela.getContentPane().add(labelRespSexo);
				
				novaJanela.getContentPane().add(labelResp);				
				novaJanela.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(165, 213, 89, 23);
		contentPane.add(btnNewButton);
		
	}
}
