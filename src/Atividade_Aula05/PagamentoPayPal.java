package Atividade_Aula05;

public class PagamentoPayPal extends FormaDePagamento implements Pagamento {
    
    int limite_da_conta;

    public PagamentoPayPal(String nome_do_devedor, double valor, String email, int cod_id_pagamento, int taxa_bandeira){
        super(nome_do_devedor, email,valor, cod_id_pagamento);

        this.limite_da_conta = limite_da_conta;
    }


    public int getLimite_da_conta() {
        return limite_da_conta;
    }

    public void setLimite_da_conta(int limite_da_conta) {
        this.limite_da_conta = limite_da_conta;
    }


    public String toString() {
        return "PagamentoPayPal{" +
                "\nnome do devedor: " + nome_do_devedor +
                "\nvalor" + valor+
                 "\nlimite da conta=" + limite_da_conta +
                "" +
                '}';
    }

    @Override
    public void processarpagamento(double valor) {
        if (nome_do_devedor != null && nome_do_devedor.contains("@")) {
            System.out.println("Pagamento via PayPal aprovado para " + nome_do_devedor + " no valor de R$ " + valor);
        } else {
            System.out.println("Erro: Conta PayPal inválida.");
        }
    }
}

