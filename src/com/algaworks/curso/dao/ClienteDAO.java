package com.algaworks.curso.dao;

import com.algaworks.curso.modelo.Cliente;

import java.sql.SQLException;
import java.util.List;

public interface ClienteDAO {

	public void salvar(Cliente cliente) throws SQLException;

	public Cliente buscarPeloCodigo(Long codigo);
	
	public List<Cliente> buscarTodos();
	
}
