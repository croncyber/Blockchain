import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CharSequence text = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        int hours = scanner.nextInt();
        int minute = scanner.nextInt();
        LocalTime localTime = LocalTime.parse(text, formatter);
        System.out.println(localTime.minusHours(hours).minusMinutes(minute));

        // put your code here
    }
}