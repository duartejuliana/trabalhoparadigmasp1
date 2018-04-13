/*
 * Desenvolvendo e gerenciando rela��es com a m�dia.
 */
public class Midia extends Contato {
	public Midia(String nome, String email, String empresa, String telefone) {
		super(nome, email, empresa, telefone);
	}

	private String apresentacao = "Conex�es com jornalistas para solicitar endossos cr�ticos de terceiros para um produto, problema, servi�o ou organiza��o.";
	
	public String getApresentacao() {
		return apresentacao;
	}
}
