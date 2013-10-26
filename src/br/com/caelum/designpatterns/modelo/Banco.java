package br.com.caelum.designpatterns.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {

	private final String nome;
	private final String telefone;
	private final String email;
	private final String endereco;
	private final List<Conta> contas;
	
	public Banco(String nome, String telefone, String email, String endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		this.contas = new ArrayList<Conta>();
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public String getEndereco() {
		return endereco;
	}

	public List<Conta> getContas() {
		return Collections.unmodifiableList(contas);
	}

	public void adicionar(Conta conta){
		this.contas.add(conta);
	}
}
