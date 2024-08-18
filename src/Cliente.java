public class Cliente {

	private String nome;

	public String getNome() {
			return nome;
	}

	public void setNome(String nome) {
			if(nome == null || nome.trim().isEmpty()) {
					throw new IllegalArgumentException("Nome não pode ser vazio ou nulo");
			}
			this.nome = nome;
	}
}
