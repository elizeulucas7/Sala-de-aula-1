public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Ana";
        aluno1.nota1 = 8;
        aluno1.nota2 = 9;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Lucas";
        aluno2.nota1 = 6;
        aluno2.nota2 = 7;

        aluno1.exibirResultado();
        System.out.println();
        aluno2.exibirResultado();
    }
}
