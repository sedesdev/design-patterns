package br.com.caelum.designpatterns.strategy.investimento;

import br.com.caelum.designpatterns.modelo.Conta;

public interface Investimento {

	double calcularLucro(Conta conta);
}
