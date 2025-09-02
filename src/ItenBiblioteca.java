public class ItenBiblioteca implements BalcaoDeAluguel{

    String titulo;
    int ano_depublicacao;
    String autor;
    boolean disponibilidade;

    public ItenBiblioteca(
    String titulo,
    int ano_depublicacao,
    boolean disponibilidade,
    String autor
    ){
        this.titulo = titulo;
        this.ano_depublicacao = ano_depublicacao;
        this.disponibilidade = disponibilidade;
        this.autor = autor;

    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + "Autor: " + autor + "Ano de pubicação: " + ano_depublicacao;
    }

}
