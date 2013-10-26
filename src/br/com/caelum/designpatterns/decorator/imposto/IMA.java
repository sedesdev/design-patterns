package br.com.caelum.designpatterns.decorator.imposto;

import br.com.caelum.designpatterns.modelo.Orcamento;

public class IMA extends Imposto {
 
	public IMA(Imposto outroImposto) {
		super(outroImposto);
	}

	public IMA() {
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.2 + calculoDoOutroImposto(orcamento);
	}
}
