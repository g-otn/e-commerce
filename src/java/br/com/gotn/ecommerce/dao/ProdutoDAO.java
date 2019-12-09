package br.com.gotn.ecommerce.dao;

import br.com.gotn.ecommerce.dominio.Produto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface ProdutoDAO {
    
    void alterar(Produto premio) throws ClassNotFoundException, SQLException;

    ResultSet consultarPorFiltro(String filtro) throws ClassNotFoundException, SQLException;

    ResultSet consultarPorId(Long id) throws ClassNotFoundException, SQLException;

    void excluir(Long id) throws ClassNotFoundException, SQLException;

    Long inserir(Produto premio) throws ClassNotFoundException, SQLException;

    public List<Produto> listarTodos() throws ClassNotFoundException, SQLException;
    
}
