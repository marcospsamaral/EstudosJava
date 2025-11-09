import java.sql.SQLOutput;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class exercicioData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("HH:mm");

        /*
        LocalDate dataCompra = LocalDate.now();
        LocalDate dataParcela = LocalDate.of(2025, 5, 25);

        System.out.printf("Data compra: %s%nData Parcela: %s%nData Parcela mais 30 dias: %s\n\n", dataCompra, dataParcela, dataParcela.plusDays(30));

        DateTimeFormatter teste = DateTimeFormatter.ofPattern("HH:mm");

        String tarefa = "Relatório semanal";
        System.out.println("Nova tarefa: " + tarefa);
        LocalDate dataAgora = LocalDate.now();
        LocalTime horaAgora = LocalTime.now();
        System.out.println("Data atual: " + formatadorData.format(dataAgora));
        System.out.println("Hora atual: " + teste.format(horaAgora));*/


       // System.out.print("\nHora inicial: ");
        //String hora1Str = input.nextLine();
        //LocalTime hora1 = LocalTime.parse(hora1Str);
        //LocalTime hora2 = LocalTime.of(16, 45, 00);
        //Duration diferenca = Duration.between(hora1, hora2);
        //System.out.println("Diferença de tempo: " + diferenca.toHours() + " horas e " + diferenca.toMinutesPart() + " minutos");

        /*System.out.println("\nDigite a data de início do projeto: ");
        String dataInicioProjetoStr = input.nextLine().trim();

        System.out.println("Digite o prazo estimado: ");
        int prazoEstimado = input.nextInt();

        LocalDate dataInicioProjeto = LocalDate.parse(dataInicioProjetoStr, formatadorData);
        System.out.println("Data de Entrega: " + formatadorData.format(dataInicioProjeto.plusDays(prazoEstimado)));*/

        System.out.print("Digite o horário de entrada (HH:mm): ");
        String horaEntradaStr = input.nextLine().trim();
        System.out.print("Digite a carga horária diária (em horas): ");
        int expediente = input.nextInt();
        System.out.print("Digite o horário real de saída (HH:mm): ");
        String horaSaidaStr = input.next().trim();

        LocalTime horaEntrada = LocalTime.parse(horaEntradaStr, formatadorHora);
        LocalTime expedienteEsperado = horaEntrada.plusHours(expediente);
        LocalTime horaSaida = LocalTime.parse(horaSaidaStr, formatadorHora);
        Duration saldoDeHoras = Duration.between(expedienteEsperado, horaSaida);

        System.out.println("\nHorário de entrada: " + horaEntrada);
        System.out.println("Horário de saída previsto: " + expedienteEsperado);
        System.out.println("Horário real de saída: " + horaSaida);

        String sinal = (expedienteEsperado.equals(horaSaida) ? "" : (expedienteEsperado.isAfter(horaSaida) ? "-" : "+"));

        System.out.println("Saldo de horas: " + sinal + Math.abs(saldoDeHoras.toHours()) + "h " + Math.abs(saldoDeHoras.toMinutesPart()) + "min");

    }
}
