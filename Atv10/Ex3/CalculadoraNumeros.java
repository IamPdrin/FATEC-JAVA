package projeto;

import java.util.ArrayList;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class CalculadoraNumeros extends JFrame {
	
	private ArrayList<Double>nums;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraNumeros frame = new CalculadoraNumeros();
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
	public CalculadoraNumeros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMain = new JLabel("Calculadora de Media");
		lblMain.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMain.setHorizontalAlignment(SwingConstants.CENTER);
		lblMain.setBounds(120, 11, 184, 30);
		contentPane.add(lblMain);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumero.setBounds(10, 54, 69, 15);
		contentPane.add(lblNumero);
		
		txtNum = new JTextField();
		txtNum.setBounds(10, 80, 114, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Lista:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 145, 46, 14);
		contentPane.add(lblNewLabel);
		
		JTextArea txtList = new JTextArea();
		txtList.setBounds(10, 166, 114, 85);
		contentPane.add(txtList);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nums = new ArrayList<>();
				nums.add(Double.parseDouble(txtNum.getText()));
				txtList.append("" + nums);
			}
		});
		btnAdicionar.setBounds(10, 111, 114, 23);
		contentPane.add(btnAdicionar);
		
		
		JLabel lblResp = new JLabel("");
		lblResp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblResp.setHorizontalAlignment(SwingConstants.CENTER);
		lblResp.setBounds(258, 94, 114, 85);
		contentPane.add(lblResp);
		
		JButton btnCalc = new JButton("Calcular Media");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double res = calcularMedia(nums);
				lblResp.setText("" + res);
			}
		});
		btnCalc.setBounds(166, 210, 101, 28);
		contentPane.add(btnCalc);
		
		JLabel lblResp1 = new JLabel("Resultado:");
		lblResp1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblResp1.setBounds(258, 54, 69, 14);
		contentPane.add(lblResp1);
		
	}
	
	public double calcularMedia(ArrayList<Double>nums){
		int media = 0;
		for (double x : nums) {
			media += x;
		}
		double res = (media/nums.size());
		return res;
	}

}
