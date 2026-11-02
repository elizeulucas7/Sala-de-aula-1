public class Produto {
    String nome;
    double preco;
    int quantidade;

    public void adicionarEstoque(int quantidadeAdicionada) {
        if (quantidadeAdicionada > 0) {
            quantidade += quantidadeAdicionada;
        }
    }

    public void retirarEstoque(int quantidadeRetirada) {
        if (quantidadeRetirada > 0 && quantidadeRetirada <= quantidade) {
            quantidade -= quantidadeRetirada;
        } else {
            System.out.println("Quantidade inválida ou estoque insuficiente.");
        }
    }

    public void mostrarEstoque() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }
}
