package entidades;

public class CadastroCliente {

	private String nome;
	private String email;
	private Integer agencia;
	private Integer conta;
	private String telefone;
	private Double saldo;

	public CadastroCliente(String nome, String email, Integer agencia, Integer conta, String telefone, Double saldo) {
		// ArrayList<CadastroCliente> cadastros = new ArrayList<>();
		// cadastros.add(this);
		this.nome = nome;
		this.email = email;
		this.agencia = agencia;
		this.conta = conta;
		this.telefone = telefone;
		this.saldo = saldo;
	}

	public String listarClientes() {
		return "Nome: " + nome + " Agencia: " + agencia + " Conta: " + conta + " E-mail: " + email + " Telefone: "
				+ telefone + " Saldo ==> R$ " + saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getConta() {
		return conta;
	}

	public void setConta(Integer conta) {
		this.conta = conta;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "CadastroCliente [Nome = " + nome + ", email = " + email + ", agencia = " + agencia + ", conta = " + conta
				+ ", telefone = " + telefone + ", saldo = " + saldo + "]";
	}
	

}
