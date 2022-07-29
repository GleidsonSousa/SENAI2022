package visao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controle.ProcessaDados;

public class TelaPessoas extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel painel;
	private JLabel rotulo1, rotulo2;
	private JTextField nome, ano;
	private JButton cadastro;

	TelaPessoas() {
		setTitle("Cadastro de Pessoas");
		setBounds(600, 300, 360, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel(); 
		setContentPane(painel); 
		setLayout(null);

		rotulo1 = new JLabel("Nome:");
		rotulo1.setBounds(20, 20, 100, 20);
		nome = new JTextField();
		nome.setBounds(120, 20, 200, 30);
		rotulo2 = new JLabel("Ano de Nascimento:");
		rotulo2.setBounds(20, 60, 100, 20);
		ano = new JTextField();
		ano.setBounds(120, 60, 200, 30);
		cadastro = new JButton("Cadastro");
		cadastro.setBounds(120, 100, 200, 30);
		
	
		cadastro.addActionListener(this);

		painel.add(rotulo1);
		painel.add(nome);
		painel.add(rotulo2);
		painel.add(ano);
		painel.add(cadastro);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}

	public static void main(String[] args) {
		ProcessaDados.carregar();
		TelaPessoas tela = new TelaPessoas();
		tela.setVisible(true);
	}
}