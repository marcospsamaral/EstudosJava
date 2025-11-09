package encapsulamento;

public class Usuario {
    private String user;
    private String password;

    public Usuario(String user, String password){
        this.user = user;
        this.password = password;
    }

    public void setPassword(String currPassword, String newPassword){
        if (this.password == currPassword){
            this.password = newPassword;
            System.out.println("Senha alterada com sucesso!");
            return;
        }
        System.out.println("Senha atual incorreta. Não foi possível alterar sua senha.");
    }
}
