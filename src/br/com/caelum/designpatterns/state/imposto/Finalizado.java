package br.com.caelum.designpatterns.state.imposto;

import br.com.caelum.designpatterns.modelo.Orcamento;

public class Finalizado implements EstadoDeUmOrcamento{
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento){
		throw new RuntimeException("Não permitida aplicação de desconto");
	}
	
	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Não pode aprovar um orçamento já finalizado");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Não pode reprovar um orçamento já finalizado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Não pode finalizar um orçamento já finalizado");
	}
}
