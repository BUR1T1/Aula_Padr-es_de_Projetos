package ExemploDeAula;

public class notificacaoService {

    public void enviarnotificacao(NotificacaoFactory factory, String mensagem){
        Notificacao notificacao = factory.criarNotificacao();

        notificacao.enviar(mensagem);
    }
    
}
