package CadPessoaFisica;

import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

//Cria a Janela
public class PessoaFisica extends JFrame {
	JRadioButton[] rdnSex = new JRadioButton[2];
	ButtonGroup grupo = new ButtonGroup();
	
	//NOME
	JLabel lblNome = new JLabel("Nome:");
	JTextField txtNome = new JTextField();
	
	//SEXO
	JLabel lblSex = new JLabel("Sexo:");
	
	//RG
	JLabel lblRG = new JLabel("RG:");
	JTextField txtRG = new JTextField();
	
	//CPF
	JLabel lblCPF = new JLabel("CPF:");
	JTextField txtCPF = new JTextField();
	
	//TELEFONE
	JLabel lblTelefone = new JLabel("TEL.:");
	JTextField txtTelefone = new JTextField();
	
	//CELULAR
	JLabel lblCelular = new JLabel("CEL.:");
	JTextField txtCelular = new JTextField();
	
	//ENDEREÇO
	JLabel lblEnd = new JLabel("End.:");
	JTextField txtEnd = new JTextField();
	
	//BAIRRO
	JLabel lblBairro = new JLabel("Bairro:");
	JTextField txtBairro = new JTextField();
	
	//CEP
	JLabel lblCEP = new JLabel("CEP:");
	JTextField txtCEP = new JTextField();
	
	//CIDADE
	JLabel lblCidade = new JLabel("Cidade:");
	JTextField txtCidade = new JTextField();
	
	//ESTADO
	String[] est = {"AC","AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
	JLabel lblEst = new JLabel("Estado:");
	JComboBox txtEst = new JComboBox(est);
	
	//CADASTRAR
	JButton btnCad = new JButton("Cadastrar");
	//CANCELAR
	JButton btnCanc = new JButton("Cancelar");


public PessoaFisica(){
	super ("Cadastro de Pessoa Física");									//Determina o rótulo na janela
	
	Container paine = this.getContentPane();								//Classe responsável pela fixação dos itens da tela
	paine.setLayout(null);													// Define o posicionamente dos objetos na tela
	
	//NOME
	paine.add(lblNome);
	lblNome.setBounds(50, 40, 50, 20);
	paine.add(txtNome);
	txtNome.setBounds(100, 40, 370, 25);
	
	//SEXO
	rdnSex[0] = new JRadioButton("Feminino");
	rdnSex[1] = new JRadioButton("Masculino");
	
	grupo.add(rdnSex[0]);
	grupo.add(rdnSex[1]);
	
	rdnSex[0].setBounds(310, 90, 100, 20);
	paine.add(rdnSex[0]);
	
	rdnSex[1].setBounds(390, 90, 100, 20);
	paine.add(rdnSex[1]);
	
	paine.add(lblSex);
	lblSex.setBounds(270, 90, 100, 20);
	
	//RG
	paine.add(lblRG);
	lblRG.setBounds(50, 70, 50, 20);
	paine.add(txtRG);
	txtRG.setBounds(100, 70, 150, 25);
	
	//CPF
	paine.add(lblCPF);
	lblCPF.setBounds(50, 100, 50, 20);
	paine.add(txtCPF);
	txtCPF.setBounds(100, 100, 150, 25);
	
	//TELEFONE
	paine.add(lblTelefone);
	lblTelefone.setBounds(50, 130, 50, 20);
	paine.add(txtTelefone);
	txtTelefone.setBounds(100, 130, 150, 25);
	
	//CELULAR
	paine.add(lblCelular);
	lblCelular.setBounds(280, 130, 50, 20);
	paine.add(txtCelular);
	txtCelular.setBounds(320, 130, 150, 25);
	
	//ENDEREÇO
	paine.add(lblEnd);
	lblEnd.setBounds(50, 200, 50, 20);
	paine.add(txtEnd);
	txtEnd.setBounds(100, 200, 370, 25);
	
	//BAIRRO
	paine.add(lblBairro);
	lblBairro.setBounds(50, 230, 50, 20);
	paine.add(txtBairro);
	txtBairro.setBounds(100, 230, 150, 25);
	
	//CEP
	paine.add(lblCEP);
	lblCEP.setBounds(280, 230, 50, 20);
	paine.add(txtCEP);
	txtCEP.setBounds(320, 230, 150, 25);
	
	//CIDADE
	paine.add(lblCidade);
	lblCidade.setBounds(50, 260, 50, 20);
	paine.add(txtCidade);
	txtCidade.setBounds(100, 260, 150, 25);
	
	//ESTADO
	paine.add(lblEst);
	lblEst.setBounds(265, 260, 50, 20);
	paine.add(txtEst);
	txtEst.setBounds(320, 260, 150, 25);
	
	//CADASTRAR
	paine.add(btnCad);
	btnCad.setBounds(150, 310, 100, 30);

	//CANCELAR
	paine.add(btnCanc);
	btnCanc.setBounds(280, 310, 100, 30);
	
	//Configurações da Janela
	this.setVisible(true);													//Dertermina se vai ficar visível para o usuário
	this.setSize(550, 415);													// Determina o tamanho da janela
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);							//Sai do sistema ao fechar a janela
}

//Método principal
public static void main (String args[]){
	
	PessoaFisica pf = new PessoaFisica();
		
}

}

