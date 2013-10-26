package br.com.caelum.designpatterns.templatemethod.imposto;

import br.com.caelum.designpatterns.modelo.Item;
import br.com.caelum.designpatterns.modelo.Orcamento;
import br.com.caelum.designpatterns.strategy.imposto.Imposto;

public class TestaCalculoImposto {

	public static void main(String[] args) {
		Orcamento orcamento1 = new Orcamento(400);
		Orcamento orcamento2 = new Orcamento(2000);
		orcamento2.adicionar(new Item("CARRO", 2000));
		Imposto icpp  = new ICPP();
		Imposto ikcv  = new IKCV();
		
		System.out.println(icpp.calcula(orcamento1));
		System.out.println(ikcv.calcula(orcamento1));
		System.out.println(icpp.calcula(orcamento2));
		System.out.println(ikcv.calcula(orcamento2));
	}
}

