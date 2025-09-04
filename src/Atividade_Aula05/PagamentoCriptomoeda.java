package Atividade_Aula05;

public class PagamentoCriptomoeda extends FormaDePagamento implements Pagamento {
    
        String modeloCripto;
    int saldo_cripto;
    
    public PagamentoCriptomoeda(String nome_do_devedor, double valor, int cod_id_pagamento, String modeloCripto, int saldo_cripto){
        super(nome_do_devedor, valor, cod_id_pagamento);

        this.modeloCripto = modeloCripto;
        this.saldo_cripto = saldo_cripto;
    }

    public void processarpagamento(){ 
        // definir o que tratar para recebimento de pagamento
        //definir uma logica de validação de forma de pagamento.
    }
}
