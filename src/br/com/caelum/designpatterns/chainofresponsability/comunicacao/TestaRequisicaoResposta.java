package br.com.caelum.designpatterns.chainofresponsability.comunicacao;

import br.com.caelum.designpatterns.modelo.Conta;

public class TestaRequisicaoResposta {

	public static void main(String[] args) {
		CadeiaDeRespostas cadeia = new CadeiaDeRespostas();

		Requisicao requisicao = new Requisicao(Formato.XML);
		Conta conta = new Conta("Joaquim Barbosa", 20920);
		
		System.out.println(cadeia.visualizar(conta, requisicao));
	}
}
