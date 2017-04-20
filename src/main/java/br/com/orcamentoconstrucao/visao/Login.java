package br.com.orcamentoconstrucao.visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private static final long serialVersionUID = -8740501249005470235L;
	private JTextField txt_Usuario;
	private JPasswordField passwordField_Senha;

	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbl_Usuario = new JLabel("Usuário");
		lbl_Usuario.setBounds(113, 48, 200, 14);
		getContentPane().add(lbl_Usuario);

		txt_Usuario = new JTextField();
		txt_Usuario.setBounds(113, 73, 200, 20);
		getContentPane().add(txt_Usuario);
		txt_Usuario.setColumns(10);

		JLabel lbl_Senha = new JLabel("Senha");
		lbl_Senha.setBounds(113, 104, 200, 14);
		getContentPane().add(lbl_Senha);

		JButton btn_Entrar = new JButton("Entrar");
		btn_Entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				TelaInicial telainicial = new TelaInicial();
//				telainicial.setVisible(true);
//				setVisible(false);
//				telainicial.ativaNimbus();
			}
		});
		btn_Entrar.setBounds(113, 180, 89, 23);
		getContentPane().add(btn_Entrar);

		JButton btn_Cancelar = new JButton("Cancelar");
		btn_Cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btn_Cancelar.setBounds(224, 180, 89, 23);
		getContentPane().add(btn_Cancelar);
		
		passwordField_Senha = new JPasswordField();
		passwordField_Senha.setBounds(113, 129, 200, 20);
		contentPane.add(passwordField_Senha);
	}
}
