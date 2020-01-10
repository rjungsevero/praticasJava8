import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasRio = LocalDate.of(2020, Month.JULY, 24);
        int anos = olimpiadasRio.getYear() - hoje.getYear();
        System.out.println(anos);

        Period period = Period.between(hoje, olimpiadasRio);
        System.out.println(period.getDays());

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

        LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
        System.out.println(proximasOlimpiadas.format(formatador));
        System.out.println(hoje.format(formatador));

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorComHoras));

        LocalDate agoraSemHora = agora.toLocalDate();
        System.out.println(agoraSemHora.format(formatador));

        LocalTime intervalo = LocalTime.now();
        System.out.println(intervalo);
    }
}
