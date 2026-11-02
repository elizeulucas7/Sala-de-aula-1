
public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "João";
        aluno1.idade = 20;
        aluno1.curso = "ADS";

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Maria";
        aluno2.idade = 22;
        aluno2.curso = "Direito";

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Pedro";
        aluno3.idade = 19;
        aluno3.curso = "Engenharia";

        aluno1.exibirDados();
        System.out.println();

        aluno2.exibirDados();
        System.out.println();

        aluno3.exibirDados();
    }
}
