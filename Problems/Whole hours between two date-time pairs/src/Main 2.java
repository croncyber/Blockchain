import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateTime = scanner.nextLine();
        String dateTime2 = scanner.nextLine();
        LocalDateTime localDateTime1 = LocalDateTime.parse(dateTime);
        LocalDateTime localDateTime2 = LocalDateTime.parse(dateTime2);
        Duration duration = Duration.between(localDateTime1, localDateTime2);

        System.out.println(Math.abs(duration.toHours()));
    }
}