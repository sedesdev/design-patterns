package br.com.caelum.designpatterns.decorator.investimento;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.designpatterns.modelo.Conta;


public class TestaFiltroConta {

	public static void main(String[] args) {
		Conta c1 = new Conta("1290-0", "198220-0", "Maria das Dores", "22/01/2010", 1190);
		Conta c2 = new Conta("8912-5", "1716-8", "Jackson Almeida", "15/05/2000", 500001);
		Conta c3 = new Conta("7726-4", "9827-0", "Marineide Teles", "10/08/2013", 90);
		Conta c4 = new Conta("8992-8", "122345-2", "Ingrid Souza", "23/10/2013", 3000);
		Conta c5 = new Conta("3225-8", "21290-4", "Jobson Santos", "02/12/1990", 800);
		
		List<Conta> contas = new ArrayList<Conta>();
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		contas.add(c4);
		contas.add(c5);
		
		Filtro filtro = new FiltroSaldoMaiorQue500MilReais(new FiltroSaldoMenorQueCemReais(new FiltroDataAberturaMesCorrente()));
		
		System.out.println(filtro.filtra(contas).size());
	
	}
}

