package entity;

public class Conta {
	
	public Conta() {
		
	}

	private Integer numeroConta;
	private String agencia;
	private Cliente cliente;
	private Double saldo;
	public Integer getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Olá " + cliente.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + 
				" e seu saldo R$" + saldo + " já está disponível para saque.";
	}
	
	
}
