package biblioteca;

public class LivroVirtual extends ItenBiblioteca{
    
    int tamanho_do_livro;

    public LivroVirtual(String titulo,String autor, int ano_depublicacao, boolean disponibilidade, int tamanho_do_livro){
        super(titulo, ano_depublicacao, disponibilidade, autor);

        this.tamanho_do_livro = tamanho_do_livro;

    }

    @Override
    public String toString() {
        if (disponibilidade = true) {
            System.out.println("Diponivel para aluguel");
        }else{
            System.out.println("Indisponivel para aluguel");
        }
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nAno de pubicação: " + ano_depublicacao + "\nTamanho de espaço ocupado na memoria: " + tamanho_do_livro +"MB";
    }
}
