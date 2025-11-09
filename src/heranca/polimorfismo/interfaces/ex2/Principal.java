package heranca.polimorfismo.interfaces.ex2;

public class Principal {
    public static void main(String args[]){
        Aluno aluno1 = new Aluno("Julia", 16, 8.5);
        Aluno aluno2 = new Aluno("Caio", 17, 7.2);

        Docente docente1 = new Docente("Marta", 48, "Matemática");
        Docente docente2 = new Docente("Roberto", 46, "História");

        aluno1.exibirDados();
        aluno2.exibirDados();
        docente1.exibirDados();
        docente2.exibirDados();
    }
}
