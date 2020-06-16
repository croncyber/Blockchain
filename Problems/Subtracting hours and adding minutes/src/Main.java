import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateTime = scanner.nextLine();
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime);
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        System.out.println(localDateTime.minusHours(hours).plusMinutes(minutes));
    }
}