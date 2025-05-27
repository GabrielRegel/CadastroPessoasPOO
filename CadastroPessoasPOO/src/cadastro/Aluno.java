package cadastro;

public class Aluno extends Pessoa {
	private String curso;
	
	public Aluno(String nome, int idade, String email, String curso) {
		super(nome, idade, email);
		this.curso = curso;
	}
	
	@Override
	public void exibirDados() {
		System.out.println("Aluno: ");
		System.out.println(" | Nome: " + nome + " | Idade: " + idade + " | Email: " + email + " | Curso: " + curso);
	}
}
