package br.com.caelum.designpatterns.strategy.investimento;

import br.com.caelum.designpatterns.modelo.Conta;

public class InvestimentoConservador implements Investimento {

	@Override
	public double calcularLucro(Conta conta) {
		return conta.getSaldo() * 0.008;
	}
}
