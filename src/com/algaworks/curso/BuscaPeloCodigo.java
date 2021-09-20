package com.algaworks.curso;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import com.algaworks.curso.dao.ClienteDAO;
import com.algaworks.curso.dao.DAOFactory;
import com.algaworks.curso.modelo.Cliente;

public class BuscaPeloCodigo {

	public static void main(String[] args) throws Exception {
		
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		
		ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
		
		long codigo = Long.parseLong(JOptionPane.showInputDialog(null,"Digite o código para o ínicio da busca", "Busca por Código", JOptionPane.QUESTION_MESSAGE));
		
		Cliente cliente = clienteDAO.buscarPeloCodigo(codigo);
		
		if (cliente != null) {
			System.out.println("------ Cliente encontrado ------");
			System.out.printf("Código: %d\n", cliente.getCodigo());
			System.out.printf("Nome: %s\n", cliente.getNome());
			System.out.println();
		}else {
			System.out.println("Nenhum cliente encontrado.");
		}
	}
}
