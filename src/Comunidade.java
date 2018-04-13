/*
 * Desenvolvendo e administrando as rela��es com a comunidade.
 */
public class Comunidade extends Contato {
	public Comunidade(String nome, String email, String empresa, String telefone) {
		super(nome, email, empresa, telefone);
	}

	private String apresentacao = "Conex�es comerciais com as pessoas que constituem o ambiente no qual a organiza��o opera e extrai recursos, a fim de promover a compreens�o, a confian�a e o apoio m�tuos.";
	
	public String getApresentacao() {
		return apresentacao;
	}
}