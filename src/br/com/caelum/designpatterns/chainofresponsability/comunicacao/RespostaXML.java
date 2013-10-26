package br.com.caelum.designpatterns.chainofresponsability.comunicacao;

import br.com.caelum.designpatterns.modelo.Conta;

public class RespostaXML implements Resposta{

	private Resposta proximo;

	public RespostaXML(Resposta proximo) {
		this.proximo = proximo;
	}
	
	@Override
	public String visualizar(Conta conta, Requisicao requisicao) {
        if (requisicao.getFormato() == Formato.XML){
        	String resposta = "<conta>" +
                                  "<titular>" + conta.getTitular() + "</titular>" +
            					  "<saldo>" + conta.getSaldo() + "</saldo>" +
                              "</conta>";    
        	return resposta;
        }else {
        	return proximo != null ? proximo.visualizar(conta, requisicao) : "";
        }
	}
}
