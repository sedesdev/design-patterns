package br.com.caelum.designpatterns.strategy.imposto;

import br.com.caelum.designpatterns.modelo.Orcamento;

public class TestaCalculoImposto {

	public static void main(String[] args) {
		Orcamento orcamento1 = new Orcamento(900);
		Orcamento orcamento2 = new Orcamento(2000);
		Orcamento orcamento3 = new Orcamento(4000);
		Imposto iccc  = new ICCC();
		
        new CalculadorDeImposto().realizaCalculo(orcamento1, iccc);
        new CalculadorDeImposto().realizaCalculo(orcamento2, iccc);
        new CalculadorDeImposto().realizaCalculo(orcamento3, iccc);

	}
}

