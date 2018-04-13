/*
 * Desenvolvendo e gerenciando relações com a mídia.
 */
public class Midia extends Contato {
	public Midia(String nome, String email, String empresa, String telefone) {
		super(nome, email, empresa, telefone);
	}

	private String apresentacao = "Conexões com jornalistas para solicitar endossos críticos de terceiros para um produto, problema, serviço ou organização.";
	
	public String getApresentacao() {
		return apresentacao;
	}
}
