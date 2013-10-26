package br.com.caelum.designpatterns.strategy.imposto;

import br.com.caelum.designpatterns.modelo.Orcamento;

public interface Imposto {
	double calcula(Orcamento orcamento);
}


