/*
 * Criando e emitindo comunicados de imprensa.
 */
public class Imprensa {
	private String apresentacao = "Crie e emita comunicados � m�dia para gerar interesse na organiza��o.",
			comunicado,
			canal;
	
	public String getApresentacao() {
		return apresentacao;
	}
	
	public String getComunicado() {
		return comunicado;
	}
	
	public void setComunicado(String novocomunicado) {
		this.comunicado = novocomunicado;
	}
	
	public String getCanal() {
		return canal;
	}
	
	public void setCanal(String canal) {
		this.canal = canal;
	}
}
