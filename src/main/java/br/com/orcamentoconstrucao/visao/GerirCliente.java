package br.com.orcamentoconstrucao.visao;

import java.awt.ComponentOrientation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

/**
 * @author alan_
 *
 */
public class GerirCliente extends JInternalFrame {
	
	private static final long serialVersionUID = 4351727280081137479L;
	private JTextField txt_codigo;
	private JTextField txt_NomeCompleto;
	private JTextField txt_CPF;
	private JTextField txt_RG;
	private JTextField txt_OrgaoEmissorRG;
	private JTextField txt_DataEmissorRG;
	private JTextField txt__EstadoCivil;
	private JTextField txt_TelefoneResidencia;
	private JTextField txt_CelularOne;
	private JTextField txt_Email;
	private JTextField txt_Endereco;
	private JTextField txt_Numero;
	private JTextField txt_Complemento;
	private JTextField txt_CEP;
	private JTextField txt_CelularTwo;
	private JTextField txt_Bairro;
	private JTextField txt_Cidade;

	@SuppressWarnings("rawtypes")
	public GerirCliente() {
		getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		getContentPane().setLayout(null);
		
		JLabel lbl_codigo = new JLabel("Código");
		lbl_codigo.setBounds(10, 11, 65, 14);
		getContentPane().add(lbl_codigo);
		
		txt_codigo = new JTextField();
		txt_codigo.setEnabled(false);
		txt_codigo.setBounds(10, 36, 65, 20);
		txt_codigo.setEditable(false);
		getContentPane().add(txt_codigo);
		txt_codigo.setColumns(10);
		
		
		JLabel lbl_NomeCompleto = new JLabel("Nome Completo");
		lbl_NomeCompleto.setBounds(90, 11, 350, 14);
		getContentPane().add(lbl_NomeCompleto);
		
		txt_NomeCompleto = new JTextField();
		txt_NomeCompleto.setBounds(90, 36, 350, 20);
		getContentPane().add(txt_NomeCompleto);
		txt_NomeCompleto.setColumns(10);
		
		JLabel lbl_Sexo = new JLabel("Sexo");
		lbl_Sexo.setBounds(455, 11, 46, 14);
		getContentPane().add(lbl_Sexo);
		
		JComboBox comboBox_Sexo = new JComboBox();
		comboBox_Sexo.setBounds(455, 36, 90, 20);
		getContentPane().add(comboBox_Sexo);
		
		JLabel lbl_DataCadastro = new JLabel("Data de Cadastro");
		lbl_DataCadastro.setBounds(560, 11, 115, 14);
		getContentPane().add(lbl_DataCadastro);
		
		JLabel lbl_Cpf = new JLabel("CPF");
		lbl_Cpf.setBounds(10, 67, 95, 14);
		getContentPane().add(lbl_Cpf);
		
		txt_CPF = new JTextField();
		txt_CPF.setBounds(10, 92, 95, 20);
		getContentPane().add(txt_CPF);
		txt_CPF.setColumns(10);
		
		JLabel lbl_RG = new JLabel("RG");
		lbl_RG.setBounds(120, 67, 85, 14);
		getContentPane().add(lbl_RG);
		
		txt_RG = new JTextField();
		txt_RG.setBounds(120, 92, 85, 20);
		getContentPane().add(txt_RG);
		txt_RG.setColumns(10);
		
		JLabel lbl_OrgaoEmissorRG = new JLabel("Org\u00E3o Emissor RG");
		lbl_OrgaoEmissorRG.setBounds(220, 67, 115, 14);
		getContentPane().add(lbl_OrgaoEmissorRG);
		
		txt_OrgaoEmissorRG = new JTextField();
		txt_OrgaoEmissorRG.setBounds(220, 92, 115, 20);
		getContentPane().add(txt_OrgaoEmissorRG);
		txt_OrgaoEmissorRG.setColumns(10);
		
		JLabel lbl_UfEmissorRG = new JLabel("UF");
		lbl_UfEmissorRG.setBounds(350, 67, 50, 14);
		getContentPane().add(lbl_UfEmissorRG);
		
		JComboBox comboBox_UfEmissorRG = new JComboBox();
		comboBox_UfEmissorRG.setBounds(350, 92, 50, 20);
		getContentPane().add(comboBox_UfEmissorRG);
		
		JLabel lbl_DataEmissorRG = new JLabel("Data Emiss\u00E3o RG");
		lbl_DataEmissorRG.setBounds(420, 67, 115, 14);
		getContentPane().add(lbl_DataEmissorRG);
		
		txt_DataEmissorRG = new JTextField();
		txt_DataEmissorRG.setBounds(420, 92, 115, 20);
		getContentPane().add(txt_DataEmissorRG);
		txt_DataEmissorRG.setColumns(10);
		
		JLabel lbl_DataNascimento = new JLabel("Dada de Nascimento");
		lbl_DataNascimento.setBounds(550, 67, 125, 14);
		getContentPane().add(lbl_DataNascimento);
		
		JLabel lbl_EstadoCivil = new JLabel("Estado Civil");
		lbl_EstadoCivil.setBounds(10, 123, 90, 14);
		getContentPane().add(lbl_EstadoCivil);
		
		txt__EstadoCivil = new JTextField();
		txt__EstadoCivil.setBounds(10, 148, 90, 20);
		getContentPane().add(txt__EstadoCivil);
		txt__EstadoCivil.setColumns(10);
		
		JLabel lbl_TelefoneResidencia = new JLabel("Telefone Resid\u00EAncia");
		lbl_TelefoneResidencia.setBounds(115, 123, 115, 14);
		getContentPane().add(lbl_TelefoneResidencia);
		
		txt_TelefoneResidencia = new JTextField();
		txt_TelefoneResidencia.setBounds(115, 148, 115, 20);
		getContentPane().add(txt_TelefoneResidencia);
		txt_TelefoneResidencia.setColumns(10);
		
		JLabel lbl_CelularOne = new JLabel("Celular 1");
		lbl_CelularOne.setBounds(245, 123, 110, 14);
		getContentPane().add(lbl_CelularOne);
		
		txt_CelularOne = new JTextField();
		txt_CelularOne.setBounds(245, 148, 110, 20);
		getContentPane().add(txt_CelularOne);
		txt_CelularOne.setColumns(10);
		
		JLabel lbl_Email = new JLabel("E-Mail");
		lbl_Email.setBounds(494, 123, 181, 14);
		getContentPane().add(lbl_Email);
		
		txt_Email = new JTextField();
		txt_Email.setBounds(494, 148, 181, 20);
		getContentPane().add(txt_Email);
		txt_Email.setColumns(10);
		
		JLabel lbl_Endereco = new JLabel("Endere\u00E7o");
		lbl_Endereco.setBounds(10, 179, 375, 14);
		getContentPane().add(lbl_Endereco);
		
		txt_Endereco = new JTextField();
		txt_Endereco.setBounds(10, 204, 375, 20);
		getContentPane().add(txt_Endereco);
		txt_Endereco.setColumns(10);
		
		JLabel lbl_Numero = new JLabel("N\u00FAmero");
		lbl_Numero.setBounds(400, 179, 65, 14);
		getContentPane().add(lbl_Numero);
		
		txt_Numero = new JTextField();
		txt_Numero.setBounds(400, 204, 65, 20);
		getContentPane().add(txt_Numero);
		txt_Numero.setColumns(10);
		
		JLabel lbl_Complento = new JLabel("Complento");
		lbl_Complento.setBounds(480, 179, 100, 14);
		getContentPane().add(lbl_Complento);
		
		txt_Complemento = new JTextField();
		txt_Complemento.setBounds(480, 204, 100, 20);
		getContentPane().add(txt_Complemento);
		txt_Complemento.setColumns(10);
		
		JLabel lbl_CEP = new JLabel("CEP");
		lbl_CEP.setBounds(595, 179, 80, 14);
		getContentPane().add(lbl_CEP);
		
		txt_CEP = new JTextField();
		txt_CEP.setBounds(595, 204, 80, 20);
		getContentPane().add(txt_CEP);
		txt_CEP.setColumns(10);
		
		JLabel lbl_CelularTwo = new JLabel("Celular 2");
		lbl_CelularTwo.setBounds(370, 123, 110, 14);
		getContentPane().add(lbl_CelularTwo);
		
		txt_CelularTwo = new JTextField();
		txt_CelularTwo.setBounds(370, 148, 110, 20);
		getContentPane().add(txt_CelularTwo);
		txt_CelularTwo.setColumns(10);
		
		JLabel lbl_Bairro = new JLabel("Bairro");
		lbl_Bairro.setBounds(10, 235, 150, 14);
		getContentPane().add(lbl_Bairro);
		
		txt_Bairro = new JTextField();
		txt_Bairro.setBounds(10, 260, 150, 20);
		getContentPane().add(txt_Bairro);
		txt_Bairro.setColumns(10);
		
		JLabel lbl_Cidade = new JLabel("Cidade");
		lbl_Cidade.setBounds(170, 235, 130, 14);
		getContentPane().add(lbl_Cidade);
		
		txt_Cidade = new JTextField();
		txt_Cidade.setBounds(170, 260, 130, 20);
		getContentPane().add(txt_Cidade);
		txt_Cidade.setColumns(10);
		
		JLabel lbl_UF = new JLabel("UF");
		lbl_UF.setBounds(310, 235, 50, 14);
		getContentPane().add(lbl_UF);
		
		JComboBox comboBox_UF = new JComboBox();
		comboBox_UF.setBounds(310, 260, 50, 20);
		getContentPane().add(comboBox_UF);
		
		JLabel lbl_SitucaoCliente = new JLabel("Situaçao do Cliente");
		lbl_SitucaoCliente.setBounds(370, 235, 115, 14);
		getContentPane().add(lbl_SitucaoCliente);
		
		JComboBox comboBox__SitucaoCliente = new JComboBox();
		comboBox__SitucaoCliente.setBounds(370, 260, 115, 20);
		getContentPane().add(comboBox__SitucaoCliente);
		
		JButton btn_Salvar = new JButton("Salvar");
		btn_Salvar.setBounds(279, 301, 115, 46);
		btn_Salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		getContentPane().add(btn_Salvar);
		
		JButton btn_Fechar = new JButton("Fechar");
		btn_Fechar.setBounds(560, 301, 115, 46);
		getContentPane().add(btn_Fechar);
		
		JButton btn_Limpar = new JButton("Limpar");
		btn_Limpar.setBounds(420, 301, 115, 46);
		getContentPane().add(btn_Limpar);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(560, 36, 115, 20);
		getContentPane().add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(550, 92, 125, 20);
		getContentPane().add(dateChooser_1);
		setTitle("Gerenciar Clientes");

		setClosable(true);
		setIconifiable(true);
		setBounds(0, 0, 700, 400);
	}
}