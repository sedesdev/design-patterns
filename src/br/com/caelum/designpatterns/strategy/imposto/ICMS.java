package br.com.caelum.designpatterns.strategy.imposto;

import br.com.caelum.designpatterns.modelo.Orcamento;

public class ICMS implements Imposto{
	
	public double calcula(Orcamento orcamento){
		return orcamento.getValor() * 0.1;
	}
}
