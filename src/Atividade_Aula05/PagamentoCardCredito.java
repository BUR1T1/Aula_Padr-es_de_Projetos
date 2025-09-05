package Atividade_Aula05;

public class PagamentoCardCredito extends FormaDePagamento implements Pagamento {

    int limite_da_conta;

    public PagamentoCardCredito(String nome_do_devedor, double valor,String email, int cod_id_pagamento, int limite_da_conta) {
        super(nome_do_devedor,email, valor, cod_id_pagamento);

        this.limite_da_conta = limite_da_conta;

    }
    @Override
    public void processarpagamento(double valor){
        if (valor <= limite_da_conta) {
            System.out.println("Pagamento com cartão aprovado!");
        } else {
            System.out.println("Limite insuficiente!");
        }
    }

}