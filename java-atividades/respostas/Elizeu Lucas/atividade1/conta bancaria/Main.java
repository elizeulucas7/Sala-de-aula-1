
public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.titular = "João";
        conta.numeroConta = 12345;
        conta.saldo = 500.00;

        conta.depositar(200.00);
        conta.sacar(100.00);
        conta.exibirSaldo();
    }
}
