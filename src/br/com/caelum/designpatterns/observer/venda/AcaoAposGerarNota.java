package br.com.caelum.designpatterns.observer.venda;

import br.com.caelum.designpatterns.modelo.NotaFiscal;

public interface AcaoAposGerarNota {
	void executa(NotaFiscal notaFiscal);
}
