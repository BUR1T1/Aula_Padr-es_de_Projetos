package Atividade_Aula05;

public class FactoryCripto extends Factorypagamento{
    
    public Pagamento criarpagamento(){
        return new PagamentoCriptomoeda(null, 0, 0, null, 0);
    }
}
