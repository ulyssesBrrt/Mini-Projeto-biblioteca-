public class Biblioteca {

    Livro[] livros = new Livro[100];
    int quantidade = 0;

    public void adicionarLivro(Livro livro) throws LimiteAcervoException {

        if (quantidade >= livros.length) {
            throw new LimiteAcervoException();
        }

        livros[quantidade] = livro;
        quantidade++;

        System.out.println("Livro adicionado ao acervo");
    }

    public Livro buscarLivro(int id) throws LivroNaoEncontradoException {

        for (int i = 0; i < quantidade; i++) {

            if (livros[i].id == id) {
                return livros[i];
            }
        }

        throw new LivroNaoEncontradoException();
    }

    public void emprestarLivro(int id)
            throws LivroNaoEncontradoException, EmprestimoInvalidoException {

        Livro livro = buscarLivro(id);

        if (livro.estaEmprestado == true) {
            throw new EmprestimoInvalidoException();
        }

        livro.estaEmprestado = true;

        System.out.println("Livro emprestado com sucesso");
    }

    public void devolverLivro(int id) throws LivroNaoEncontradoException {

        Livro livro = buscarLivro(id);

        livro.estaEmprestado = false;

        System.out.println("Livro devolvido");
    }
}