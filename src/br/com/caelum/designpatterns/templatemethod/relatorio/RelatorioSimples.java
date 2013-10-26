package br.com.caelum.designpatterns.templatemethod.relatorio;

import br.com.caelum.designpatterns.modelo.Banco;
import br.com.caelum.designpatterns.modelo.Conta;

public class RelatorioSimples extends TemplateRelatorio {

	@Override
	protected String imrimirRodape(Banco banco) {
		return "\n" + banco.getNome() + " Tel.: " + banco.getTelefone();
	}

	@Override
	protected String imprimirCorpo(Banco banco) {
		String clientes = "";
		
		for (Conta conta : banco.getContas()) {
			clientes += conta.getTitular() + " >>> R$ " + conta.getSaldo() + "\n";
		}
		return clientes;
	}

	@Override
	protected String imprimirCabecalho(Banco banco) {
		return banco.getNome() + " Tel.: " + banco.getTelefone() + "\n\n";
	}
}
