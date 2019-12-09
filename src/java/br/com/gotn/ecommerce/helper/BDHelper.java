package br.com.gotn.ecommerce.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDHelper {
    
    private final static String NOME_CLASSE_DRIVER = "org.postgresql.Driver";
    
    private final static String DB_URL = "jdbc:postgresql://127.0.0.1:5432/eletivaweb_db";
    private final static String DB_USUARIO = "eletivaweb_usuario";
    private final static String DB_SENHA = "eletivaweb";

    public static Connection getConexao() throws ClassNotFoundException, SQLException {
        Class.forName(NOME_CLASSE_DRIVER);

        return DriverManager.getConnection(DB_URL, DB_USUARIO, DB_SENHA);
    }
    
    public static void fecharConexao(Connection conexao) throws SQLException {
        conexao.close();
    }

}
