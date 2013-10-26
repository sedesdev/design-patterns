package br.com.caelum.designpatterns.chainofresponsability.comunicacao;

import br.com.caelum.designpatterns.modelo.Conta;

public class RespostaPorcento implements Resposta{

	private Resposta proximo;
	
	public RespostaPorcento(Resposta proximo) {
		this.proximo = proximo;
	}

	@Override
	public String visualizar(Conta conta, Requisicao requisicao) {
        if (requisicao.getFormato() == Formato.PORCENTO){
        	return conta.getTitular() + "%" + conta.getSaldo();
        }else {
        	return proximo != null ? proximo.visualizar(conta, requisicao) : "";
        }
	}
}
