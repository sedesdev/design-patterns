package br.com.caelum.designpatterns.state.imposto;

import br.com.caelum.designpatterns.modelo.Orcamento;

public class Reprovado implements EstadoDeUmOrcamento{
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento){
		throw new RuntimeException("N�o permitida aplica��o de desconto");
	}
	
	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("N�o pode aprovar um or�amento j� reprovado");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("N�o pode reprovar um or�amento j� reprovado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.mudaEstadoAtualPara(new Finalizado());
	}
}
