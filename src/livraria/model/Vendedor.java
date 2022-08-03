package livraria.model;

public class Vendedor implements Runnable {

	private transient boolean logged = false;

	private transient Integer id_vendedor;

	private Integer nome;

	private String usuario;

	private String senha;

	private Integer id_livraria;

	public boolean isLogged() {
		return logged;
	}

	public void setLogged(boolean logged) {
		this.logged = logged;
	}

	public Integer getNome() {
		return nome;
	}

	public void setNome(Integer nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getId_livraria() {
		return id_livraria;
	}

	public void setId_livraria(Integer id_livraria) {
		this.id_livraria = id_livraria;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}