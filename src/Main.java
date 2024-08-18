public class Main {

	public static void main(String[] args) {
			Cliente venilton = criarCliente("Venilton");

			Conta cc = criarContaCorrente(venilton);
			Conta poupanca = criarContaPoupanca(venilton);

			realizarOperacoes(cc, poupanca);
	}

	private static Cliente criarCliente(String nome) {
			Cliente cliente = new Cliente();
			cliente.setNome(nome);
			return cliente;
	}

	private static Conta criarContaCorrente(Cliente cliente) {
			return new ContaCorrente(cliente);
	}

	private static Conta criarContaPoupanca(Cliente cliente) {
			return new ContaPoupanca(cliente);
	}

	private static void realizarOperacoes(Conta cc, Conta poupanca) {
			cc.depositar(100);
			cc.transferir(100, poupanca);

			cc.imprimirExtrato();
			poupanca.imprimirExtrato();
	}
}
