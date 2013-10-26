package br.com.caelum.designpatterns.decorator.investimento;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.designpatterns.modelo.Conta;

public abstract class TemplateFiltragem extends Filtro{

	protected Filtro outroFiltro;
	
	public TemplateFiltragem(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}
	
	public TemplateFiltragem() {
	}
	
    protected List<Conta> continuarOutroFiltro(List<Conta> contas){
    	return outroFiltro != null ? outroFiltro.filtra(contas) : new ArrayList<Conta>();
    }

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> resultado = new ArrayList<Conta>();
		
		for (Conta conta : contas) {
			if (condicaoFiltragemSatisfeita(conta)){
				resultado.add(conta);
			}
		}
		
		resultado.addAll(continuarOutroFiltro(contas));
		
		return resultado;
	}

	protected abstract boolean condicaoFiltragemSatisfeita(Conta conta);
}
