package br.com.caelum.designpatterns.state.imposto;

import br.com.caelum.designpatterns.modelo.Orcamento;

public class TesteDeDescontoExtraRepetido {
	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(500);
		
		reforma.aplicaDescontoExtra();
		reforma.aplicaDescontoExtra();
		System.out.println(reforma.getValor());
	}
}
