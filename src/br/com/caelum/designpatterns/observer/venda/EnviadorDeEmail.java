package br.com.caelum.designpatterns.observer.venda;

import br.com.caelum.designpatterns.modelo.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNota{
	public void executa(NotaFiscal notaFiscal){
		System.out.println("Enviando e-mail com NF...");
	}
}
