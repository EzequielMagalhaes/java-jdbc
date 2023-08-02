package application;

import java.sql.Connection;

import db.DB;

public class MainProgram {

	public static void main(String[] args) {
		Connection conn = DB.getConnetion(); // Abriu a conexão com o banco de dados.
		DB.closeConnection(); // Fechou a conexão com o banco de dados.
	}
}