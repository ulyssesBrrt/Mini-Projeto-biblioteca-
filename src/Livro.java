public class Livro {

    int id;
    String titulo;
    String autor;
    boolean estaEmprestado;

    public Livro(int id, String titulo, String autor) {

        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.estaEmprestado = false;
    }
}