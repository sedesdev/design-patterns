package br.com.caelum.designpatterns.strategy.imposto;

import br.com.caelum.designpatterns.modelo.Orcamento;

public class CalculadorDeImposto {

	public void realizaCalculo(Orcamento orcamento, Imposto imposto){
		System.out.println(imposto.calcula(orcamento));
	}
}
