package br.com.caelum.designpatterns.chainofresponsability.desconto;

import br.com.caelum.designpatterns.modelo.Orcamento;

public interface Desconto {
    double desconta(Orcamento orcamento);
    void setProximo(Desconto proximo);
}
