public class CaixaEletronico {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(100);
       Conta poupanca = new ContaPoupanca();
        poupanca.depositar(200);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
