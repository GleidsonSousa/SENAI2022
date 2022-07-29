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

public class TelaAlunos extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel painel;
	private JLabel rotulo1, rotulo2,rotulo3,rotulo4;
	private JTextField nome,nota1,nota2,nota3;
	private JButton cadastro;

	TelaAlunos() {
		setTitle("Cadastro de Notas");
		setBounds(600, 300, 360, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel(); 
		setContentPane(painel); 
		setLayout(null);

		rotulo1 = new JLabel("Nome:");
		rotulo1.setBounds(20, 20, 100, 20);
		nome = new JTextField();
		nome.setBounds(120, 20, 200, 30);
		rotulo2 = new JLabel("1º Nota");
		rotulo2.setBounds(20, 60, 200, 25);
		nota1 = new JTextField();
		nota1.setBounds(120, 60, 200, 30);
		rotulo3 = new JLabel("2º Nota");
		rotulo3.setBounds(20, 90, 100, 20);
		nota2 = new JTextField();
		nota2.setBounds(120, 90, 200, 30);
		rotulo4 = new JLabel("3º Nota");
		rotulo4.setBounds(20, 120, 100, 20);
		nota3 = new JTextField();
		nota3.setBounds(120, 120, 200, 30);
		cadastro = new JButton("Cadastro");
		cadastro.setBounds(120, 150, 200, 30);
		
	
		cadastro.addActionListener(this);

		painel.add(rotulo1);
		painel.add(nome);
		painel.add(rotulo2);
		painel.add(nota1);
		painel.add(rotulo3);
		painel.add(nota2);
		painel.add(rotulo4);
		painel.add(nota3);
		painel.add(cadastro);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}

	public static void main(String[] args) {
		ProcessaDados.carregar();
		TelaAlunos tela = new TelaAlunos();
		tela.setVisible(true);
	}
}