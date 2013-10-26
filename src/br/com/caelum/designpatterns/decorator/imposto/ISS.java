package br.com.caelum.designpatterns.decorator.imposto;

import br.com.caelum.designpatterns.modelo.Orcamento;

public class ISS extends Imposto {
	
	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ISS() {
	}
	
	public double calcula(Orcamento orcamento){
		return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
	}

}
