package viewers;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controles.FuncionarioProcess;
import controles.PacientesProcess;

public class TeladeLogin extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel painel;
	private JLabel rotulo1, rotulo2, lbFundo;
	private JTextField funcionario, senha;
	private JButton login;
	private String imgIco = "./imgs/hospital.png";
	private String [] fundo = {"./imgs/bemVindo.png"};
	private ImageIcon icon;

	TeladeLogin() {
		setTitle("Tela de Login");
		setBounds(600, 300, 580, 450);
		setIconImage(new ImageIcon(imgIco).getImage());
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel(); 
		setContentPane(painel); 
		setLayout(null);

		
		
		rotulo1 = new JLabel("Funcionário");
		rotulo1.setBounds(250, 230, 100, 20);
		funcionario = new JTextField();
		funcionario.setBounds(185, 250, 200, 30);
		rotulo2 = new JLabel("Senha:");
		rotulo2.setBounds(265, 290, 100, 20);
		senha = new JPasswordField();
		((JPasswordField) senha).setEchoChar('*');
		senha.setBounds(185, 310, 200, 30);
		
		login = new JButton("Logar");
		login.setBounds(185, 350, 200, 30);
		
		lbFundo = new JLabel("");
		lbFundo.setBounds(5,0,600,210);
		fundo(0);
		painel.add(lbFundo);
	
		login.addActionListener(this);
		painel.add(rotulo1);
		painel.add(funcionario);
		painel.add(rotulo2);
		painel.add(senha);
		painel.add(login);
		
	}

	private void fundo (int indice) {
		icon = new ImageIcon(new ImageIcon(fundo[indice]).getImage().getScaledInstance(570, 180, 400));
		lbFundo.setIcon(icon);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == login) {
			int indice = FuncionarioProcess.checarEmail(funcionario.getText());
			if (indice != -1) {
				if (FuncionarioProcess.checarSenha(indice, senha.getText())) {
			
					this.dispose();
					UsuarioCRUD uc = new UsuarioCRUD();
					uc.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(this, "Login negado (Verifique a senha)");
				}
				
			} else {
				JOptionPane.showMessageDialog(this, "Funcionário não encontrado!!");
				
				JOptionPane.showMessageDialog(this, "Entre em contato com o Suporte!");
			}
		}
	}

	public static void main(String[] args) {
		FuncionarioProcess.carregar();
		PacientesProcess.abrir();
		TeladeLogin tela = new TeladeLogin();
		tela.setVisible(true);
	}
}