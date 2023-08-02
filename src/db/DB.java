package db;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {
	
// INSTANCIANDO UM OBJETO DE CONEXÃO 'CONN' //
	private static Connection conn = null;
	
	
// MÉTODO PARA CONECTAR COM O BANCO DE DADOS //
	public static Connection getConnetion(){
		try {
			if(conn == null) { // Se o objeto ainda 'conn' ainda estiver vazio, é necessário que haja um código para fazer essa conexão com o banco.
				Properties props = loadPropriedades(); // Pega as propriedades do banco de dados, de acordo com o método implementado abaixo.
				String url = props.getProperty("dburl"); // Pega a url a partir do objeto 'props'.
				conn = DriverManager.getConnection(url, props); // Atribui à variável 'conn' a "função" do 'DriverManager
			}
		}
		catch(SQLException e){
			throw new DbException(e.getMessage());
		}
		return conn; // Próxima vez que o método 'getConnection()' for chamado, um teste com if não vai ser mais necessário e vai simplesmente retornar a conexão com o banco de dados.
	}
	
	
// MÉTODO PARA FECHAR A CONEXÃO COM O BANCO DE DADOS //
	public static void closeConnection() {
		if(conn != null) {
			try {				
				conn.close();
			}
			catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	
	
// MÉTODO QUE PEGA AS PROPRIEDADES DO BANCO DE DADOS //
	private static Properties loadPropriedades() { 
		try (FileInputStream fis = new FileInputStream("db.properties")){
			Properties props = new Properties();
			props.load(fis); // Faz a leitrua do arquivo 'db.properties' apontado pelo 'InputStreamFile' e vai guardar os dados dentro do objeto 'props'
			return props;
		}
		catch(IOException e) {
			throw new DbException(e.getMessage());
		}	
	}
}