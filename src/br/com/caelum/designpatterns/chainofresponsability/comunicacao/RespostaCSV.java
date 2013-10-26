package br.com.caelum.designpatterns.chainofresponsability.comunicacao;

import br.com.caelum.designpatterns.modelo.Conta;

public class RespostaCSV implements Resposta {

	private Resposta proximo;
	
	public RespostaCSV(Resposta proximo) {
		this.proximo = proximo;
	}

	@Override
	public String visualizar(Conta conta, Requisicao requisicao) {
        if (requisicao.getFormato() == Formato.CSV){
        	return conta.getTitular() + ";" + conta.getSaldo();
        }else {
        	return proximo != null ? proximo.visualizar(conta, requisicao) : "";
        }
	}
}
