import java.util.ArrayList;
import java.util.Scanner;


public class exercicioLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaConvidados = new ArrayList<String>();
        boolean fim = true;

        while (fim) {
            System.out.println("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): ");
            String nomeDigitado = scanner.nextLine().trim().toLowerCase();
            switch (nomeDigitado){
                case "ver":
                    System.out.println(listaConvidados);
                break;
                case "sair":
                    fim = false;
                break;
                default:
                   if (listaConvidados.contains(nomeDigitado)){
                       System.out.println("Essa pessoa já está na sua lista de convidados");
                   } else{
                       listaConvidados.add(nomeDigitado);
                   }

                break;
            }
        }
    }
}