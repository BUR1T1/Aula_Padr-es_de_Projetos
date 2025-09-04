package ExemploDeAula;

public class EmailFactory extends NotificacaoFactory {
    public Notificacao criarNotificacao(){
        return new Notificacao_Email();
    }
}
