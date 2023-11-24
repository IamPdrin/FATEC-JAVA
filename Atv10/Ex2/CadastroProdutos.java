package projeto;

import java.util.ArrayList;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroProdutos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtProdutos;
	private ArrayList<String> arrayProd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroProdutos frame = new CadastroProdutos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroProdutos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 64, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMain = new JLabel("Cadastro de produtos");
		lblMain.setForeground(new Color(255, 255, 255));
		lblMain.setFont(new Font("Nirmala UI", Font.BOLD, 18));
		lblMain.setHorizontalAlignment(SwingConstants.CENTER);
		lblMain.setBounds(115, 11, 204, 55);
		contentPane.add(lblMain);
		
		JLabel lblNomeProduto = new JLabel("Nome do Produto:");
		lblNomeProduto.setForeground(new Color(255, 255, 255));
		lblNomeProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNomeProduto.setBounds(10, 69, 102, 29);
		contentPane.add(lblNomeProduto);
		
		txtProdutos = new JTextField();
		txtProdutos.setBounds(10, 99, 137, 20);
		contentPane.add(txtProdutos);
		txtProdutos.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 174, 414, 76);
		contentPane.add(textArea);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(arrayProd == null) {
					arrayProd = new ArrayList<>();
				}
				arrayProd.add(txtProdutos.getText());
				textArea.setText("Produtos Cadastrados: ");
				for(String x : arrayProd){
					textArea.append(x + "; ");
				}
			}
		});
		btnCadastrar.setBounds(170, 129, 102, 23);
		contentPane.add(btnCadastrar);
		
		
		
		
	}
}
