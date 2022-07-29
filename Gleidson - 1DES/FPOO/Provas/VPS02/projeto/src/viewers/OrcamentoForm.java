package viewers;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


import controllers.OrcamentoProcess;
import models.Orcamento;

 
	public class OrcamentoForm extends JDialog implements ActionListener {

		private static final long serialVersionUID = 1L;
		private JPanel painel;
		private String imgIcon = "./imgs/icone.jpg";
		private JLabel id, fornecedor, produto, preco;
		private JTextField tfId, tfFornecedor, tfProduto,  tfPreco; 
		private JScrollPane rolagem;
		private JTable table;
		private DefaultTableModel tableModel;
		private JButton create, read, update, delete;
		private int autoIds = OrcamentoProcess.orcamentos.get(OrcamentoProcess.orcamentos.size()-1).getId() + 1;

		
		public OrcamentoForm() {
			
			//view
			setTitle("Cadastro de Or�amentos");
			setBounds(150, 170, 800, 500);
		painel = new JPanel();
		setIconImage(new ImageIcon(imgIcon).getImage());
		painel.setBackground(new Color(250, 250, 150));
		setContentPane(painel);
		setLayout(null);
		
		//Label
		id = new JLabel("Id:");
		id.setBounds(115, 25, 120, 30);
		painel.add(id);
		fornecedor = new JLabel("Fornecedor:");
		fornecedor.setBounds(70, 65, 120, 30);
		painel.add(fornecedor);
		produto = new JLabel("Prooduto:");
		produto.setBounds(75, 105, 120, 30);
		painel.add(produto);
		preco = new JLabel("Pre�o:");
		preco.setBounds(90, 145, 120, 30);
		painel.add(preco);
		
		
		 //Text Fields
		
		tfId = new JTextField(String.format("%d", autoIds));
		tfId.setEditable(false);
		tfId.setBounds(140, 25, 100, 30);
		painel.add(tfId);
		
		tfFornecedor = new JTextField("");
		tfFornecedor.setBounds(140, 65, 255, 30);
		painel.add(tfFornecedor);
		
		tfProduto = new JTextField("");
		tfProduto.setBounds(140, 105, 255, 30);
		painel.add(tfProduto);
		
		
		tfPreco = new JTextField("");
		tfPreco.setBounds(140, 145, 255, 30);
		painel.add(tfPreco);
		
		
		//Table
		
		table = new JTable();
		tableModel = new DefaultTableModel();
		tableModel.addColumn("Id");
		tableModel.addColumn("Fornecedor");
		tableModel.addColumn("Produto");
		tableModel.addColumn("Pre�o");
		tableModel.addColumn("Recomenda��es");
		
		
		if (OrcamentoProcess.orcamentos.size() != 0) {
			preencherTabela();
		}
		table = new JTable(tableModel);
		table.setEnabled(false);
		rolagem = new JScrollPane(table);
		rolagem.setBounds(20, 200, 740, 230);
		painel.add(rolagem);
		
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int lin = table.getSelectedRow();
				int id = Integer.parseInt(table.getValueAt(lin, 0).toString());
				Orcamento orca = new Orcamento(id);
				int indice = OrcamentoProcess.orcamentos.indexOf(orca);
				preencheCampos(indice);
			}
		});

		
		


		//Buttons
		create = new JButton("Cadastrar");
		read = new JButton("Buscar");
		update = new JButton("Alterar");
		delete = new JButton("Excluir");
		create.setBounds(405, 65, 110, 30);
		read.setBounds(525, 65, 110, 30);
		update.setBounds(405, 100, 110, 30);
		delete.setBounds(525, 100, 110, 30);
		update.setEnabled(false);
		delete.setEnabled(false);
		painel.add(create);
		painel.add(read);
		painel.add(update);
		painel.add(delete);
		
		
		
		//relatar o evento dos bot�es
		create.addActionListener(this);
		read.addActionListener(this);
		update.addActionListener(this);
		delete.addActionListener(this);

	}
		
		
		//CADASTRAR - CRUD
		private void cadastrar() {
			if (tfFornecedor.getText().length() != 0 && tfProduto.getText().length() != 0 && tfPreco.getText().length() != 0) {
				OrcamentoProcess.orcamentos.add(new Orcamento(tfId.getText(),tfFornecedor.getText(), 
						tfProduto.getText(), tfPreco.getText(), false));
				autoIds++;
				preencherTabela();
				limparCampos();
				comparar();
				OrcamentoProcess.salvar();
			} else {
				JOptionPane.showMessageDialog(this, "Verifique se Todos os campos est�o preenchidos");
			}
		}

		
		
		
		

		// BUSCAR - CRUD
		private void buscar() {
			String entrada = JOptionPane.showInputDialog(this, "Digite o Id ou Produto que dejesa buscar!");
			boolean isNumeric = true;
			if (entrada != null && !entrada.equals("")) {
				for (int i = 0; i < entrada.length(); i++) {
					if (!Character.isDigit(entrada.charAt(i))) {
						isNumeric = false;
						limparCampos();
					}
				}
			} else {
				isNumeric = false;
				limparCampos();
			}
			if (isNumeric) {
				int id = Integer.parseInt(entrada);
				
				Orcamento orcamento = new Orcamento(id);
				if (OrcamentoProcess.orcamentos.contains(orcamento)) {
					int indice = OrcamentoProcess.orcamentos.indexOf(orcamento);
					preencheCampos(indice);
					preencherTabela();
				} else {
					JOptionPane.showMessageDialog(this, "Or�amento/Produto n�o encontrado");
				}
			} else {
				preencherTabela(entrada);
			}
		}
		
		//Alterar-CRUD
		private void alterar() {
			if (tfFornecedor.getText().length() != 0 && tfProduto.getText().length() != 0 && tfPreco.getText().length() != 0) {
				int id = Integer.parseInt(tfId.getText());
				Orcamento orcamento = new Orcamento(id);
				int indice = OrcamentoProcess.orcamentos.indexOf(orcamento);
				OrcamentoProcess.orcamentos.set(indice, new Orcamento(tfId.getText(),tfFornecedor.getText(), 
						tfProduto.getText(), tfPreco.getText(),false));
			
				preencherTabela();
				limparCampos();
				comparar();
				OrcamentoProcess.salvar();
			} else {
				JOptionPane.showMessageDialog(this, "Favor preencher todos os campos.");
			}
		}
		
		//Excluir-CRUD
		private void excluir() {
			int id = Integer.parseInt(tfId.getText());
			Orcamento orcamento = new Orcamento(id);
			int indice = OrcamentoProcess.orcamentos.indexOf(orcamento);
			OrcamentoProcess.orcamentos.remove(indice);
			preencherTabela();
			limparCampos();
			create.setEnabled(true);
			update.setEnabled(false);
			delete.setEnabled(false);
			tfId.setText(String.format("%d", autoIds));
			OrcamentoProcess.salvar();
		}
		
		private void comparar() {
			
		}

		
		private void preencherTabela() {
			int totLinhas = tableModel.getRowCount();
			if (tableModel.getRowCount() > 0) {
				for (int i = 0; i < totLinhas; i++) {
					tableModel.removeRow(0);
				}
			}
			for (Orcamento o : OrcamentoProcess.orcamentos) {
				OrcamentoProcess.calculo(o.getProduto());
			}
			
			for (Orcamento or : OrcamentoProcess.orcamentos) {
				if (or.getMaisBarato()) {
				tableModel.addRow(new String[] { String.format("%d", or.getId()), or.getFornecedor(), or.getProduto(),String.format("%.2f", or.getPreco()), "Comprar"});
			} else {
				tableModel.addRow(new String[] { String.format("%d", or.getId()), or.getFornecedor(), or.getProduto(),String.format("%.2f", or.getPreco()), "N�o Comprar"});
					}
				}
			}
		

		private void preencherTabela(String filtro) {
			int totLinhas = tableModel.getRowCount();
			if (tableModel.getRowCount() > 0) {
				for (int i = 0; i < totLinhas; i++) {
					tableModel.removeRow(0);
				}
			}
			
			for (Orcamento o : OrcamentoProcess.orcamentos) {
				OrcamentoProcess.calculo(o.getProduto());
			}
			
			for (Orcamento or : OrcamentoProcess.orcamentos) {
				if (or.getProduto().contains(filtro) || or.getId("").contains(filtro) || or.getFornecedor().contains(filtro)) {
					if (or.getMaisBarato()) {
						tableModel.addRow(new String[] { String.format("%d", or.getId()), or.getFornecedor(), or.getProduto(),String.format("%.2f", or.getPreco()), "Comprar"});
					} else {
						tableModel.addRow(new String[] { String.format("%d", or.getId()), or.getFornecedor(), or.getProduto(),String.format("%.2f", or.getPreco()), "N�o Comprar"});
							}
						}
					}
				}

		private void limparCampos() {
			tfId.setText(String.format("%d", autoIds));
			create.setEnabled(true);
			update.setEnabled(false);
			delete.setEnabled(false);
		}
 
		private void preencheCampos(int indice) {
			tfId.setText(OrcamentoProcess.orcamentos.get(indice).getId("s"));
			tfFornecedor.setText(OrcamentoProcess.orcamentos.get(indice).getFornecedor());
			tfProduto.setText(OrcamentoProcess.orcamentos.get(indice).getProduto());
			tfPreco.setText(OrcamentoProcess.orcamentos.get(indice).getPreco("s"));
			
			create.setEnabled(false);
			update.setEnabled(true);
			delete.setEnabled(true);
			
		}

		
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == create) {
				
				cadastrar();
			}
			if (e.getSource() == read) {
				buscar();
			}
			if (e.getSource() == update) {
				alterar();
			}
			if (e.getSource() == delete) {
				excluir();
			}
		}
			
		public static void main(String[] args) {
			OrcamentoProcess.abrir();
			OrcamentoForm tela = new OrcamentoForm();
			tela.setVisible(true);
		}
	}