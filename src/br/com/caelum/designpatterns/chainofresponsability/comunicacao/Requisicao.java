package br.com.caelum.designpatterns.chainofresponsability.comunicacao;


public class Requisicao {

	private Formato formato;

	public Requisicao(Formato formato) {
		this.formato = formato;
	}

	public Formato getFormato() {
		return formato;
	}	
}
