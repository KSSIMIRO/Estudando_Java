package aula_010823;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EstudoDatas {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalTime agora = LocalTime.now();
        System.out.println(agora);

        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println(dataHoraAtual);
        System.out.println("Ano " + dataHoraAtual.getYear());
        System.out.println("Mes " + dataHoraAtual.getMonthValue());
        System.out.println("Dia " + dataHoraAtual.getDayOfMonth());
        System.out.println(dataHoraAtual.getDayOfWeek());


        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter formatoBr2 = DateTimeFormatter.ofPattern("EEEE/MMMM/yyyy");
        String dataHoraAtualFormatada = dataHoraAtual.format(formatoBr2);
        System.out.println("Data formatada " + dataHoraAtualFormatada);

        int ano = 2023;
        int mes = 12;
        int dia = 7;
        LocalDate dataValida = LocalDate.of(ano, mes, dia);
        System.out.println(dataValida);

        LocalDate data = LocalDate.of(2023, 8, 2); // amanã
        if (hoje.isAfter(data)) {
            System.out.println("A data "+data+" já passou!");
        }
        else {
            System.out.println("A data "+data+" ainda não passou.");
        }

        hoje.isAfter(data); // Verifica se hoje ja passou de data
        hoje.isBefore(data); // Verifica se hoje ainda não passou de data

        // instância -> processo de construir um objeto

    }
}
