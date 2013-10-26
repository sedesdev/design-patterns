package br.com.caelum.designpatterns.templatemethod.relatorio;

import br.com.caelum.designpatterns.modelo.Banco;

public abstract class TemplateRelatorio {

	public final String imprimirRelatorioDo(Banco banco){
		String relatorio = "";
		relatorio += imprimirCabecalho(banco);
		relatorio += imprimirCorpo(banco);
		relatorio += imrimirRodape(banco);
		return relatorio;
	}

	protected abstract String imrimirRodape(Banco banco);

	protected abstract String imprimirCorpo(Banco banco);

	protected abstract String imprimirCabecalho(Banco banco);
}
