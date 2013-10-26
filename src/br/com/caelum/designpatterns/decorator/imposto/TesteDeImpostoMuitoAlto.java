package br.com.caelum.designpatterns.decorator.imposto;

import br.com.caelum.designpatterns.modelo.Orcamento;

public class TesteDeImpostoMuitoAlto {

	public static void main(String[] args) {
		Imposto ima         = new IMA(new ICMS(new ICPP()));
		Orcamento orcamento = new Orcamento(500);
		double calculo      = ima.calcula(orcamento);
		
		System.out.println(calculo);
	}
}
