package ExemploDeAula;

public class Notificacao_Email implements Notificacao {

    @Override
    public void enviar(String mensagem){
        System.out.println("Enviando email: " + mensagem);
    }

    
}