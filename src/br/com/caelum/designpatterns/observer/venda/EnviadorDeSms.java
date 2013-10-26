package br.com.caelum.designpatterns.observer.venda;

import br.com.caelum.designpatterns.modelo.NotaFiscal;

public class EnviadorDeSms implements AcaoAposGerarNota{
	public void executa(NotaFiscal notaFiscal){
		System.out.println("Enviando SMS...");
	}
}
