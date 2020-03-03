package br.com.alura.forum.config.validacao;

public class ErroDeFormularioDto {
	
	private String campo;
	private String mensagem;
	
	
	public ErroDeFormularioDto(String campo, String erro) {
		super();
		this.campo = campo;
		this.mensagem = erro;
	}
	public String getCampo() {
		return campo;
	}
	public void setCampo(String campo) {
		this.campo = campo;
	}
	public String getErro() {
		return mensagem;
	}
	public void setErro(String erro) {
		this.mensagem = erro;
	}
	
	
	
}
