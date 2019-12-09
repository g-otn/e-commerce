package br.com.gotn.ecommerce.dao;

import br.com.gotn.ecommerce.dominio.Administrador;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface AdministradorDAO {
   
    void alterar(Administrador administrador) throws ClassNotFoundException, SQLException;

    ResultSet consultarPorFiltro(String filtro) throws ClassNotFoundException, SQLException;

    ResultSet consultarPorId(Long id) throws ClassNotFoundException, SQLException;

    void excluir(Long id) throws ClassNotFoundException, SQLException;

    Long inserir(Administrador administrador) throws ClassNotFoundException, SQLException;

    public List<Administrador> listarTodos() throws ClassNotFoundException, SQLException;
    
}
