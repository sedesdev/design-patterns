package br.com.caelum.designpatterns.decorator.investimento;

import java.util.List;

import br.com.caelum.designpatterns.modelo.Conta;

public abstract class Filtro {
    public abstract List<Conta> filtra(List<Conta> contas);
}