package br.com.gotn.ecommerce.dao;

import br.com.gotn.ecommerce.dominio.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface ClienteDAO {
    
    void alterar(Cliente cliente) throws ClassNotFoundException, SQLException;

    ResultSet consultarPorFiltro(String filtro) throws ClassNotFoundException, SQLException;

    ResultSet consultarPorId(Long id) throws ClassNotFoundException, SQLException;

    void excluir(Long id) throws ClassNotFoundException, SQLException;

    Long inserir(Cliente cliente) throws ClassNotFoundException, SQLException;

    public List<Cliente> listarTodos() throws ClassNotFoundException, SQLException;
    
}
