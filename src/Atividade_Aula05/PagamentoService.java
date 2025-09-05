package Atividade_Aula05;

public class PagamentoService {
    public void processarPagamento(Factorypagamento factory, double valor) {
        Pagamento pagamento = factory.criarpagamento();
        pagamento.processarpagamento(valor);
}
}
