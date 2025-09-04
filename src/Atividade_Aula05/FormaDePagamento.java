package Atividade_Aula05;

public class FormaDePagamento {
    
    String nome_do_devedor;
    double valor;
    int cod_id_pagamento;

    public FormaDePagamento(String nome_do_devedor, double valor, int cod_id_pagamento){
        this.nome_do_devedor =nome_do_devedor;
        this.valor = valor;
        this.cod_id_pagamento = cod_id_pagamento;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
