package heranca.polimorfismo.interfaces.ex3;

public class Midia {
    private String titulo;
    private int anoPublicacao;

    public Midia(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String gerarCodigo(){
        return "LIB-"+this.titulo.substring(0, 3)+anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
}
