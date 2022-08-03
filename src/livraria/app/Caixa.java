package livraria.app;

import java.sql.SQLException;

import livraria.io.DbConnection;
import livraria.model.Livro;
import livraria.util.QueryGenerator;

public class Caixa {

	public static void main(String[] args) {
		DbConnection conn = new DbConnection();
//		
//		String sql = "INSERT INTO livraria (nome) VALUES ('Livraria do Ariel')";
//		
//		try {
//			conn.getSt().execute(sql);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Livro livro = new Livro("Livro 1", 10, 1);
		QueryGenerator<Livro> qg = new QueryGenerator();
		qg.gerarInsert(livro);
		
		
		
// 		Inicio
		ArrayList<Vendedor> tVendedores = new ArrayList<Vendedor>();
		
		Integer totalUsuarios = 200;
		
		for (int n = 1; n <= totalUsuarios; n++){
			
			tVendedores.add(new Vendedor())
			
		}
		

	}

}
