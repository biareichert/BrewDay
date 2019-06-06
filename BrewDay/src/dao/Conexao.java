package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    
    public static Connection conectar() throws Exception{
        String driver = "org.postgresql.Driver";
        String user = "postgres";
        String senha = "udesc";
        String url = "jdbc:postgresql://localhost:5432/brewDay";
        
        Class.forName(driver);
        return (Connection) DriverManager.getConnection(url, user, senha);
        
    }
    
}
