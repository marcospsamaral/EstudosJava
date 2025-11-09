package encapsulamento;

import java.util.ArrayList;

public class Disciplina {
    private String disciplina;
    private ArrayList<Double> notas;

    public Disciplina(String disciplina){
        this.disciplina = disciplina;
        this.notas = new ArrayList<>();
    }

    public String getDisciplina(){
        return this.disciplina;
    }

    public double retornaMedia(){
        double soma = 0;
        for (double nota : notas){
            soma += nota;
        }
        return soma/contarNotasValidas();
    }

    public void adicionarNota(double nota){
        if (nota >= 0 && nota <= 10){
            notas.add(nota);
            return;
        }
        System.out.printf("Nota inválida ignoradas: %.1f\n", nota);
    }

    public int contarNotasValidas(){
        return notas.size();
    }
}
