package br.com.caelum.designpatterns.builder.venda;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.designpatterns.modelo.ItemDaNota;
import br.com.caelum.designpatterns.modelo.NotaFiscal;
import br.com.caelum.designpatterns.observer.venda.AcaoAposGerarNota;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosOsItens = new ArrayList<ItemDaNota>();
	private double valorBruto;
	private double imposto;
	private String observacoes;
	private Calendar data = Calendar.getInstance();
	private List<AcaoAposGerarNota> todasAsAcoes = new ArrayList<AcaoAposGerarNota>();

	public NotaFiscalBuilder() {
	}
	
	public NotaFiscalBuilder(List<AcaoAposGerarNota> acoes) {
		todasAsAcoes.addAll(acoes);
	}
	
	public NotaFiscalBuilder paraEmpresa(String razaoSocial){
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCNPJ(String cnpj){
		this.cnpj = cnpj;
		return this;
	}
	
	public NotaFiscalBuilder com(ItemDaNota item){
		todosOsItens.add(item);
		valorBruto += item.getValor();
		imposto    += item.getValor() * 0.05;
		return this;
	}
	
	public NotaFiscalBuilder comObservacoes(String observacoes){
		this.observacoes = observacoes;
		return this;
	}
	
	public NotaFiscalBuilder naData(Calendar data){
		this.data = data;
		return this;
	}
	
	public void adicionar(AcaoAposGerarNota novaAcao){
		todasAsAcoes.add(novaAcao);
	}
	
	public NotaFiscal constroi(){
		NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, imposto, todosOsItens, observacoes);
	 
		for (AcaoAposGerarNota acao : todasAsAcoes) {
			acao.executa(notaFiscal);
		}
		
		return notaFiscal;
	}
}
