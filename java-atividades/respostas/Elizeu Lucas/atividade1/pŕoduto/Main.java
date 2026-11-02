public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Teclado", 100.00, 10);
        Produto produto2 = new Produto("Mouse", 50.00, 20);
        Produto produto3 = new Produto("Monitor", 800.00, 5);

        produto1.exibirProduto();
        System.out.println();

        produto2.exibirProduto();
        System.out.println();

        produto3.exibirProduto();
        System.out.println();

        produto1.aplicarDesconto(10);

        System.out.println();
        produto1.exibirProduto();
    }
}
