package aprendizado.src.dataHora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class dataHoraLocal {
    // data e hora local não leva em consideração fuso-horário
    public static void main(String[] args) {
        exemplos();
    }

    public static void exemplos() {
        // retorna data local
        LocalDate data1 = LocalDate.now();
        System.out.println(data1);

        // retorna data e hora local
        LocalDateTime data2 = LocalDateTime.now();
        System.out.println(data2);

        // retorna data e hora em exato momento (útil para logs, por exemplo)
        Instant data3 = Instant.now();
        System.out.println(data3);

        // retorna data formatada com base em um pattern (padrão)
        LocalDateTime data4 = LocalDateTime.now();

        DateTimeFormatter formatadorDeData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = data4.format(formatadorDeData);

        System.out.println(dataFormatada);
    }
}
