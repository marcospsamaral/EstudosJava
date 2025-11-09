package orientacao.objetos;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade)
    {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public void ExibirProduto(){
        System.out.printf("Nome: %s\nPreço: R$ %.2f\nQuantidade: %d \n", nome, preco, quantidade);
    }

    public double precoTotal(){
        return preco*quantidade;
    }

}
