package br.com.caelum.designpatterns.state.investimento;

import br.com.caelum.designpatterns.modelo.Conta;

public class Negativo implements EstadoDeUmaConta{

	@Override
	public void sacar(Conta conta, double valor) {
		throw new RuntimeException("Não pode sacar de conta negativada");	
	}

	@Override
	public void depositar(Conta conta, double valor) {
		conta.mudarSaldo(conta.getSaldo() + valor * 0.95);	
		
		if (conta.getSaldo() > 0){
			conta.mudarEstadoAtualPara(new Positivo());
		}
	}
	
	@Override
	public String toString() {
		return "NEGATIVO";
	}
}
