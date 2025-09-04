package biblioteca;

public interface BalcaoDeAluguel {
    
    static void alugra(ItenBiblioteca itenBiblioteca){

        if (itenBiblioteca.disponibilidade = true) {
            System.out.println("---------------------------------");
            System.out.println("Livro selecionado alugado: " + itenBiblioteca.titulo);
            System.out.println("---------------------------------");
            itenBiblioteca.disponibilidade = false;
        }else{
            System.out.println("---------------------------------");
            System.out.println("Indisponivel para aluguel: " + itenBiblioteca.titulo);
            System.out.println("---------------------------------");
        }
    }

    static void devolverItem(ItenBiblioteca itenBiblioteca){

        if (itenBiblioteca.disponibilidade = false) {
            System.out.println("---------------------------------");
            System.out.println("Item devolvido. \nnovamente diponivel para troca\nDevolvido: " + itenBiblioteca.titulo);
            System.out.println("---------------------------------");
        } else{
            System.out.println("---------------------------------");
            System.out.println("Item já consta em extoque." + itenBiblioteca.titulo + " \nAção invalida para o Item");
            System.out.println("---------------------------------");
        }
    }

    static void chamarItem(ItenBiblioteca itenBiblioteca){
        System.out.println(itenBiblioteca);
    }
}
