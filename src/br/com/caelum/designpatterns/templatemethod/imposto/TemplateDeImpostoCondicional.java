package br.com.caelum.designpatterns.templatemethod.imposto;

import br.com.caelum.designpatterns.modelo.Orcamento;
import br.com.caelum.designpatterns.strategy.imposto.Imposto;

public abstract class TemplateDeImpostoCondicional implements Imposto{

	@Override
	public final double calcula(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)){
			return maximaTaxacao(orcamento);
		}else{
			return minimaTaxacao(orcamento);
		}
	}

	public abstract double minimaTaxacao(Orcamento orcamento);

	public abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
