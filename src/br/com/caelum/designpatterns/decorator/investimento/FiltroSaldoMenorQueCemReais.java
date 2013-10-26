package br.com.caelum.designpatterns.decorator.investimento;

import br.com.caelum.designpatterns.modelo.Conta;

public class FiltroSaldoMenorQueCemReais extends TemplateFiltragem{

	public FiltroSaldoMenorQueCemReais(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	public FiltroSaldoMenorQueCemReais() {
	}
	
	@Override
	protected boolean condicaoFiltragemSatisfeita(Conta conta) {
		return conta.getSaldo() < 100;
	}
}
