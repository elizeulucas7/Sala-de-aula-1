public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "O Pequeno Príncipe";
        livro1.autor = "Antoine de Saint-Exupéry";
        livro1.numeroPaginas = 96;

        Livro livro2 = new Livro();
        livro2.titulo = "Dom Casmurro";
        livro2.autor = "Machado de Assis";
        livro2.numeroPaginas = 256;

        Livro livro3 = new Livro();
        livro3.titulo = "A Hora da Estrela";
        livro3.autor = "Clarice Lispector";
        livro3.numeroPaginas = 88;

        livro1.mostrarDetalhes();
        livro1.abrirLivro();
        livro1.mostrarDetalhes();
        System.out.println();
        livro2.abrirLivro();
        livro2.fecharLivro();
        livro2.mostrarDetalhes();
        System.out.println();
        livro3.mostrarDetalhes();
    }
}
