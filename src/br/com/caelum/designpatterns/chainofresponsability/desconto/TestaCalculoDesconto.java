package br.com.caelum.designpatterns.chainofresponsability.desconto;

import br.com.caelum.designpatterns.modelo.Item;
import br.com.caelum.designpatterns.modelo.Orcamento;

public class TestaCalculoDesconto {

	public static void main(String[] args) {
		CalculadorDeDesconto calculadora = new CalculadorDeDesconto();

		Orcamento orcamento = new Orcamento(300);

		orcamento.adicionar(new Item("BORRACHA", 5));
		orcamento.adicionar(new Item("CANETA", 3));
		orcamento.adicionar(new Item("LAPIS", 30));
		orcamento.adicionar(new Item("DUREX", 3));
		
		System.out.println(calculadora.calcula(orcamento));
	}
}
