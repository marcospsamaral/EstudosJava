package orientacao.objetos;

public class Tarefa {
    String descricao;
    boolean concluida;

    public Tarefa(String descricao, boolean concluida){
        this.descricao = descricao;
        this.concluida = concluida;
    }

    public void ExibirTarefa(){
        System.out.println("Tarefa: " + descricao + " - Status: " + (concluida ? " Concluído" : " Pendente"));
    }
}
