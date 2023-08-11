package application;

public class Main {

	public static void main(String[] args) {
//		Connection conn = DB.getConnetion(); // Abriu a conexão com o banco de dados.
//		System.out.println("Conectado com sucesso!");
//		DB.closeConnection(); // Fechou a conexão com o banco de dados.
		
		
		
							/* DEMO : RECUPERAR DADOS //
		
// São recursos externos, que não são controlados pela JVM, por isso é ideal que fechemos
// esses recursos manualmente para evitar que haja vazamento de memória na aplicação.
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
		finally {			
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
*/
		
		
							// DEMO : INSERIR DADOS //
		
		
		
		
		
		
		
		
		
		
							// DEMO : ATUALIZAR DADOS //

		
		
		
		
		
		
		
		
		
							// DEMO : DELETAR DADOS //

		
		
		
		
		
		
		
		
		
	}
}