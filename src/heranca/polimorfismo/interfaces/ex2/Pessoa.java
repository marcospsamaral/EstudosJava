package heranca.polimorfismo.interfaces.ex2;

public class Pessoa {
    protected String name;
    protected int idade;

    public Pessoa(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    public void exibirDados(){
        System.out.printf("Nome: %s - Idade: %d\n", this.name, this.idade);
    }
}
