package br.com.caelum.designpatterns.state.investimento;

import br.com.caelum.designpatterns.modelo.Conta;

public interface EstadoDeUmaConta {
	void sacar(Conta conta, double valor);
	void depositar(Conta conta, double valor);
}
