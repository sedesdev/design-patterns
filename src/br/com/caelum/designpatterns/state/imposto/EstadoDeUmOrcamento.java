package br.com.caelum.designpatterns.state.imposto;

import br.com.caelum.designpatterns.modelo.Orcamento;

public interface EstadoDeUmOrcamento {
	void aplicaDescontoExtra(Orcamento orcamento);
	
	void aprova(Orcamento orcamento);
	void reprova(Orcamento orcamento);
	void finaliza(Orcamento orcamento);
}
