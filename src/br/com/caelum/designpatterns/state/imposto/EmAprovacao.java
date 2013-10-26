package br.com.caelum.designpatterns.state.imposto;

import br.com.caelum.designpatterns.modelo.Orcamento;

public class EmAprovacao implements EstadoDeUmOrcamento {
	
	private boolean descontoAplicado = false;

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento){
		if (descontoAplicado ){
			throw new RuntimeException("Desconto já aplicado!");
		}	

		orcamento.desconta(orcamento.getValor() * 0.05);
		descontoAplicado = true;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.mudaEstadoAtualPara(new Aprovado()); 
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.mudaEstadoAtualPara(new Reprovado()); 
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Não pode finalizar um orçamento em aprovação");
	}
}
