package viewers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controles.FuncionarioProcess;
import controles.PacientesProcess;
import modelos.Pacientes;

public class TelaUsuario extends JFrame implements ActionListener {

	private static final long serialVersionUID = 3L;
	private JPanel painel;
	private String imgIco = "./imgs/hospital.png";
	private JLabel usuarioLogado, id, orgao, data, nomePaciente, nomeMedico;
	private JTextField tfId, tfData, tfNomePaciente, tfNomeMedico;
	private JComboBox<String> cbOrgao;
	private JScrollPane rolagem;
	private JTable table;
	private DefaultTableModel tableModelPaciente;
	private JButton create, read, update, delete;

	private int autoIds = PacientesProcess.pacientes.get(PacientesProcess.pacientes.size()-1).getId() + 1;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	TelaUsuario() {
		//informações da tela
		
		setTitle("Cadastro de Pacientes");
		setIconImage(new ImageIcon(imgIco).getImage());
		setBounds(150, 170, 800, 550);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel();
		painel.setBackground(new Color(220, 212, 231));
		setContentPane(painel);
		setLayout(null);
		
		//Local onde fica o Usuário Logado
		String doutor=FuncionarioProcess.LoginFuncionarioConectado;
		usuarioLogado = new JLabel("Olá, " + doutor + " Bem Vindo");
		usuarioLogado.setBounds(20, 10, 500, 30);
		painel.add(usuarioLogado);

		// Caixa de texto, onde se encontra o ID.
		id = new JLabel("Id:");
		id.setBounds(10, 40, 120, 30);
		painel.add(id);
		
		tfId = new JTextField(String.format("%d", autoIds));
		tfId.setBounds(130,40, 300, 25);
		painel.add(tfId);
		
		//Combo box Orgão.
		orgao = new JLabel("Órgão:");
		orgao.setBounds(10, 70, 120, 30);
		painel.add(orgao);
		
		cbOrgao = new JComboBox<String>(new String[] { "Rim", "Coração",
				"Córnia", "Pulmão", "Figado", "Medula Ossea" });
		cbOrgao.setBounds(130, 70, 300, 25);
		painel.add(cbOrgao);
		
		//Caixa de texto, onde se encontra a DATA.
		data = new JLabel("Data:");
		data.setBounds(10, 100, 120, 30);
		painel.add(data);
		
		tfData = new JTextField(sdf.format(new Date()));
		tfData.setBounds(130, 100, 300, 25);
		painel.add(tfData);
		
		
		//Caixa de texto, onde se encontra o Nome do Paciente.
		nomePaciente = new JLabel("Nome do Paciente:");
		nomePaciente.setBounds(10, 130, 120, 30);
		painel.add(nomePaciente);
		
		tfNomePaciente = new JTextField("??");
		tfNomePaciente.setBounds(130, 130, 300, 25);
		painel.add(tfNomePaciente);
		
		
		//Caixa de texto, onde se encontra o Médico.
		nomeMedico = new JLabel("Nome do Médico:");
		nomeMedico.setBounds(10, 160, 120, 30);
		painel.add(nomeMedico);

		tfNomeMedico = new JTextField("Dr");
		tfNomeMedico.setBounds(130, 160, 300, 25);
		painel.add(tfNomeMedico);
		
	
	
		
		//Nome botões
		create = new JButton("Cadastrar");
		read = new JButton("Buscar");
		update = new JButton("Alterar");
		delete = new JButton("Excluir");

		//local botões
		create.setBounds(455, 40, 120, 30);
		read.setBounds(580, 40, 120, 30);
		update.setBounds(455, 100, 120, 30);
		delete.setBounds(580, 100, 120, 30);

		//adicionando os botões
		painel.add(create);
		painel.add(read);
		painel.add(update);
		painel.add(delete);

		//criando a tabela
		
		table = new JTable();
		tableModelPaciente = new DefaultTableModel();
		tableModelPaciente.addColumn("Id");
		tableModelPaciente.addColumn("Orgão");
		tableModelPaciente.addColumn("Paciente");
		tableModelPaciente.addColumn("Data Entrada");
		tableModelPaciente.addColumn("Médico");
		tableModelPaciente.addColumn("Tempo de Espera:");
		if (PacientesProcess.pacientes.size() != 0) {
			preencherTabela();
		}
		table = new JTable(tableModelPaciente);
		rolagem = new JScrollPane(table);
		rolagem.setBounds(10, 250, 750, 250);
		painel.add(rolagem);

		create.addActionListener(this);
		read.addActionListener(this);
		update.addActionListener(this);
		delete.addActionListener(this);

		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int linha = table.getSelectedRow();
				int id = Integer.parseInt(table.getValueAt(linha, 0).toString());
				Pacientes pac = new Pacientes(id);
				int indice = PacientesProcess.pacientes.indexOf(pac);
				preencheCampos(indice);
			}
		});

		tfId.setEnabled(false);
		tfData.setEnabled(false);
		update.setEnabled(false);
		delete.setEnabled(false);

	}

	private void preencherTabela() {
		int totLinhas = tableModelPaciente.getRowCount();
		if (tableModelPaciente.getRowCount() > 0) {
			for (int i = 0; i < totLinhas; i++) {
				tableModelPaciente.removeRow(0);
			}
		}
		for (Pacientes p : PacientesProcess.pacientes) {
			tableModelPaciente.addRow(p.toVetor());
		}
	}

	private void preencherTabela(String filtro) {
		int totLinhas = tableModelPaciente.getRowCount();
		if (tableModelPaciente.getRowCount() > 0) {
			for (int i = 0; i < totLinhas; i++) {
				tableModelPaciente.removeRow(0);
			}
		}
		for (Pacientes p : PacientesProcess.pacientes) {
			if (p.getNomeMedico().toUpperCase().contains(filtro.toUpperCase()) || p.getNome().toUpperCase().contains(filtro.toUpperCase()) || p.getOrgao().toUpperCase().contains(filtro.toUpperCase()) || p.getDataEntrada("").contains(filtro)) {
				tableModelPaciente.addRow(p.toVetor());
			}
		}
	}

	private void limparCampos() {
		tfId.setText(String.format("%d", autoIds));
		tfData.setEnabled(false);
		create.setEnabled(true);
		update.setEnabled(false);
		delete.setEnabled(false);
	}

	private void preencheCampos(int indice) {
		tfId.setText(PacientesProcess.pacientes.get(indice).getId("s"));
		tfData.setText(PacientesProcess.pacientes.get(indice).getDataEntrada("s"));
		cbOrgao.setSelectedIndex(obterIndiceOrgaos(PacientesProcess.pacientes.get(indice).getOrgao()));
		tfNomePaciente.setText(PacientesProcess.pacientes.get(indice).getNome());
		tfNomeMedico.setText(PacientesProcess.pacientes.get(indice).getNomeMedico());
		create.setEnabled(false);
		update.setEnabled(true);
		delete.setEnabled(true);
		tfData.setEnabled(true);
	}

	
	
	private int obterIndiceOrgaos(String orgao) {
		switch (orgao) {
		case "Rim":
			return 0;
		case "Coração":
			return 1;
		case "Córnia":
			return 2;
		case "Pulmão":
			return 3;
		case "Figado":
			return 4;
		case "Medula Ossea":
			return 5;
		default:
			return -1;
		}
	}

	// CADASTRAR - CRUD
	private void cadastrar() throws ParseException {
		if (tfNomePaciente.getText().length() != 0 && tfNomeMedico.getText().length() != 0) {
			PacientesProcess.pacientes.add(new Pacientes(tfId.getText(),
					cbOrgao.getSelectedItem().toString(), tfNomePaciente.getText(), tfNomeMedico.getText()));
			autoIds++;
			preencherTabela();
			limparCampos();
			PacientesProcess.salvar();
		} else {
			JOptionPane.showMessageDialog(this, "Verefique se todos ampos foram preenchidos!!");
		}
	}

	// BUSCAR - CRUD
	private void buscar() {
		String entrada = JOptionPane.showInputDialog(this, "Digite o que dejesa Encontrar");
		boolean Numeric = true;
		if (entrada != null && !entrada.equals("")) {
			for (int i = 0; i < entrada.length(); i++) {
				if (!Character.isDigit(entrada.charAt(i))) {
					Numeric = false;
					limparCampos();
				}
			}
		} else {
			Numeric = false;
			limparCampos();
		}
		if (Numeric) {
			int id = Integer.parseInt(entrada);
			Pacientes paci = new Pacientes(id);
			if (PacientesProcess.pacientes.contains(paci)) {
				int indice = PacientesProcess.pacientes.indexOf(paci);
				preencheCampos(indice);
				preencherTabela();
			} else {
				JOptionPane.showMessageDialog(this, "[ERROR404] NÃO FOI PÓSSIVEL ENCONTRAR O PACIENTE!!");
			}
		} else {
			preencherTabela(entrada);
		}
	}

	// ALTERAR - CRUD
	private void alterar() throws ParseException {
		if (tfNomePaciente.getText().length() != 0 && tfNomeMedico.getText().length() != 0) {
			int id = Integer.parseInt(tfId.getText());
			Pacientes paci = new Pacientes(id);
			int indice = PacientesProcess.pacientes.indexOf(paci);
			PacientesProcess.pacientes.set(indice, new Pacientes(tfId.getText(),
					cbOrgao.getSelectedItem().toString(), tfNomePaciente.getText(), tfNomeMedico.getText()));
			
			preencherTabela();
			limparCampos();
			PacientesProcess.salvar();
		} else {
			JOptionPane.showMessageDialog(this, "Favor preencher todos os campos.");
		}
	}

	// DELETE - CRUD
	private void excluir() {
		int id = Integer.parseInt(tfId.getText());
		Pacientes paci = new Pacientes(id);
		int indice = PacientesProcess.pacientes.indexOf(paci);
		PacientesProcess.pacientes.remove(indice);
		preencherTabela();
		limparCampos();
		create.setEnabled(true);
		update.setEnabled(false);
		delete.setEnabled(false);
		tfId.setText(String.format("%d", autoIds));
		PacientesProcess.salvar();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == create) {
			try {
				cadastrar();
			} catch (ParseException e1) {
			
				e1.printStackTrace();
			}
		}
		if (e.getSource() == read) {
			buscar();
		}
		if (e.getSource() == update) {
			try {
				alterar();
			} catch (ParseException e1) {
			
				e1.printStackTrace();
			}
		}
		if (e.getSource() == delete) {
			excluir();
		}
	}

	public static void main(String[] args) {
		PacientesProcess.abrir();
		new UsuarioCRUD().setVisible(true);
	}

}