
public class Contato {
	private String nome,
			email,
			empresa,
			telefone;
	
	public Contato(String nome, String email, String empresa, String telefone) {
		this.nome = nome;
		this.email = email;
		this.empresa = empresa;
		this.telefone = telefone;
	}
	
	public void getContato() {
		System.out.println("Nome: " + nome + "; Email: " + email + "; Empresa: " + empresa + "; Telefone: " + telefone + "\n");
	}
}
