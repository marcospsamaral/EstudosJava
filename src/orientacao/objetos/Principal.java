package orientacao.objetos;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String args[]){
        Produto produto1 = new Produto("Mouse Gamer", 60, 2);
        Produto produto2 = new Produto("Teclado", 120, 1);
        List<Produto> listaProd = new ArrayList<>();
        listaProd.add(produto1);
        listaProd.add(produto2);

        double soma = 0;

        for (Produto p : listaProd){
            p.ExibirProduto();
            soma += p.precoTotal();
            System.out.println("");
        }

        System.out.printf("Total da compra: %.2f", soma);

        System.out.println("\n==============================================================================\n");

        Tarefa t1 = new Tarefa("Estudar Java", false);
        Tarefa t2 = new Tarefa("Tomar banho", true);
        ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();
        tarefas.add(t1);
        tarefas.add(t2);

        for (Tarefa tarefa : tarefas){
            tarefa.ExibirTarefa();
        }
    }
}
