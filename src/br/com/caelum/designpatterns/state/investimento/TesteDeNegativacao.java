package br.com.caelum.designpatterns.state.investimento;

import br.com.caelum.designpatterns.modelo.Conta;

public class TesteDeNegativacao {
	public static void main(String[] args) {
		Conta conta = new Conta("Marcos Prado", 500);
		
		conta.depositar(300);
		System.out.println("Saldo apos deposito " + conta.getSaldo() + " Status::: " + conta.getEstadoAtual());
		
		conta.sacar(600);
		System.out.println("Saldo apos saque " + conta.getSaldo() + " Status::: " + conta.getEstadoAtual());

		conta.sacar(300);
		System.out.println("Saldo apos saque " + conta.getSaldo() + " Status::: " + conta.getEstadoAtual());
		
		conta.depositar(500);
		System.out.println("Saldo apos deposito " + conta.getSaldo() + " Status::: " + conta.getEstadoAtual());
	}
}
