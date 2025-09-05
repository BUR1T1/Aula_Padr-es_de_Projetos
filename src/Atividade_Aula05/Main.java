package Atividade_Aula05;

public class Main {
    public static void main(String[] args) {
        PagamentoService service = new PagamentoService();

        service.processarPagamento(new FactoryCredito(), 500.0);
        service.processarPagamento(new FactoryCredito(), 5000.0);
        service.processarPagamento(new FactoryCredito(), 100.0);

        service.processarPagamento(new FactoryPayPal(), 200.0);
        service.processarPagamento(new FactoryPayPal(), 50.0);

        service.processarPagamento(new FactoryCripto(), 300.0);
        service.processarPagamento(new FactoryCripto(), 2000.0);
    }
}
