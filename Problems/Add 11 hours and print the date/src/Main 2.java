import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateTime = scanner.nextLine();
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime);

        System.out.println(localDateTime.plusHours(11).toLocalDate());
    }
}