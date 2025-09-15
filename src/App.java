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

        Client c1 = new Client(1, "Marcos");
        Client c2 = new Client(2, "Junior");
        Client c3 = new Client(3, "Felipe");

        Account cc1 = new Account(500, c1);
        Account cc2 = new Account(500, c2);
        Account cc3 = new Account(500, c3);
    
        Account[] contas = {cc1, cc2, cc3};

        accountManager.setAccounts(contas);

        accountManager.depositar(c1, 150.50);
        accountManager.sacar(c2, 300);

        accountManager.verContas();

        AccountManager accountManager2 = AccountManager.getInstance();

        accountManager2.verContas();

    }
}
