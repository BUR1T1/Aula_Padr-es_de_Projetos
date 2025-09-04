package Atividade_Aula05;

public class FactoryPayPal extends Factorypagamento{

    public Pagamento criarpagamento(){
        return new PagamentoPayPal(null, 0, 0, 0);
    }
}
