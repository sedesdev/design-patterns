package br.com.caelum.designpatterns.strategy.investimento;

import br.com.caelum.designpatterns.modelo.Conta;

public class InvestimentoModerado implements Investimento {
	
	@Override
	public double calcularLucro(Conta conta) {
		double chanceAtual = new java.util.Random().nextDouble();
		boolean CHANCE_50_PORCENTO = chanceAtual > 0.50;
		
		if (CHANCE_50_PORCENTO){
			return conta.getSaldo() * 0.025;
		}else {
			return conta.getSaldo() * 0.007;			
		}
	}
}
