/*
 * Desenvolvendo e administrando as relações com a comunidade.
 */
public class Comunidade extends Contato {
	public Comunidade(String nome, String email, String empresa, String telefone) {
		super(nome, email, empresa, telefone);
	}

	private String apresentacao = "Conexões comerciais com as pessoas que constituem o ambiente no qual a organização opera e extrai recursos, a fim de promover a compreensão, a confiança e o apoio mútuos.";
	
	public String getApresentacao() {
		return apresentacao;
	}
}