package br.com.caelum.designpatterns.decorator.imposto;

import br.com.caelum.designpatterns.modelo.Orcamento;

public abstract class Imposto {

	private Imposto outroImposto;

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}
	
	public Imposto() {
	}

	public Imposto getOutroImposto() {
		return outroImposto;
	}
	
	protected double calculoDoOutroImposto(Orcamento orcamento){
		if (outroImposto == null) {
			return 0;
		}
		return outroImposto.calcula(orcamento);
	}
	
	public abstract double calcula(Orcamento orcamento);
}

