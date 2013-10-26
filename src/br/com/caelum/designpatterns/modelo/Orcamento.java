package br.com.caelum.designpatterns.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.caelum.designpatterns.state.imposto.EmAprovacao;
import br.com.caelum.designpatterns.state.imposto.EstadoDeUmOrcamento;

public class Orcamento {

    private double valor;
	private final List<Item> itens;
	private EstadoDeUmOrcamento estadoAtual;

	public Orcamento(double valor) {
		this.valor  = valor;
		itens       = new ArrayList<Item>();
		estadoAtual = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	public void adicionar(Item item){
		itens.add(item);
	}
	
	public void desconta(double valorADescontar){
		this.valor -= valorADescontar;
	}
	
	public void mudaEstadoAtualPara(EstadoDeUmOrcamento novoEstado){
		this.estadoAtual = novoEstado;
	}
	
	public void aprova(){
		this.estadoAtual.aprova(this);
	}

	public void reprova(){
		this.estadoAtual.reprova(this);
	}

	public void finaliza(){
		this.estadoAtual.finaliza(this);
	}

	public boolean possui(String nomeDoItem) {
		for (Item item : this.itens) {
			if (item.getNome().equals(nomeDoItem))
				return true;
		}
		return false;
	}
	
	public void aplicaDescontoExtra(){
		this.estadoAtual.aplicaDescontoExtra(this);
	}
}
