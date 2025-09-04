package biblioteca;

public class Livro extends ItenBiblioteca {
    
    int quantidade_de_pagina;

    public Livro(String titulo,String autor, int ano_depublicacao, boolean disponibilidade, int quantidade_de_pagina){
       super(titulo, ano_depublicacao, disponibilidade, autor);

        this.quantidade_de_pagina = quantidade_de_pagina;
    }

    @Override
    public String toString() {

        if (disponibilidade = true) {
            System.out.println("Diponivel para aluguel");
        }else{
            System.out.println("Indisponivel para aluguel");
        }

        return "Titulo: " + titulo + "Autor: " + autor + "Ano de pubicação: " + ano_depublicacao + "Quantidade de pagoinas: " + quantidade_de_pagina;
    }
}
