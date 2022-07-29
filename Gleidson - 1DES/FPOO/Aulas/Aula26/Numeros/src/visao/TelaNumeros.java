package visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class TelaNumeros extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel painel;
	private JLabel rotulo1;
	private JTextField numeros;
	private JButton cadastro;

	TelaNumeros() {
		setTitle("Números");
		setBounds(600, 300, 360, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel(); 
		setContentPane(painel); 
		setLayout(null);

		rotulo1 = new JLabel("Números:");
		rotulo1.setBounds(20, 20, 100, 20);
		numeros = new JTextField();
		numeros.setBounds(120, 20, 200, 30);
		
		cadastro = new JButton("Enviar");
		cadastro.setBounds(120, 60, 200, 30);
		
	
		cadastro.addActionListener(this);

		painel.add(rotulo1);
		painel.add(numeros);
		painel.add(cadastro);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}

	public static void main(String[] args) {
		carregar();
		TelaNumeros tela = new TelaNumeros();
		tela.setVisible(true);
	}

	private static void carregar() {
	}
}