package br.com.caelum.designpatterns.observer.venda;

import java.util.Arrays;

import br.com.caelum.designpatterns.builder.venda.NotaFiscalBuilder;
import br.com.caelum.designpatterns.modelo.ItemDaNota;
import br.com.caelum.designpatterns.modelo.NotaFiscal;

public class TesteDasAcoesNaNotaFiscal {

	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder(
											Arrays.asList(new EnviadorDeEmail(),
														  new EnviadorDeSms(),
														  new Impressora(),
														  new NotaFiscalDao(),
														  new Multiplicador(3))
										);
		
		NotaFiscal nf = builder.paraEmpresa("Nome da Empresa")
							   .comCNPJ("12.345.678/0001-00")
							   .com(new ItemDaNota("Item 1", 200))
							   .com(new ItemDaNota("Item 2", 300))
							   .com(new ItemDaNota("Item 2", 400))
							   .comObservacoes("Texto de observacao")
							   .constroi();
		
		System.out.println(nf.getValorBruto());
	}
}
