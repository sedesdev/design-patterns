package br.com.caelum.designpatterns.templatemethod.relatorio;

import br.com.caelum.designpatterns.modelo.Banco;
import br.com.caelum.designpatterns.modelo.Conta;


public class TestaRelatorio {

	public static void main(String[] args) {
		Banco satanander = new Banco("SATANANDER", "(55) 4391-1029", "contato@satanander.com.br", "Rua das Couves n 435");
		
		satanander.adicionar(new Conta("1230-0", "20192-1", "Ariane Souza", 500.0));
		satanander.adicionar(new Conta("1230-0", "49021-4", "Mariana Dantas", 1500.0));
		satanander.adicionar(new Conta("4310-9", "45456-7", "Roberval Dutra", 400.0));
		satanander.adicionar(new Conta("6370-8", "12196-0", "Apalino Ramos", 1900.0));
		satanander.adicionar(new Conta("2190-3", "9092-1", "Catarina Mota", 1200.0));
		satanander.adicionar(new Conta("1112-5", "50129-4", "Melinda Souza", 6500.0));

		String relatorioSimples  = new RelatorioSimples().imprimirRelatorioDo(satanander);
		String relatorioCompleto = new RelatorioComplexo().imprimirRelatorioDo(satanander);
			
		System.out.println(relatorioSimples);
		System.out.println("\n\n----------------\n\n");
		System.out.println(relatorioCompleto);
	}
}

