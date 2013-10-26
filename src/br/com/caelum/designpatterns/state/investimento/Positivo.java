package br.com.caelum.designpatterns.state.investimento;

import br.com.caelum.designpatterns.modelo.Conta;

public class Positivo implements EstadoDeUmaConta{

	@Override
	public void sacar(Conta conta, double valor) {
		conta.mudarSaldo(conta.getSaldo() - valor);
		
		if (conta.getSaldo() < 0){
			conta.mudarEstadoAtualPara(new Negativo());
		}
	}

	@Override
	public void depositar(Conta conta, double valor) {
		conta.mudarSaldo(conta.getSaldo() + valor * 0.98);		
	}
	
	@Override
	public String toString() {
		return "POSITIVO";
	}
}
