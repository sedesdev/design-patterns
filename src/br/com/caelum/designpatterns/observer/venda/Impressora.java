package br.com.caelum.designpatterns.observer.venda;

import br.com.caelum.designpatterns.modelo.NotaFiscal;

public class Impressora implements AcaoAposGerarNota{
	public void executa(NotaFiscal notaFiscal){
		System.out.println("Imprimimindo NF");
	}
}
