package br.com.caelum.designpatterns.builder.venda;

import br.com.caelum.designpatterns.modelo.ItemDaNota;
import br.com.caelum.designpatterns.modelo.NotaFiscal;

public class TesteDaNotaFiscal {

	public static void main(String[] args) {
		NotaFiscalBuilder builder 
				= new NotaFiscalBuilder()
					.paraEmpresa("Nome da Empresa")
					.comCNPJ("12.345.678/0001-00")
					.com(new ItemDaNota("Item 1", 200))
					.com(new ItemDaNota("Item 2", 300))
					.com(new ItemDaNota("Item 2", 400))
					.comObservacoes("Texto de observacao");
		
		NotaFiscal nf = builder.constroi();
		
		System.out.println(nf.getValorBruto());
	}
}
