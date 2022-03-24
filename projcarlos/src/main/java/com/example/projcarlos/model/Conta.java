package com.example.projcarlos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // armazenamento
@Table(name = "fluxo_caixa") // nome da tabela no BD
public class Conta {

	@Id
	
	@Column(name = "agencia")
	private int agencia;

	@Column(name = "conta")
	private int conta;

	@Column(name = "fluxo")
	private int fluxo;

	@Column(name = "entrada")
	private Double entrada;

	@Column(name = "saida")
	private Double saida;

	public Conta() {
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getFluxo() {
		return fluxo;
	}

	public void setFluxo(int fluxo) {
		this.fluxo = fluxo;
	}

	public Double getEntrada() {
		return entrada;
	}

	public void setEntrada(Double entrada) {
		this.entrada = entrada;
	}

	public Double getSaida() {
		return saida;
	}

	public void setSaida(Double saida) {
		this.saida = saida;
	}

}
