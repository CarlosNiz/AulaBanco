package projeto_funcionarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClasseDadosConexao {

	private static final String USERNAME = "root"; 
	private static final String PASSWORD = "etec"; 
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/banco_funcionarios";
	
	/*
	public static Connection criarConexao() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexao = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		return conexao;
		}
	
	public static void main(String[] args) throws Exception{
		Connection con = criarConexao();
		if(con != null){
		System.out.println("Conexão okay!");
		con.close();

		}*/
	
	public static Connection criarConexao() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conexao = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		return conexao;
	}
	
	public static void main(String[] args) throws Exception {
		Connection con = criarConexao();
		if(con != null) {
			System.out.println("Conexão ok!");
			con.close();
		}
	}
}
	
