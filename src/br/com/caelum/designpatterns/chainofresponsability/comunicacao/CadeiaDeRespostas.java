package br.com.caelum.designpatterns.chainofresponsability.comunicacao;

import br.com.caelum.designpatterns.modelo.Conta;

public class CadeiaDeRespostas {

	public String visualizar(Conta conta, Requisicao requisicao){
		Resposta r1 = new RespostaCSV(new RespostaXML(new RespostaPorcento(null)));
		return r1.visualizar(conta, requisicao);
	}
}
