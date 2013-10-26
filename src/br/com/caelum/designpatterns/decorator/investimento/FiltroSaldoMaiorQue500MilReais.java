package br.com.caelum.designpatterns.decorator.investimento;

import br.com.caelum.designpatterns.modelo.Conta;

public class FiltroSaldoMaiorQue500MilReais extends TemplateFiltragem{

	public FiltroSaldoMaiorQue500MilReais(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	public FiltroSaldoMaiorQue500MilReais() {
	}
	
	@Override
	protected boolean condicaoFiltragemSatisfeita(Conta conta) {
		return conta.getSaldo() > 500000;
	}
}
