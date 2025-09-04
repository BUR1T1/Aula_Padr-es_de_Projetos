package Atividade_Aula05;

public class PagamentoCardCredito extends FormaDePagamento implements Pagamento {
    
    int limite_da_conta;

    public PagamentoCardCredito(String nome_do_devedor, double valor, int cod_id_pagamento, int limite_da_conta){
        super(nome_do_devedor, valor, cod_id_pagamento);

        this.limite_da_conta = limite_da_conta;

    }
    public void processarpagamento(PagamentoCardCredito pagamentoCardCredito){
        if (pagamentoCardCredito.cod_id_pagamento == 65) {
            System.out.println("pagamento reconhecido como credito");
        }else{
            System.out.println("Erro !!! \n Pagamento processado diferente do previsto");
        }

}
}