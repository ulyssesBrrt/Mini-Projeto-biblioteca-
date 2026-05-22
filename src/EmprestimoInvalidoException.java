public class EmprestimoInvalidoException extends Exception {

    public EmprestimoInvalidoException() {
        super("Livro ja esta emprestado");
    }
}