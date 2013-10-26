package br.com.caelum.designpatterns.chainofresponsability.desconto;

import br.com.caelum.designpatterns.modelo.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public double desconta(Orcamento orcamento){
	    return 0;
	}

	@Override
	public void setProximo(Desconto proximo) {
	}
}
