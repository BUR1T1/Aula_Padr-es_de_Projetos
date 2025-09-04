package biblioteca;

public class Revista extends ItenBiblioteca  {
    
    String frequencia_de_publi;

    public Revista(String titulo,String autor, int ano_depublicacao, boolean disponibilidade, String frequencia_de_publi){
        super(titulo, ano_depublicacao, disponibilidade, autor);

        this.frequencia_de_publi = frequencia_de_publi;

    }
    @Override
    public String toString() {
        if (disponibilidade = true) {
            System.out.println("Diponivel para aluguel");
        }else{
            System.out.println("Indisponivel para aluguel");
        }

        return "Titulo: " + titulo + "\nAutor: " + autor + "\nAno de pubicação: " + ano_depublicacao + "\nFrequencia de publicação: " + frequencia_de_publi;
    }

}
