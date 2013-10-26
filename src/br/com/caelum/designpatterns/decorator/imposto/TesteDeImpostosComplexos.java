package br.com.caelum.designpatterns.decorator.imposto;

import br.com.caelum.designpatterns.modelo.Orcamento;

public class TesteDeImpostosComplexos {

	public static void main(String[] args) {
		Imposto iss = new ISS(new ICMS(new ICPP()));
		
		Orcamento orcamento = new Orcamento(500);
		
		double calculo = iss.calcula(orcamento);
		System.out.println(calculo);
	}
}
