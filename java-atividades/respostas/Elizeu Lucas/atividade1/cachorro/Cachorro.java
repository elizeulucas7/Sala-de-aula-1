public class Cachorro {
    String nome;
    String raca;
    int idade;

    public void latir() {
        System.out.println(nome + " está latindo: Au au!");
    }

    public void brincar() {
        System.out.println(nome + " está brincando.");
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade + " anos");
    }
}
