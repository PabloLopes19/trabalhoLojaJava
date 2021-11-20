package source;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JTextField txtTelefone;
	private JTextField txtSobrenome;
	private JTextField txtEmail;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		setTitle("Loja virtual");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pedido N\u00BA: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 11, 107, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNan = new JLabel("NaN");
		lblNan.setForeground(Color.RED);
		lblNan.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNan.setBounds(120, 11, 102, 22);
		contentPane.add(lblNan);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblData.setBounds(307, 11, 158, 22);
		contentPane.add(lblData);
		
		JLabel lblDeJaneiro = new JLabel("00 de Janeiro de 0000");
		lblDeJaneiro.setForeground(Color.RED);
		lblDeJaneiro.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDeJaneiro.setBounds(364, 11, 206, 22);
		contentPane.add(lblDeJaneiro);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 65, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNome = new JTextField();
		txtNome.setBounds(66, 62, 206, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Endere\u00E7o");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(10, 93, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(66, 90, 206, 20);
		contentPane.add(txtEndereco);
		
		JLabel lblNewLabel_1_2 = new JLabel("Telefone");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2.setBounds(10, 121, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(66, 118, 206, 20);
		contentPane.add(txtTelefone);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setColumns(10);
		txtSobrenome.setBounds(364, 59, 206, 20);
		contentPane.add(txtSobrenome);
		
		JLabel lblNewLabel_1_3 = new JLabel("Sobrenome");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3.setBounds(282, 62, 72, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Sexo");
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3_1.setBounds(282, 90, 72, 14);
		contentPane.add(lblNewLabel_1_3_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Masulino", "Feminino"}));
		comboBox.setBounds(364, 89, 206, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Coment\u00E1rio"}));
		comboBox_1.setBounds(66, 146, 206, 22);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Assunto");
		lblNewLabel_1_3_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3_1_1.setBounds(10, 147, 46, 14);
		contentPane.add(lblNewLabel_1_3_1_1);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(364, 118, 206, 20);
		contentPane.add(txtEmail);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Email");
		lblNewLabel_1_3_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3_2.setBounds(282, 121, 72, 14);
		contentPane.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_3_1_1_1 = new JLabel("Coment\u00E1rios");
		lblNewLabel_1_3_1_1_1.setBounds(10, 205, 87, 14);
		contentPane.add(lblNewLabel_1_3_1_1_1);
		
		JTextArea txtComentarios = new JTextArea();
		txtComentarios.setBounds(10, 222, 560, 59);
		contentPane.add(txtComentarios);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setEnabled(false);
		btnCadastrar.setBounds(459, 292, 111, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNovo.setBounds(360, 292, 89, 23);
		contentPane.add(btnNovo);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(261, 292, 89, 23);
		contentPane.add(btnSair);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nr.Pedido", "Data", "Nome", "Sobrenome", "Endere\u00E7o", "Sexo", "Telefone", "Email", "Assunto", "Coment\u00E1rio"
			}
		));
		table.setBounds(221, 349, 1, 1);
		contentPane.add(table);
	}
}
