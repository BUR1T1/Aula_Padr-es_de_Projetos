package Atividade_Aula05;

public class FactoryCredito extends Factorypagamento{
    
    public Pagamento criarpagamento(){

        return new PagamentoCardCredito(null,0,null,0,0);
    }
}
