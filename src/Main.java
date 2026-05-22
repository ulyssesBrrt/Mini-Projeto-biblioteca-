

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro(1, "As aventuras da mentira", "Ulysses Barretp");

        try {

            biblioteca.adicionarLivro(livro1);

        } catch (LimiteAcervoException e) {

            System.out.println(e.getMessage());
        }

        try {

            biblioteca.emprestarLivro(1);

        } catch (LivroNaoEncontradoException e) {

            System.out.println(e.getMessage());

        } catch (EmprestimoInvalidoException e) {

            System.out.println(e.getMessage());

        } finally {

            System.out.println("Sessao de atendimento finalizada");
        }

        try {

            biblioteca.emprestarLivro(1);

        } catch (LivroNaoEncontradoException e) {

            System.out.println(e.getMessage());

        } catch (EmprestimoInvalidoException e) {

            System.out.println(e.getMessage());

        } finally {

            System.out.println("Sessao de atendimento finalizada");
        }

        try {

            biblioteca.buscarLivro(99);

        } catch (LivroNaoEncontradoException e) {

            System.out.println(e.getMessage());
        }
    }
}