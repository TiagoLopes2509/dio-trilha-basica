package principal;

import java.util.Scanner;

import entity.Cliente;
import entity.Conta;

public class main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		Conta conta = new Conta();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu nome:");
		String nome = sc.nextLine(); 
		
		System.out.println("Digite o seu CPF:");
		String cpf = sc.nextLine(); 
		
		cliente.setNomeCliente(nome);
		cliente.setCPF(cpf);
		
		System.out.println("Digite agência: ");
		String agência = sc.nextLine();
		
		System.out.println("Digite o número da conta: ");
		Integer numeroConta = sc.nextInt();
		
		conta.setAgencia(agência);
		conta.setNumeroConta(numeroConta);
		conta.setSaldo(2379.25);
		conta.setCliente(cliente);
		
		System.out.println(conta);
		
	}
}
