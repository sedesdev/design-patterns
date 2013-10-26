package br.com.caelum.designpatterns.chainofresponsability.comunicacao;

import br.com.caelum.designpatterns.modelo.Conta;

public interface Resposta {
	String visualizar(Conta conta, Requisicao requisicao);
}
