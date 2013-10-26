package br.com.caelum.designpatterns.decorator.imposto;

import br.com.caelum.designpatterns.modelo.Orcamento;

public class ICCC extends Imposto{
	
	public ICCC(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ICCC() {
	}
	
	public double calcula(Orcamento orcamento){
		double calculo = 0;
		if (orcamento.getValor() < 1000.0){
			calculo = orcamento.getValor() * 0.05;
		} else if (orcamento.getValor() >= 1000.0 && 
				   orcamento.getValor() <= 3000.0){
			calculo = orcamento.getValor() * 0.07;	
		} else{
			calculo = orcamento.getValor() * 0.08 + 30.0;	
		}
		
		return calculo + calculoDoOutroImposto(orcamento);
	}
}
