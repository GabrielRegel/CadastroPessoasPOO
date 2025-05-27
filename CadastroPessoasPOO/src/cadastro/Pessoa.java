package cadastro;

public abstract class Pessoa {

	protected String nome;
	protected int idade;
	protected String email;

	public Pessoa(String nome, int idade, String email) {
		this.nome = nome;
		this.idade = idade;
		this.email = email;

	}
	
	public abstract void exibirDados();
}
