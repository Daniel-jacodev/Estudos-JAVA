public class Main {
    public static  void main(String[] arg){
        Cliente cliente = new Cliente();
        cliente.setNome("dedé");
        
        Conta cc  = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
    }
}
