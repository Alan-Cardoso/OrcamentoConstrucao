package br.com.orcamentoconstrucao.aplicacao;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import br.com.orcamentoconstrucao.visao.Login;

/**
 * @author alan_
 *
 */
public class Principal {

	public static void main(String[] args) {

		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}

		Login login = new Login();
		login.setVisible(true);
		
//		TelaInicial window = new TelaInicial();
//		window.setVisible(true);

		
	}
}