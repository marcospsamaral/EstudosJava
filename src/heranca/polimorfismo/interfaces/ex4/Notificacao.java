package heranca.polimorfismo.interfaces.ex4;

public class Notificacao {
    public void enviarMensagem(String mensagem){
        System.out.println("Mensagem enviada para todos: " + mensagem);
    }

    public void enviarMensagem(String nome, String mensagem){
        System.out.printf("Mensagem enviada para %s: %s\n", nome, mensagem);
    }

    public void enviarMensagem(String nome, String mensagem, int qtdEnvio){
        for (int i = 1; i <= qtdEnvio; i++){
            System.out.printf("Mensagem para %s: %s\n", nome, mensagem);
        }
    }
}
