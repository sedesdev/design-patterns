package br.com.caelum.designpatterns.templatemethod.imposto;

import br.com.caelum.designpatterns.modelo.Item;
import br.com.caelum.designpatterns.modelo.Orcamento;

public class IHIT extends TemplateDeImpostoCondicional {

	private boolean temDoisItensComMesmoNomeNo(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			for (Item itemAComparar : orcamento.getItens()) {
				if (item.getNome().equalsIgnoreCase(itemAComparar.getNome())) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.01 * orcamento.getItens().size();
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100.0;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return temDoisItensComMesmoNomeNo(orcamento);
	}
}
