package heranca.polimorfismo.interfaces.ex3;

public class Revista extends Midia{
    private String edicao;

    public Revista(String titulo, int anoPublicacao, String edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    public void exibirInfo(){
        System.out.println("Código: "+gerarCodigo()+" | Revista: \"" + getTitulo() + "\" - Edicao: " + this.edicao);
    }
}
