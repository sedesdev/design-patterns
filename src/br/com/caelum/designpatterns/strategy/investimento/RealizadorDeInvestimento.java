package br.com.caelum.designpatterns.strategy.investimento;

import br.com.caelum.designpatterns.modelo.Conta;

public class RealizadorDeInvestimento {

	public void investir(Conta conta, Investimento investimento){
		double lucroObtido = investimento.calcularLucro(conta);
		System.out.println("Saldo inicial: " + conta.getSaldo());
		conta.depositar(lucroObtido * 0.75);
		System.out.println("Lucro Obtido Bruto: " + lucroObtido);
		System.out.println("Lucro Obtido Líquido: " + lucroObtido * 0.75);
		System.out.println("Saldo final: " + conta.getSaldo());
		System.out.println("-----------------------------------------------------");
	}
}
