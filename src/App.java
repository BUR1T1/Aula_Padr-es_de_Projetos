import biblioteca.Livro;
import biblioteca.LivroVirtual;
import biblioteca.Revista;

public class App {
    public static void main(String[] args) throws Exception {

        biblioteca.ItenBiblioteca livro01 = new Livro("Sherlock Holmes", "O cara que escreveu e ponto", 1923, false, 354);

        biblioteca.ItenBiblioteca revista01 = new Revista("Fofocas", "laercio silva", 2025, false, "mensal");

        biblioteca.ItenBiblioteca livrovirtual = new LivroVirtual("Amanhecer", "escritor", 2013, false, 334);


        biblioteca.BalcaoDeAluguel.alugra(livrovirtual);

        biblioteca.BalcaoDeAluguel.devolverItem(revista01);

        biblioteca.BalcaoDeAluguel.devolverItem(livrovirtual);

    }
}
