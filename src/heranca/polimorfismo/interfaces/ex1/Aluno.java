package heranca.polimorfismo.interfaces.ex1;

public class Aluno {
    protected String name;
    protected String type;

    public Aluno(String name, String type){
        this.name = name;
        this.type = type;
    }

    public void identificar(){
        System.out.printf("Aluno: %s - Tipo: %s\n", this.name, this.type);
    }
}
