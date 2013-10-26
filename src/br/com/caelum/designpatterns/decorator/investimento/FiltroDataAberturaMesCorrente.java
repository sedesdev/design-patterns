package br.com.caelum.designpatterns.decorator.investimento;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.caelum.designpatterns.modelo.Conta;

public class FiltroDataAberturaMesCorrente extends TemplateFiltragem{

	public FiltroDataAberturaMesCorrente(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	public FiltroDataAberturaMesCorrente() {
	}
	
	@Override
	protected boolean condicaoFiltragemSatisfeita(Conta conta) {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
		String dataAtual  = sdf.format(new Date());
		int mesAtual 	  = Integer.parseInt(dataAtual.substring(0, dataAtual.indexOf("/") - 1));
		int anoAtual      = Integer.parseInt(dataAtual.substring(dataAtual.indexOf("/") + 1, 4));
		
		String dataConta  = sdf.format(conta.getDataAbertura());
		int mesConta 	  = Integer.parseInt(dataConta.substring(0, dataConta.indexOf("/") - 1));
		int anoConta      = Integer.parseInt(dataConta.substring(dataConta.indexOf("/") + 1, 4));
		
		return anoAtual == anoConta && mesAtual == mesConta;
	}
}
