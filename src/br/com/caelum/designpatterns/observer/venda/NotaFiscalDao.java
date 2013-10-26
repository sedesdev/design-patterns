package br.com.caelum.designpatterns.observer.venda;

import br.com.caelum.designpatterns.modelo.NotaFiscal;

public class NotaFiscalDao implements AcaoAposGerarNota{
	public void executa(NotaFiscal notaFiscal){
		System.out.println("Salvando a nota fiscal no BD...");
	}
}
