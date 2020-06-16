import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int dayOfYear = scanner.nextInt();
        int day1 = scanner.nextInt();
        int day2 = scanner.nextInt();


        System.out.println(LocalDate.ofYearDay(year, dayOfYear));// put your code here
        System.out.println(LocalDate.ofYearDay(year, day1));// put your code here
        System.out.println(LocalDate.ofYearDay(year,day2));// put your code here
    }
}