package heranca.polimorfismo.interfaces.ex2;

public class Docente extends Pessoa{
    final String disciplina;

    public Docente(String name, int idade, String disciplina) {
        super(name, idade);
        this.disciplina = disciplina;
    }

    @Override
    public void exibirDados(){
        System.out.printf("Nome: %s - Idade: %d - Disciplina: %s\n", this.name, this.idade, this.disciplina);
    }
}
