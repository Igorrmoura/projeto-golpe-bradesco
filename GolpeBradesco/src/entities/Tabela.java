package entities;

import java.sql.Statement;

import application.Sistema;
import java.sql.Connection;
import java.sql.SQLException;


public class Tabela extends Sistema{

	

	    public static void criarTabela() throws SQLException {
	        try (Connection conn = Sistema.conectar()){
	            Statement stmt = conn.createStatement();
	            String sql = "CREATE TABLE IF NOT EXISTS dados (" 
	                    +    "id INT AUTO_INCREMENT PRIMARY KEY," +
	                         "nome VARCHAR(100) NOT NULL," +
	                         "cpf VARCHAR(11) NOT NULL UNIQUE,"
	                    +    "limite DOUBLE NOT NULL,"
	                    +    "email VARCHAR(100) NOT NULL"
	                    +    "    )";
	            stmt.execute(sql);
	            System.out.println("Tabela criada com sucesso!");


	        }

	        }
	    }

