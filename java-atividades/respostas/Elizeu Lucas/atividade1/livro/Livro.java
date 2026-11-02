public class Livro {
    String titulo;
    String autor;
    int numeroPaginas;
    boolean aberto;

    public void abrirLivro() {
        aberto = true;
        System.out.println("Livro aberto.");
    }

    public void fecharLivro() {
        aberto = false;
        System.out.println("Livro fechado.");
    }

    public void mostrarDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + numeroPaginas);
        System.out.println("Estado: " + (aberto ? "aberto" : "fechado"));
    }
}
