package livraria.util;

import java.lang.reflect.Modifier;
import java.util.List;
import java.util.stream.Collectors;

import livraria.model.Livraria;
import livraria.model.Livro;
import livraria.model.Vendedor;

public class QueryGenerator<T> {

	public  String gerarInsert(T object) {
		String sql = null;
		if(object instanceof Livro) {
			Livro l = (Livro) object;
			sql = "INSERT INTO livro (nome, quantidade, id_livraria) VALUES ('" + l.getNome() + "'," + l.getQuantidade() + ", " + l.getId_livraria() + ")";
		}
		
		if(object instanceof Vendedor) {
			Vendedor v = (Vendedor) object;
			sql = "INSERT INTO vendedor (nome, usuario, senha, id_livraria) VALUES ('" + v.getNome() + "','" + v.getUsuario() + "', '" + v.getSenha() + "', " + v.getId_livraria() + ")";
		}
		
		if(object instanceof Livraria) {
			Livro l = (Livro) object;
			sql = "INSERT INTO livraria (nome, quantidade, id_livraria) VALUES ('" + l.getNome() + "'," + l.getQuantidade() + ", " + l.getId_livraria() + ")";
		}
		
		return sql;
	}

}
