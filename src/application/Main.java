package application;

import java.sql.Connection;
import db.DB;

public class Main {

	public static void main(String[] args) {
		Connection conn = DB.getConnetion(); // Abriu a conexão com o banco de dados.
		System.out.println("Conectado com sucesso!");
		DB.closeConnection(); // Fechou a conexão com o banco de dados.
	}
}