public class App {
    public static void main(String[] args) throws Exception {

        ItenBiblioteca livro01 = new Livro("Sherlock Holmes", "O cara que escreveu e ponto", 1923, false, 354);

        ItenBiblioteca revista01 = new Revista("Fofocas", "laercio silva", 2025, false, "mensal");

        ItenBiblioteca livrovirtual = new LivroVirtual("Amanhecer", "escritor", 2013, false, 334);


        BalcaoDeAluguel.alugra(livrovirtual);

        BalcaoDeAluguel.devolverItem(revista01);

        BalcaoDeAluguel.devolverItem(livrovirtual);

    }
}
