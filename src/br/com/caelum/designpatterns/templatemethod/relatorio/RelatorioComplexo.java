package br.com.caelum.designpatterns.templatemethod.relatorio;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.caelum.designpatterns.modelo.Banco;
import br.com.caelum.designpatterns.modelo.Conta;

public class RelatorioComplexo extends TemplateRelatorio{

	@Override
	protected String imrimirRodape(Banco banco) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		String data = sdf.format(new Date());
		return "\n " + banco.getEmail() + "  Data: " + data;
	}

	@Override
	protected String imprimirCorpo(Banco banco) {
		String clientes = "";
		
		for (Conta conta : banco.getContas()) {
			clientes += conta.getTitular() + " | AG: " + conta.getAgencia() + " Nº " + conta.getNumero()  +  " >>> R$ " + conta.getSaldo() + "\n";
		}
		return clientes;
	}

	@Override
	protected String imprimirCabecalho(Banco banco) {
		return banco.getNome() + "  Endereço " + banco.getEndereco() + " Tel.: " + banco.getTelefone() + "\n\n";
	}
}
