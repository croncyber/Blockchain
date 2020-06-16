import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int year = scanner.nextInt();
       int month = scanner.nextInt();

        System.out.print(LocalDate.of(year, month, 1)+" ");
        System.out.print(LocalDate.of(year, month, LocalDate.of(year, month, 1).lengthOfMonth())+" ");
    }
}