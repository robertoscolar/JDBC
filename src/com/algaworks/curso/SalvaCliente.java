package com.algaworks.curso;

import com.algaworks.curso.dao.ClienteDAO;
import com.algaworks.curso.dao.DAOFactory;
import com.algaworks.curso.modelo.Cliente;

import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class SalvaCliente {

    public static void main(String[] args) throws Exception {
    	
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        
        Cliente cliente = new Cliente();
        
        String nome = JOptionPane.showInputDialog(null,"Nome do Cliente", "Cadastro de Cliente", JOptionPane.QUESTION_MESSAGE);
        if (nome != null) {
        	if (nome.length() > 100) {
        	JOptionPane.showMessageDialog(null, "N�o pode exceder 100 caracteres", "Caracteres inv�lidos", JOptionPane.ERROR_MESSAGE);
	        } else {
	        
		        cliente.setNome(nome);
		
		        ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
		        try {
		            clienteDAO.salvar(cliente);
		            System.out.println("Cliente salvo com sucesso!");
		        } catch (SQLException e) {
		            throw new RuntimeException("Falha ao cadastrar cliente", e);
		        }
	        }
        }
    }
}
