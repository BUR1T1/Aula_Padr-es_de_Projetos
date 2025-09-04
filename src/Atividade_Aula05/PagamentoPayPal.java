package Atividade_Aula05;

public class PagamentoPayPal extends FormaDePagamento implements Pagamento {
    
    int taxa_bandeira;

    public PagamentoPayPal(String nome_do_devedor, double valor, int cod_id_pagamento, int taxa_bandeira){
        super(nome_do_devedor, valor, cod_id_pagamento);

        this.taxa_bandeira = taxa_bandeira;
    }

    public void processarpagamento(){
        // definir o que tratar para recebimento de pagamento
        //definir uma logica de validação de forma de pagamento.

    }
}
