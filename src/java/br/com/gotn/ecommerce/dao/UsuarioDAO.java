package br.com.gotn.ecommerce.dao;

import br.com.gotn.ecommerce.dominio.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface UsuarioDAO {
    
    void alterar(Usuario usuario) throws ClassNotFoundException, SQLException;

    ResultSet consultarPorFiltro(String filtro) throws ClassNotFoundException, SQLException;

    ResultSet consultarPorId(Long id) throws ClassNotFoundException, SQLException;

    void excluir(Long id) throws ClassNotFoundException, SQLException;

    Long inserir(Usuario usuario) throws ClassNotFoundException, SQLException;

    public List<Usuario> listarTodos() throws ClassNotFoundException, SQLException;
    
}
