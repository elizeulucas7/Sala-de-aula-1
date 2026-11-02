public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Caderno";
        produto.preco = 15.50;
        produto.quantidade = 10;

        produto.mostrarEstoque();
        produto.adicionarEstoque(5);
        produto.mostrarEstoque();
        produto.retirarEstoque(3);
        produto.mostrarEstoque();
        produto.retirarEstoque(20);
        produto.mostrarEstoque();
    }
}
