import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int lastDay = scanner.nextInt();
        System.out.println(LocalDate.of(year, month, 1).plusMonths(1).minusDays(lastDay));

        // put your code here
    }
}