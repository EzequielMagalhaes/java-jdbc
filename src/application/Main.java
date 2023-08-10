package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Main {

	public static void main(String[] args) {
//		Connection conn = DB.getConnetion(); // Abriu a conexão com o banco de dados.
//		System.out.println("Conectado com sucesso!");
//		DB.closeConnection(); // Fechou a conexão com o banco de dados.
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			conn = DB.getConnetion();
			st = conn.createStatement();
			rs = st.executeQuery("select * from department;");
			
			while(rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}