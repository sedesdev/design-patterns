package br.com.caelum.designpatterns.state.imposto;

import br.com.caelum.designpatterns.modelo.Orcamento;

public class Aprovado implements EstadoDeUmOrcamento{
	
	private boolean descontoAplicado = false;
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento){
		if (descontoAplicado){
			throw new RuntimeException("Desconto j� aplicado!");
		}	
		orcamento.desconta(orcamento.getValor() * 0.02);
		descontoAplicado = true;
	}
	
	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("N�o pode aprovar um or�amento j� aprovado");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("N�o pode reprovar um or�amento j� aprovado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.mudaEstadoAtualPara(new Finalizado());
	}
}
