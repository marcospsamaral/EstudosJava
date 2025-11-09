package encapsulamento;

import java.util.ArrayList;

public class PrincipalEncapsulamento {
    public static void main(String args[]){
        ArrayList<Contato> contatos = new ArrayList<>();

        contatos.add(new Contato("João Silva", "(11) 99999-0000"));
        contatos.add(new Contato("Luana Santos", "(21) 98888-0000"));
        contatos.add(new Contato("Pedro Oliveira", "(31) 97777-0000"));

        for (int i = 0; i < contatos.size(); i++){
            System.out.println(i+1 + ". " + contatos.get(i).getName() + " - " + contatos.get(i).getNumber());
        }

        System.out.println("================================================================================");

        Usuario user = new Usuario("Soulrcos", "12345");
        user.setPassword("123", "novaSenha");
        user.setPassword("12345", "novaSenha");

        System.out.println("================================================================================");

        Disciplina matematica = new Disciplina("Matemática");
        matematica.adicionarNota(7.5);
        matematica.adicionarNota(11.0);
        matematica.adicionarNota(8.0);
        matematica.adicionarNota(-3.0);
        matematica.adicionarNota(9.5);
        System.out.println("Total notas válidas: " + matematica.contarNotasValidas());
        System.out.printf("Média em %s: %.2f", matematica.getDisciplina(), matematica.retornaMedia());

    }
}
