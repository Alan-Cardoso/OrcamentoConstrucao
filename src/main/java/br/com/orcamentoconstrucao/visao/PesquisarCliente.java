package br.com.orcamentoconstrucao.visao;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class PesquisarCliente extends JFrame {

	private static final long serialVersionUID = 8463656261273081364L;
	private JPanel contentPane;
	private JTable tableClientes;
	GerirCliente novoCadastro = null;

	public PesquisarCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tableClientes = new JTable();
		tableClientes.setBounds(12, 59, 599, 240);
		contentPane.add(tableClientes);
		
		JButton btnNovoCliente = new JButton("Novo");
		btnNovoCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				novoCadastro = new GerirCliente();
				novoCadastro.setVisible(true);
			}
		});
		btnNovoCliente.setBounds(27, 311, 127, 25);
		contentPane.add(btnNovoCliente);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(177, 311, 117, 25);
		contentPane.add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(316, 311, 117, 25);
		contentPane.add(btnExcluir);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		btnCancelar.setBounds(462, 311, 117, 25);
		contentPane.add(btnCancelar);
	}
}
