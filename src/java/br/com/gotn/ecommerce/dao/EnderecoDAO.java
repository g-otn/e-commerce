package br.com.gotn.ecommerce.dao;

import br.com.gotn.ecommerce.dominio.Endereco;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface EnderecoDAO {
    
    void alterar(Endereco endereco) throws ClassNotFoundException, SQLException;

    ResultSet consultarPorId(Long id) throws ClassNotFoundException, SQLException;

    void excluir(Long id) throws ClassNotFoundException, SQLException;

    Long inserir(Endereco endereco) throws ClassNotFoundException, SQLException;
    
}
