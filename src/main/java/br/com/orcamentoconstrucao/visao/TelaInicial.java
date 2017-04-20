package br.com.orcamentoconstrucao.visao;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

/**
 * @author alan_
 *
 */
public class TelaInicial extends JFrame {

	private static final long serialVersionUID = -3525506547169992553L;
	JDesktopPane desktopPane;
	public TelaInicial() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		desktopPane = new JDesktopPane();
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);

		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GerirCliente cliente = new GerirCliente();
				cliente.setVisible(true);
				desktopPane.add(cliente);
			}
		});
		mnCadastro.add(mntmCliente);
		
		desktopPane = new JDesktopPane();
		getContentPane().add(desktopPane, BorderLayout.CENTER);
	}
}