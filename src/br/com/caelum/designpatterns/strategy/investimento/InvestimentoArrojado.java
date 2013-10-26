package br.com.caelum.designpatterns.strategy.investimento;

import br.com.caelum.designpatterns.modelo.Conta;

public class InvestimentoArrojado implements Investimento {

	@Override
	public double calcularLucro(Conta conta) {
		double chanceAtual = new java.util.Random().nextDouble();
		boolean CHANCE_20_PORCENTO = chanceAtual <= 0.20;
		boolean CHANCE_30_PORCENTO = chanceAtual > 0.20 && chanceAtual <= 0.30;
		boolean CHANCE_50_PORCENTO = chanceAtual > 0.50;

		if (CHANCE_20_PORCENTO) {
			return conta.getSaldo() * 0.05;
		}

		if (CHANCE_30_PORCENTO) {
			return conta.getSaldo() * 0.03;
		}

		if (CHANCE_50_PORCENTO) {
			return conta.getSaldo() * 0.006;
		}

		return 0.0;

	}
}
