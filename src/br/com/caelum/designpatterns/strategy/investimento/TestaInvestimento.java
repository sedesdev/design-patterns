package br.com.caelum.designpatterns.strategy.investimento;

import br.com.caelum.designpatterns.modelo.Conta;

public class TestaInvestimento {

	public static void main(String[] args) {
        Conta conta1 = new Conta(3000.0);
        Conta conta2 = new Conta(1000.0);
        Conta conta3 = new Conta(2000.0);
        
        Investimento arrojado    = new InvestimentoArrojado();
        Investimento conservador = new InvestimentoConservador();
        Investimento moderado    = new InvestimentoModerado();
        
        new RealizadorDeInvestimento().investir(conta1, conservador);
        new RealizadorDeInvestimento().investir(conta2, moderado);
        new RealizadorDeInvestimento().investir(conta3, arrojado);
	}
}

