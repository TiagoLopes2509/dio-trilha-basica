package entity;

public class Cliente {
	
	public Cliente() {
		
	}
	
	private String nomeCliente;
	private String CPF;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public String getCPF() {
		return CPF;
	}
	
	public void setCPF(String cpf) {
		CPF = cpf;
	}
	
	@Override
	public String toString() {
		return "O Nome do Cliente é: " + nomeCliente;
	}
	
	

}
