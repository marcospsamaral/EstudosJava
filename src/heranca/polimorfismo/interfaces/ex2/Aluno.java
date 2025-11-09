package heranca.polimorfismo.interfaces.ex2;

public class Aluno extends Pessoa{
    final double nota;

    public Aluno(String name, int idade, double nota) {
        super(name, idade);
        this.nota = nota;
    }

    @Override
    public void exibirDados(){
        System.out.printf("Nome: %s - Idade: %d - Nota: %.2f\n", this.name, this.idade, this.nota);
    }

}
