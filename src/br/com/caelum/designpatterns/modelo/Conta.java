package br.com.caelum.designpatterns.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.caelum.designpatterns.state.investimento.EstadoDeUmaConta;
import br.com.caelum.designpatterns.state.investimento.Positivo;

public class Conta {
	private String titular;
	private String agencia;
	private String numero;
	private Date dataAbertura;
	private double saldo;
	
	private EstadoDeUmaConta estadoAtual;

	public Conta(String agencia, String numero, String titular, String dataAbertura, double saldo) {
		try {
			validaSaldoInicial(saldo);
			this.agencia = agencia;
			this.numero  = numero;
			this.titular = titular;
			this.saldo   = saldo;
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			this.dataAbertura = sdf.parse(dataAbertura);
			this.estadoAtual = new Positivo();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public Conta(String agencia, String numero, String titular, double saldo) {
		validaSaldoInicial(saldo);
		this.agencia = agencia;
		this.numero  = numero;
		this.titular = titular;
		this.saldo   = saldo;
		this.estadoAtual = new Positivo();
	}
	
	public Conta(String titular, double saldo) {
		validaSaldoInicial(saldo);
		this.titular = titular;
		this.saldo   = saldo;
		this.estadoAtual = new Positivo();
	}
	
	public Conta(double saldo) {
		validaSaldoInicial(saldo);
		this.saldo = saldo;
		this.estadoAtual = new Positivo();
	}

	public void validaSaldoInicial(double saldo){
		if (saldo < 0){
			throw new RuntimeException("Saldo inicial não pode ser negativo");
		}
	}
	
	public String getAgencia() {
		return agencia;
	}

	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}
	
	public Date getDataAbertura() {
		return dataAbertura;
	}

	public EstadoDeUmaConta getEstadoAtual() {
		return estadoAtual;
	}
	
	public void depositar(double valor){
		estadoAtual.depositar(this, valor);
	}
	
	public void sacar(double valor){
		estadoAtual.sacar(this, valor);	
	}
	
	public void mudarEstadoAtualPara(EstadoDeUmaConta novoEstado){
		this.estadoAtual = novoEstado;
	}
	
	public void mudarSaldo(double saldo){
		this.saldo = saldo;
	}
}
