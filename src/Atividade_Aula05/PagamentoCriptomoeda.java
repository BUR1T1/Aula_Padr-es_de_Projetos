package Atividade_Aula05;

public class PagamentoCriptomoeda extends FormaDePagamento implements Pagamento {
    
        String modeloCripto;
        Double saldo_cripto;
    
    public PagamentoCriptomoeda(String nome_do_devedor, double valor, String email, int cod_id_pagamento, Double saldo_cripto){
        super(nome_do_devedor,email, valor, cod_id_pagamento);

        this.modeloCripto = modeloCripto;
        this.saldo_cripto = saldo_cripto;
    }

    public String getModeloCripto() {
        return modeloCripto;
    }

    public void setModeloCripto(String modeloCripto) {
        this.modeloCripto = modeloCripto;
    }

    public Double getSaldo_cripto() {
        return saldo_cripto;
    }

    public void setSaldo_cripto(Double saldo_cripto) {
        this.saldo_cripto = saldo_cripto;
    }

    public void processarpagamento(double valor){

        if (getSaldo_cripto() >= valor) {
            System.out.println("PAGAMENTO PROCESSADO COM SUCESSO - Pagamento em criptomoeda válido" +
                    "\n SALDO SUFICIENTE");
        } else {
            System.out.println("ERRO - Saldo insuficiente em criptomoeda para o pagamento");
        }
    }

    public static class App {
        public static void main(String[] args) throws Exception {

        }
    }

    public static class main {
        public static void main(String[] args) {

        }
    }
}
